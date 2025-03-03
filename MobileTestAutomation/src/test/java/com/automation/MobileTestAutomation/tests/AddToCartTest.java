package com.automation.MobileTestAutomation.tests;

import org.testng.annotations.Test;
import com.automation.MobileTestAutomation.base.Base;
import com.automation.MobileTestAutomation.pages.FormPage;
import com.automation.MobileTestAutomation.pages.ProductCatalogPage;
import testData.TestData;

public class AddToCartTest extends Base {
	FormPage formPage;
	ProductCatalogPage productCatalogPage;

	public AddToCartTest() {
		driverSetup();
		formPage = new FormPage(driver);
		productCatalogPage = new ProductCatalogPage(driver);
	}

	@Test
	public void testTrigger() throws Exception {
		formPage.enterNameInNameFieldOfFormPage(TestData.customerNameAsAmal);
		formPage.clickOnLetsShopButtonFormPage();
		productCatalogPage.clickOnAddToCartButtonForFirstProductInProductCatalogPage();
	}
}
