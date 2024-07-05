package com.automation.MobileTestAutomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.automation.MobileTestAutomation.Utilities.WaitHelper;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FormPage {
	AndroidDriver driver;

	public FormPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
	private WebElement NameFieldInFormPage;

	@AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
	private WebElement LetsShopButtonInFormPage;

	public void enterNameInNameFieldOfFormPage(String name) {
		WaitHelper.waitForElementIsVisible(NameFieldInFormPage);
		NameFieldInFormPage.sendKeys(name);
	}

	public void clickOnLetsShopButtonFormPage() {
		WaitHelper.waitForElementIsVisible(LetsShopButtonInFormPage);
		LetsShopButtonInFormPage.click();
	}
}
