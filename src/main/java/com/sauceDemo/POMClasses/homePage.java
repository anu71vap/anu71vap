package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class homePage {


	private WebDriver driver;
	//private Actions act;
	private Select s;

	public homePage(WebDriver driver) 
	{
	   this.driver = driver;
	   
	   PageFactory.initElements(driver, this);
	//   act = new Actions(driver);
		s = new Select(sortDropDown);

	}
	
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement menu;
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement sortDropDown;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	private WebElement tshirtbuy;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cart;
	
	
	public void clickMenu()
	{
		menu.click();
	//	act.click(menu).perform();
		System.out.println("* Menu is opened");
		
	}
	
	public void dropDownClick()
	{
		sortDropDown.click();
		s.selectByValue("hilo");
		System.out.println("* Sorted by price High to Low");
	}
	
	public void logOut()
	{
		logout.click();
		System.out.println("* Logout Successfully");
	}
	
	public void addToCart()
	{
		tshirtbuy.click();
		System.out.println("* T-Shirt is added to cart");
	}
	
	public void cartbtn()
	{
		cart.click();
		System.out.println("* Cart is opened");
	}

}
