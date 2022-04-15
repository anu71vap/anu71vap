package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	private WebDriver driver;
	
	public loginPage(WebDriver driver) 
	{
	   this.driver = driver;
	   
	   PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input [@class = 'input_error form_input'])[1]")
	private WebElement userName;

	@FindBy(xpath="(//input [@class = 'input_error form_input'])[2]")
	private WebElement password;

	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginButton;
	
	public void sendUserName()
	{
	  userName.sendKeys("standard_user");
	  System.out.println("* Username Entered");
	}
	
	public void sendPassword()
	{
	  password.sendKeys("secret_sauce");
	  System.out.println("* Password Entered");
	}
	
	public void clickLoginButton()
	{
	   loginButton.click();
	   System.out.println("* Login Successfully");
	}

}
