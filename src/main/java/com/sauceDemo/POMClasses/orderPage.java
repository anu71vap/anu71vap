package com.sauceDemo.POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderPage {

private WebDriver driver;
	
	public orderPage(WebDriver driver) 
	{
	   this.driver = driver;
	   
	   PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id='finish']")
	private WebElement finish;
	
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement cancelorder;
	
	@FindBy(xpath="//button[@id='back-to-products']")
	private WebElement backhome;
	
	public void buyItem()
	{
		finish.click();
		System.out.println("* Order Successfully Placed");
		
		System.out.println();
		System.out.println("Status - "+driver.findElement(By.xpath("//h2[@class='complete-header']")).getText());
		System.out.println();
	}
	
	public void backHome()
	{
		backhome.click();
		System.out.println();
		System.out.println("* Back to HomePage");
		
	}
	
	public void orderCancel()
	{
		cancelorder.click();
		
		System.out.println("* Cancel the order");
		
	}

}
