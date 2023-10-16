package com.Demoblaze.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "//a[@id='login2']")private WebElement login; 
	
	
	public void clickOnALogin() {
		
		login.click();
	}
	
	
}
