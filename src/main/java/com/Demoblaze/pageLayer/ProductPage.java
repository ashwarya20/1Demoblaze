package com.Demoblaze.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	WebDriver driver;
	public ProductPage(WebDriver driver) {
		
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "//a[contains(text(),'Add to cart')]")private WebElement add_cart_product; 
	@FindBy (xpath="//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")private WebElement click_home;
	@FindBy(xpath = "//a[contains(text(),'Laptops')]")private WebElement Laptop_click; 
	@FindBy(xpath = "//a[contains(text(),'Dell i7 8gb')]")private WebElement Laptop_click_product; 
	@FindBy(xpath = "//a[contains(text(),'Add to cart')]")private WebElement Laptop_product_addcart; 
	@FindBy(xpath = "//a[contains(text(),'Monitors')]")private WebElement click_monitor; 
	@FindBy(xpath = "//a[contains(text(),'ASUS Full HD')]")private WebElement click_monito_product; 
	@FindBy(xpath = "//a[contains(text(),'Add to cart')]")private WebElement monitorproduct_addcart; 

	
	

   public void clickOnaddToCart(){
		
	   add_cart_product.click();
   }
   public void popup() {
	   
	   driver.switchTo().alert().accept();
   }
   public void clickOnHome() {
		  
	   click_home.click();
	}
   public void clickOnLaptopo() {
		  
	   Laptop_click.click();
	}
   public void clickLapProduct() {
	   Laptop_click_product.click();
   }
   public void clickAddCartLaptop() {
	   
	   Laptop_product_addcart.click();
   }
   public void clickOnMonitor() {
	   click_monitor.click();
   }
   public void clickMonitorProduct() {
	   click_monito_product.click();
   }
   public void addCartMonitorProduct() {
	   monitorproduct_addcart .click();
   }
   
   
	 
  
}
