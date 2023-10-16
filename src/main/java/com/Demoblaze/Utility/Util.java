package com.Demoblaze.Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Demoblaze.TestBase.TestBase;

public class Util extends TestBase {
	
	  public void popup() {
	  
		  driver.switchTo().alert().accept();

	  }
	
}
