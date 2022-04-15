package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage {

private WebDriver driver;
	
	public cartPage(WebDriver driver) 
	{
	   this.driver = driver;
	   
	   PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkout;
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement backToShop;
	
	public void checkOut()
	{
		checkout.click();
		System.out.println("* Product Checkout is successful");
	}
	
	public void continueShopping()
	{
		backToShop.click();
		System.out.println("* Back to shopping");
	}

}
