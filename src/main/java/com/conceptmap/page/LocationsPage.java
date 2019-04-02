package com.conceptmap.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.conceptmap.base.BasePage;

public class LocationsPage extends BasePage {
	
	@FindBy(xpath = "//a[contains(text(),'Locations')]")
	WebElement locationlink;
	
	@FindBy(css = "a[href='http://leafletjs.com']")
	WebElement leafletLink;

	public LocationsPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickOnLocationLink() { 
		locationlink.click();
	}
	
	public boolean isLeafletLinkPresent() {
		return leafletLink.isDisplayed();
	}

}
