package com.conceptmap.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBasePage {

	protected static WebDriver driver;
	protected static Properties prop;

	public TestBasePage() {
		try {
			prop = new Properties();
			FileInputStream input = new FileInputStream("./config/config.properties");
			prop.load(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

    public static void initialization() {
		
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			// Since there is a known issue for driver mismatch, I've setup driver from project folder.
			// WebDriverManager.chromedriver().setup(); 
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		    driver = new ChromeDriver();
	    } else if(browserName.equals("Firefox")) {
			// Since there is a known issue for driver mismatch, I've setup driver from project folder.
	    	// WebDriverManager.firefoxdriver().setup();
	    	System.setProperty("webdriver.FirefoxDriver.driver", "./drivers/geckodriver-v0.23.0-win64/geckodriver.exe");

		    driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(1, document.body.scrollHeight)");
		
	}
}
