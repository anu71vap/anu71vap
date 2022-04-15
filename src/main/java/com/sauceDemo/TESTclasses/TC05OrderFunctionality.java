package com.sauceDemo.TESTclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.cartPage;
import com.sauceDemo.POMClasses.homePage;
import com.sauceDemo.POMClasses.loginPage;
import com.sauceDemo.POMClasses.orderPage;
import com.sauceDemo.POMClasses.checkOutPage;

public class TC05OrderFunctionality extends baseTestClass {

	@Test(priority=5)
	public void VerifyOrderFunctionality()  {
		
		homePage hp = new homePage(driver);
		
		hp.dropDownClick();
		hp.addToCart();
		hp.cartbtn();
		
		cartPage cp = new cartPage(driver);
		
		cp.checkOut();
		
		checkOutPage cop = new checkOutPage(driver);
		
		cop.firstName();
		cop.lastName();
		cop.pinCode();
		cop.subMit();
		
		String expectedbuyPageUrl = "https://www.saucedemo.com/checkout-step-two.html";

		String actualbuyPageUrl = driver.getCurrentUrl();

		Assert.assertEquals(actualbuyPageUrl, expectedbuyPageUrl);
		
		orderPage opg = new orderPage(driver);
		opg.orderCancel();
		

	}

}
