package com.conceptmap.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.conceptmap.page.LocationsPage;

public class LocationPageTest extends TestBasePage {
	
	LocationsPage locationPage;

	@BeforeTest
	public void setUp() {
		initialization();
		locationPage = PageFactory.initElements(driver, LocationsPage.class);
	}
	
	@AfterTest
	public void shutDownPage() {
		driver.close();
	}
	
	//verify the Location Page is displayed
	
	@Test(priority = 1)
	public void verifyLocationLink() {
		locationPage.clickOnLocationLink();
		Assert.assertTrue(locationPage.isLeafletLinkPresent());
	}
}
