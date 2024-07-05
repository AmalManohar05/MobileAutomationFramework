package com.automation.MobileTestAutomation.Utilities;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.MobileTestAutomation.base.Base;


public class WaitHelper extends Base {
	static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

	public static void waitForElementIsVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
