package org.auntor.Util;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class Common {
    public static void closeAppSplashScreen(AppiumDriver driver){
        driver.findElement(By.id("com.daffodilvarsity.diu:id/tv_dismiss")).click();
    }
    public static void scrollingAndSwapping(AppiumDriver driver, double startXPercentage, double endXPercentage, double startYPercentage, double endYPercentage){
        Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();

        int startX = (int)(width*startXPercentage);
        int endX = (int)(width*endXPercentage);
        int startY = (int)(height*startYPercentage);
        int endY =(int)(height*endYPercentage);

        TouchAction action = new TouchAction((PerformsTouchActions) driver);
        action.press(PointOption.point(startX,startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(endX,endY))
                .release()
                .perform();
    }

    public static void scrollToView(AppiumDriver driver,String text) {
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"))"));
    }


}
