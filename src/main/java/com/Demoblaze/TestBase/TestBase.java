package com.Demoblaze.TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase {
	 public static WebDriver driver;
	 @BeforeMethod
	public void setUp() {
		
		String b = "Chrome";
		
		if(b.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
		else if(b.equalsIgnoreCase("Firefox")) {
			driver  =  new FirefoxDriver();
		}
		else if(b.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("please provide valid browser name");
		}
		
		driver.get("https://www.demoblaze.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	}
	 @AfterMethod
	public void quitMeth() {
		//driver.quit();
	}
}
