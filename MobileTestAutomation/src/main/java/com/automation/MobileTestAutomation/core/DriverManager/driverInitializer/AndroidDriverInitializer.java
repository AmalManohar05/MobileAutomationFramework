package com.automation.MobileTestAutomation.core.DriverManager.driverInitializer;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AndroidDriverInitializer implements DriverInitializer {

	@Override
	public AndroidDriver initializeDriver(String deviceName, String appPath, URL remoteAddress) {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName(deviceName);
		options.setApp(appPath);
		return new AndroidDriver(remoteAddress, options);
	}
}
