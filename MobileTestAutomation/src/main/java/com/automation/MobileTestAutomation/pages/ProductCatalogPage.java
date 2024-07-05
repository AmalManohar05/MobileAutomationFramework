package com.automation.MobileTestAutomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.automation.MobileTestAutomation.Utilities.WaitHelper;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import utilities.WaitHelpers;

public class ProductCatalogPage {
	AndroidDriver driver;

	public ProductCatalogPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[1]")
	private WebElement AddToCartButtonOfFirstProduct;

	public void clickOnAddToCartButtonForFirstProductInProductCatalogPage() {
		WaitHelper.waitForElementIsVisible(AddToCartButtonOfFirstProduct);
		AddToCartButtonOfFirstProduct.click();
	}
}
