package com.sauceDemo.TESTclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.cartPage;
import com.sauceDemo.POMClasses.checkOutPage;
import com.sauceDemo.POMClasses.homePage;
import com.sauceDemo.POMClasses.loginPage;

public class TC04checkoutFunctionality extends baseTestClass {

	@Test(priority=4)
	public void VerifyCheckOutFunctionality()  {
		homePage hp = new homePage(driver);
		
		hp.dropDownClick();
		hp.addToCart();
		hp.cartbtn();
		
		cartPage cp = new cartPage(driver);
		
		cp.checkOut();
		
		
		String expectedorderPageUrl = "https://www.saucedemo.com/checkout-step-one.html";

		String actualorderPageUrl = driver.getCurrentUrl();

		Assert.assertEquals(actualorderPageUrl, expectedorderPageUrl);
		
		checkOutPage cpg = new checkOutPage(driver);
		cpg.cancelbtn();
		
		cp.continueShopping();
	}
}
