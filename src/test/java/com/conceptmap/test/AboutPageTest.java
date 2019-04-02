package com.conceptmap.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.conceptmap.page.AboutPage;


public class AboutPageTest extends TestBasePage {
	AboutPage aboutPage;
	
	
	@BeforeTest
	public void setUp() {
		initialization();
		aboutPage = PageFactory.initElements(driver, AboutPage.class);
	}
	
	@AfterTest
	public void shutDownPage() {
		driver.close();
	}
	
	/**

     * This test go to http://www.findtheconversation.com/about-the-conversation/
     
     * Display the about Page
    
     * Verify the "NeilPrendergast" link
    
     */
	
	@Test(priority = 1)
	public void verifyAboutLinkTest() {
		aboutPage.clickOnAboutLink();
		Assert.assertTrue(aboutPage.isConversationLinkPresent());
	}
	
	@Test(priority = 2)
	public void verifyNeilPrendergastLinkTest() {
		Assert.assertTrue(aboutPage.clickOnNeilPrendergastLink());
		driver.navigate().back();
	}
}
