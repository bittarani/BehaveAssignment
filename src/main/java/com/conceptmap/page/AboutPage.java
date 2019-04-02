package com.conceptmap.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.conceptmap.base.BasePage;

public class AboutPage extends BasePage {
	
	/**
	    * All WebElements are identified by @FindBy Annotation
	*/
	
	@FindBy(xpath = "//a[contains(text(),'About')]")
	WebElement aboutLink;
	
	@FindBy(css = "a[title='About The Conversation']")
	WebElement conversationLink;
	
	@FindBy(xpath = "//a[contains(text(),'Who we are:')]")
	WebElement isTextPresent;
	
	@FindBy(css = "a[href='http://neilprendergast.com/']")
	WebElement neilPrendergastLink;
	
	@FindBy(css = "div[class='description']")
	WebElement isNeilPrendergastLinkClicked;
	
	public AboutPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickOnAboutLink() {
		aboutLink.click();
	}
	
	public boolean isConversationLinkPresent() {
		return conversationLink.isDisplayed();
	}
	
	public boolean clickOnNeilPrendergastLink() {
		neilPrendergastLink.click();
		return isNeilPrendergastLinkClicked.isDisplayed();
		
	}
}
