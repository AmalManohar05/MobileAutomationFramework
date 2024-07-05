package com.automation.MobileTestAutomation.core.DriverManager.driverInitializer;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

public interface DriverInitializer {
	AndroidDriver initializeDriver(String deviceName, String appPath, URL remoteAddress);
}
