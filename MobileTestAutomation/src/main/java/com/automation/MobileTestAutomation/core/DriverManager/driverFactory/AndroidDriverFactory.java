package com.automation.MobileTestAutomation.core.DriverManager.driverFactory;

import com.automation.MobileTestAutomation.core.DriverManager.driverInitializer.AndroidDriverInitializer;
import com.automation.MobileTestAutomation.core.DriverManager.driverInitializer.DriverInitializer;

public class AndroidDriverFactory implements DriverManagerFactory{

	@Override
	public DriverInitializer getDriver() {
		return new AndroidDriverInitializer();
	}

}
