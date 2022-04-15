package com.sauceDemo.TESTclasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauceDemo.POMClasses.homePage;
import com.sauceDemo.POMClasses.loginPage;

public class baseTestClass {
		
	WebDriver driver;
	Logger log;
		
	    @Parameters("browserName")
		@BeforeClass
		public  void openBrowser(String browserName) throws IOException {
	    	
	    	log = Logger.getLogger("SauceDemo-Velocity-V1");
	    	PropertyConfigurator.configure("log4j.properties");
		
			if (browserName.equals("chrome")) 
			{
				
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

		   driver = new ChromeDriver();
		   
		   log.info("* Chrome Browser is opened");
			}
			
			else if (browserName.equals("firefox")) {
				
				 System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");

				  driver = new FirefoxDriver();
				  
				  log.info("* Firefox Browser is opened");

			}
			else {
				log.info("set browser parameter");
			}

			driver.manage().window().maximize();

			driver.get("https://www.saucedemo.com/")
			;
			log.info("* URL is opened");
			
		//	screenshot.takeScreenshot(driver);

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}

			@BeforeMethod
			
			public void setUpMethod() {
				
			loginPage login = new loginPage(driver);

			login.sendUserName();
			login.sendPassword();
			login.clickLoginButton();
			
		//	screenshot.takeScreenshot(driver);
			}
			
			@AfterMethod
			public void tierDownMethod() 
			{
			homePage hp = new homePage(driver);
			hp.clickMenu();
			hp.logOut();
		//	screenshot.takeScreenshot(driver)
			
			}
			@AfterClass
			public void closeBrowser() 
			{
			driver.quit();
			}
	

}
