package com.automation.MobileTestAutomation.core.DriverManager.driverFactory;

import com.automation.MobileTestAutomation.core.DriverManager.driverInitializer.DriverInitializer;

public interface DriverManagerFactory {
	DriverInitializer getDriver();
}
