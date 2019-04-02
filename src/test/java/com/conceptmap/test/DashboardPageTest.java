package com.conceptmap.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.conceptmap.page.DashboardPage;


public class DashboardPageTest extends TestBasePage {
	
	DashboardPage dashboardPage;
	
	@BeforeTest
	public void setUp() {
		initialization();
		//This initElements method will create all WebElements
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	}
	
	@AfterTest
	public void shutDownPage() {
		driver.close();
	}
	
	/**

     * This test class is to go to http://www.findtheconversation.com/concept-map/

     * Click the first episode

     * Display the different nodes

     * Verify the concept page

     */

	
	@Test(priority = 1)
	public void dashboardPageTitleTest() {
		String title = dashboardPage.verifyDashboardPageTitle();
		Assert.assertEquals(title, "Concept map – The Conversation");
	}
	
	@Test(priority = 2)
	public void LogoImageTest() {
		boolean flag = dashboardPage.verifyLogoImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 3)
	public void clickOnJohnFifeLinkTest() {
		Assert.assertTrue(dashboardPage.clickOnFirstEpisode());
	}
	
	@Test(priority = 4)
	public void clickOnCollapseLinkTest() {
		Assert.assertTrue(dashboardPage.isTextPresent());
		driver.navigate().back();
	}
	
	@Test(priority = 5)
	public void clickOnCircleTest() {
		Assert.assertTrue(dashboardPage.clickOnCollapseCircle());	
	}
	 
	@Test(priority = 6)
	public void clickOnMutebuttonTest() {
		dashboardPage.isMuteButtonClicked();
		System.out.println("Music is muted");
	}
	
	@Test(priority = 7)
	public void clickOnZoomInButtonTest() {
		Assert.assertTrue(dashboardPage.isZoominButtonDisplayed());
	}
	
	@Test(priority = 8)
	public void verifyHenryLouisLinkTest() {
		Assert.assertTrue(dashboardPage.verifyTextisDisplayed());
	}
	
	@Test(priority = 9)
	public void clickOnHenryLouisLinkTest() {
		Assert.assertEquals(dashboardPage.isHenryLouisLinkClicked().equalsIgnoreCase("Episode 30: Henry Louis Taylor, Jr."), true);
	}
	
	@Test(priority = 10)
	public void verifyReferenceTextTest() {
		Assert.assertEquals(dashboardPage.isReferencesTextDisplayed().equalsIgnoreCase("References"), true);
	}
	
	@Test(priority = 11)
	public void clickOnzoomOutButtonTest() {
		Assert.assertTrue(dashboardPage.verifyZoomOutButtonField());
	}
	
	@Test(priority = 12)
	public void clickOnCommentButtonFieldTest() {
		Assert.assertTrue(dashboardPage.isCommentfieldClicked());
	}
	
	@Test(priority = 13)
	public void postCommentTest() {
		Assert.assertTrue(dashboardPage.submitComment());
		driver.navigate().back();
	}
    
	@Test(priority = 14)
	public void clickOnLouisImageLinkTest() {
		Assert.assertEquals(dashboardPage.verifyLoiusImageLink().equalsIgnoreCase("concept map"), true);
	}
}
