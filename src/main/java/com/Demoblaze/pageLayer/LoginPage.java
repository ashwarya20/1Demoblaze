package com.Demoblaze.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "//input[@id='loginusername']")private WebElement username; 
	@FindBy(xpath = "//input[@id='loginpassword']")private WebElement password; 
	@FindBy(xpath = "//button[contains(text(),'Log in')]")private WebElement click_login; 
	@FindBy(xpath = "//a[contains(text(),'Samsung galaxy s6')]")private WebElement pro; 

public void enterUsername(String name) {
		
		username.sendKeys(name);
	}
public void enterPassword(String pass) {
		
		password.sendKeys(pass);
	}
	public void clickOnLogin() {
		
		click_login.click();
	}
public void clickOnproduct() {
		
		pro.click();
	}
	
	
	
}
