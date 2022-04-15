package com.sauceDemo.TESTclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.loginPage;

public class TC01LoginFunctionality extends baseTestClass {

		@Test(priority=1)
		public void VerifyLogInFunctionality() {
		
		String expectedHomePageUrl = "https://www.saucedemo.com/inventory.html";

		String actualHomePageUrl = driver.getCurrentUrl();

		Assert.assertEquals(actualHomePageUrl, expectedHomePageUrl);
 		


	}

}
