package com.sauceDemo.TESTclasses;


import org.testng.annotations.Test;
import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.orderPage;
import com.sauceDemo.UtilityClasses.screenshot;
import com.sauceDemo.POMClasses.cartPage;
import com.sauceDemo.POMClasses.checkOutPage;
import com.sauceDemo.POMClasses.homePage;
import com.sauceDemo.POMClasses.loginPage;


public class TC06ItemBuyComplete extends baseTestClass {
	
	
		@Test(priority=6)
		public void VerifyOrderPlacedFunctionality() 
		{
	
		homePage hp = new homePage(driver);
		
		hp.dropDownClick();
		hp.addToCart();
		hp.cartbtn();
		
	//	screenshot.takeScreenshot(driver);
		
		cartPage cp = new cartPage(driver);
		
		cp.checkOut();
	//	screenshot.takeScreenshot(driver);
		
		checkOutPage cop = new checkOutPage(driver);
		
		cop.firstName();
		cop.lastName();
		cop.pinCode();
		//screenshot.takeScreenshot(driver);
		cop.subMit();
		
		orderPage op = new orderPage(driver);
		
		op.buyItem();
		
		//screenshot.takeScreenshot(driver);
		
		String expectedcompletePageUrl = "https://www.saucedemo.com/checkout-complete.html";

		String actualcompletePageUrl = driver.getCurrentUrl();

		Assert.assertEquals(actualcompletePageUrl, expectedcompletePageUrl);
		
		orderPage opg = new orderPage(driver);
		op.backHome();
	}
		
		
	

}
