package org.auntor.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Config {


	Properties pro;
	File src = new File(System.getProperty("user.dir") +"/src/main/java/org/auntor/Configuration/config.properties");
	
	public Config() {
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
	}

	
	public String getAppFileName() {
		String app  = pro.getProperty("AppFileName");
		return app;
	}

	public String getDeviceType() {
		String deviceType  = pro.getProperty("TestDeviceType");
		return deviceType;
	}

	public String getDeviceName() {
		String deviceName  = pro.getProperty("TestDeviceName");
		return deviceName;
	}

	public String getDeviceOsVersion() {
		String deviceOsVersion  = pro.getProperty("TestDeviceOsVersion");
		return deviceOsVersion;
	}
	public String getBSUserName() {
		String bsUserName  = pro.getProperty("BSUsername");
		return bsUserName;
	}
	public String getBSKey() {
		String bsKey  = pro.getProperty("BSKey");
		return bsKey;
	}

	public String getBSDIUSmartAppKey() {
		String bsAppKey  = pro.getProperty("BSDIUSmartAppKey");
		return bsAppKey;
	}









}
