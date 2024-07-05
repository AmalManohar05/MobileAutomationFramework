package com.automation.MobileTestAutomation.base;

import java.net.URI;
import com.automation.MobileTestAutomation.core.DriverManager.driverFactory.AndroidDriverFactory;
import io.appium.java_client.android.AndroidDriver;

public class Base {
	public static AndroidDriver driver;

	public void driverSetup() {
		try {
			driver = new AndroidDriverFactory().getDriver().initializeDriver("AmalsPhone",
					"E://APKFiles//APKFiles//resources//General-Store.apk",
					new URI("http://192.168.80.95:4723").toURL());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
