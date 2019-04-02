package com.conceptmap.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.conceptmap.page.BlogPage;

public class BlogPageTest extends TestBasePage {
	
	BlogPage blogPage;
	
	
	@BeforeTest
	public void setUp() {
		initialization();
		blogPage = PageFactory.initElements(driver, BlogPage.class);
	}
	
	@AfterTest
	public void shutDownPage() {
		driver.close();
	}
	
	/**

     * This test go to http://www.findtheconversation.com/category/blog/
     
     * Display the Blog Page
    
     * Verify the "FiscallySponsored" link
    
     */
	
	@Test(priority = 1)
	public void verifyBlogLinkTest() {
		blogPage.clickOnBlogLink();
		Assert.assertTrue(blogPage.isFiscallySponsoredLinkPresent());
	}
	
	@Test(priority = 2)
	public void clickOnFiscallySponsoredLink() {
		blogPage.verifyLink();
		Assert.assertTrue(blogPage.isAuthorLinkPresent());
	}
	
}
