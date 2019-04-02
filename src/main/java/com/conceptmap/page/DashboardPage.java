package com.conceptmap.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.conceptmap.base.BasePage;

public class DashboardPage extends BasePage {
	
	/**
	    * All WebElements are identified by @FindBy Annotation
	*/
	
	@FindBy(css = "img[class='logo']")
	WebElement logo;
	
	@FindBy(xpath = "//a[contains(text(),'concept map')]")
	WebElement conceptMaplink;
	
	@FindBy(xpath = "//a[contains(text(),'Locations')]")
	WebElement locationLink;
	
	@FindBy(xpath = "//a[contains(text(),'About')]")
	WebElement aboutLink;
	
	@FindBy(css = "#graph > svg > g > g.episodes > g:nth-child(1) > text")
	WebElement firstEpisode; 
	
	@FindBy(xpath = "//a[contains(text(),'John Fife')]")
	WebElement ReverendJohnFifeLink ;
	
	@FindBy(css = "g[transform='translate(73.47315653655915,-101.12712429686843)rotate(-54)']")
	WebElement collapseLink ;
	
	@FindBy(css = "#graph > svg > g > g.nodes > g:nth-child(2) > text.label")
	WebElement collapseCircle;
	
	//Image of JohnFife
	@FindBy(css = "img[alt='Episode 1: John Fife']")
	WebElement johnFifeimage;
	
	@FindBy(css = "button[title='Play/Pause']")
	WebElement playButtonfield;
	
	@FindBy(css = "span[style='width: 21.7443px;']")
	WebElement scrolBar;
	
	@FindBy(css = "button[title='Mute Toggle']")
	WebElement muteButton;
	
	//To zoom the image
	@FindBy(css = "a[title='Zoom in']")
	WebElement zoomInButton;
	
	@FindBy(css = "#references > ul:nth-child(8) > li:nth-child(3) > span > a")
	WebElement HenryLouisLink;
	
	@FindBy(css = "#references > h3:nth-child(7)")
	WebElement text;
	
	//To verify if the HenryLouisLink is clicked;
	@FindBy(css = "a[rel='bookmark']")
	WebElement verifyHenryLink;
	
	@FindBy(css = "a[title='Zoom out']")
	WebElement zoomOutButton;
	
	@FindBy(css = "img.leaflet-tile.leaflet-tile-loaded")
	WebElement DunkirkMap;
	
	@FindBy(xpath = "//a[contains(text(),'Show comments')]")
	WebElement commentButton;
	
	@FindBy(css = "a[title='Log in']")
	WebElement loginLink;
	
	@FindBy(css = "a[title='Powered by WordPress']")
	WebElement loginPage;
	
	@FindBy(css = "#comments-number > span")
	WebElement commentResponse;
	
	@FindBy(css = "img[alt='Henry Louis Taylor, Jr.']")
	WebElement imageLink;
	
	@FindBy(css = "h2#references-header")
	WebElement referencesText;
	
	//Initializing the Page Objects
	
	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	public String verifyDashboardPageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyLogoImage() {
		return logo.isDisplayed();
	}
	
	public boolean clickOnFirstEpisode() {
		firstEpisode.click();
		return ReverendJohnFifeLink.isDisplayed();
	}
	
	public boolean isTextPresent() {
		collapseLink.click();
		return collapseCircle.isDisplayed();	
	}
	
	public boolean clickOnCollapseCircle() {
		collapseCircle.click();
		return johnFifeimage.isDisplayed();
	}
	
	public void isPlayButtonClicked() {
		playButtonfield.click();
	}
	public boolean isPlaybuttonClicked() {
		return scrolBar.isDisplayed();
	}
	
	public void isMuteButtonClicked() {
		muteButton.click();
	}
	
	//To check if the zoom in Button is displayed
	
	public boolean isZoominButtonDisplayed() {
		return zoomInButton.isDisplayed();
	}
	
	//To verify if the "Theories and Concepts" is displayed 
	
	public boolean verifyTextisDisplayed() {
		return text.isDisplayed();
	}
	// To check if the HenryLouisLink is clicked
	
	public String isHenryLouisLinkClicked() {
		HenryLouisLink.click();
		return verifyHenryLink.getText();
	}
	
	// verify Zoom-out button is clicked
	
	public boolean verifyZoomOutButtonField() {
		zoomOutButton.click();
		return DunkirkMap.isDisplayed();
	}
	// comment field is clicked
	
	public boolean isCommentfieldClicked() {
		commentButton.click();
		return commentResponse.isDisplayed();
	}
	// verify to post a comment
	
	public boolean submitComment() {
		loginLink.click();
		return loginPage.isDisplayed();
	}
	// "References" text is visible
	
	public String isReferencesTextDisplayed() {
		return referencesText.getText();
	}
	//click verif0y "Henry" Image link is clicked
	
	public String verifyLoiusImageLink() {
		imageLink.click();
		return conceptMaplink.getText();
	}
	
	
	
	
}
