package org.auntor.Util;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;

import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.time.Duration;


public class BaseClass{
    static Config config = new Config();
    public static AppiumDriver driver;
    public AppiumDriverLocalService service;
    public static final String UserName=config.getBSUserName();
    public static final String Key= config.getBSKey();
    public static final String URL="https://"+UserName+":"+Key+"@hub-cloud.browserstack.com/wd/hub";

    
    @BeforeClass
    public void automationEnvStart() throws IOException {
        if(config.getDeviceType().equals("Simulator")){
            startServer();
            capabilities();
        } else if (config.getDeviceType().equals("BrowserStack")) {
            bsCapabilities();
        }
    }

    @AfterClass
    public void automationEnvStop() {
        if(config.getDeviceType().equals("Simulator")){
            driver.quit();
            service.stop();
        } else if (config.getDeviceType().equals("BrowserStack")) {
            driver.quit();
        }
    }

    @BeforeSuite
    void setAllureEnvironment(){
        //Config config = new Config();
        allureEnvironmentWriter(
                ImmutableMap.<String, String>builder()
                        .put("Test Device Type","ABC")
                        .put("Test Device Name",config.getDeviceName())
                        .put("Test Device Os Version", config.getDeviceOsVersion())
                        .put("Apk Name", config.getAppFileName())
                        .build(), System.getProperty("user.dir")
                        + "/allure-results/");
    }


    public AppiumDriverLocalService startServer() {
        //
        boolean flag = checkIfServerIsRunning(4723);
        if (!flag) {

            service = new AppiumServiceBuilder().usingDriverExecutable(new File("/usr/local/bin/node"))
                    .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                    .withIPAddress("127.0.0.1")
                    .withLogFile(new File("appium.log"))
                    .withTimeout(Duration.ofSeconds(200))
                    .usingPort(4723).build();
            service.start();
        }
        return service;

    }


    public static AppiumDriver capabilities() throws IOException {
        String testAppName = config.getAppFileName();
        String deviceName = config.getDeviceName();
        String deviceOsVersion = config.getDeviceOsVersion();

        XCUITestOptions options = new XCUITestOptions()
                .setDeviceName(deviceName)
                .setPlatformVersion(deviceOsVersion)
                .setApp(System.getProperty("user.dir") + "/src/main/java/org/auntor/TestFile/" + testAppName + ".ipa")
                // wdaLaunchTimeout mean: webdriver agent launch timeout
                .setWdaLaunchTimeout(Duration.ofSeconds(30));

        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        return driver;
    }

    public static AppiumDriver bsCapabilities() throws IOException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName","iPhone 11 Pro");
        caps.setCapability("os_version","15.5");
        caps.setCapability("Project","UiCatalog");
        caps.setCapability("build","1.0");
        caps.setCapability("name","Run UICatalog APP Test Automation in BrowserStack");
        caps.setCapability("app",config.getBSDIUSmartAppKey());

        driver = new AppiumDriver(new URL(URL),caps);

        return driver;
    }

    public static boolean checkIfServerIsRunning(int port) {

        boolean isServerRunning = false;
        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(port);

            serverSocket.close();
        } catch (IOException e) {
            //If control comes here, then it means that the port is in use
            isServerRunning = true;
        } finally {
            serverSocket = null;
        }
        return isServerRunning;
    }




}
