package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkOutPage {

private WebDriver driver;
	
	public checkOutPage(WebDriver driver) 
	{
	   this.driver = driver;
	   
	   PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement pincode;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement submit;
	
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement cancel;
	
	public void firstName()
	{
		firstname.sendKeys("Aniket");
	}
	
	public void lastName()
	{
		lastname.sendKeys("Pagar");
	}
	
	public void pinCode()
	{
		pincode.sendKeys("423203");
	}
	
	public void subMit()
	{
		submit.click();
		System.out.println("* Shipment details are given");
	}
	
	public void cancelbtn()
	{
		cancel.click();
		System.out.println("* cancel the product");
	}

}
