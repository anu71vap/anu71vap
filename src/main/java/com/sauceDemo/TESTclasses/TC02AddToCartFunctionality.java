package com.sauceDemo.TESTclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.cartPage;
import com.sauceDemo.POMClasses.homePage;
import com.sauceDemo.POMClasses.loginPage;

public class TC02AddToCartFunctionality extends baseTestClass {

	@Test(priority=3)
	public void VerifyAddToCartFunctionality() {
		
		homePage hp = new homePage(driver);
		
		hp.dropDownClick();
		hp.addToCart();
		hp.cartbtn();
		
		String expectedText = "1";
		String actualText = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).getText();

        Assert.assertEquals(expectedText,actualText,"item not added");	

		cartPage cp = new cartPage(driver);
		cp.continueShopping();
	}

}
