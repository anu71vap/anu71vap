package com.sauceDemo.TESTclasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import com.sauceDemo.POMClasses.homePage;
import com.sauceDemo.POMClasses.loginPage;

import org.testng.Assert;

public class TC03LogOutFunctionality extends baseTestClass {

	@Test(priority=2)
	public void VerifyLogOutFunctionality()  {
		
		homePage hp = new homePage(driver);
		
		hp.clickMenu();
		hp.logOut();
	
		
        String expectedlogoutPageUrl = "https://www.saucedemo.com/";
 		
 		String actuallogoutPageUrl = driver.getCurrentUrl();
 		//System.out.println(actuallogoutPageUrl);
 	    
 	Assert.assertEquals(actuallogoutPageUrl,expectedlogoutPageUrl);
 	
 		loginPage login = new loginPage(driver);

		login.sendUserName();
		login.sendPassword();
		login.clickLoginButton();

	}

}
