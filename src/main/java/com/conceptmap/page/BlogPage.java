package com.conceptmap.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.conceptmap.test.TestBasePage;

public class BlogPage extends TestBasePage {
	
	/**
	    * All WebElements are identified by @FindBy Annotation
	*/
	
	@FindBy(xpath = "//a[contains(text(),'Blog')]")
	WebElement bloglink;
	
	@FindBy(xpath = "//a[contains(text(),'Fiscally Sponsored')]")
	WebElement fiscallySponsoredLink;
	
	@FindBy(css = "a[class='next page-numbers']")
    WebElement nextLink;
	
	@FindBy(css = "a[href='http://www.findtheconversation.com/author/aengus/']")
	WebElement authorLink;
	
	public boolean isFiscallySponsoredLinkPresent() {
		return fiscallySponsoredLink.isDisplayed();
	}
	
	public void verifyLink() {
		fiscallySponsoredLink.click();
	}
	
	public boolean isAuthorLinkPresent() {
		return authorLink.isDisplayed();
	}
	
	public void clickOnBlogLink() {
		bloglink.click();
	}
}
