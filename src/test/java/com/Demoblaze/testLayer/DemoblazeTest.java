package com.Demoblaze.testLayer;

import org.testng.annotations.Test;

import com.Demoblaze.TestBase.TestBase;
import com.Demoblaze.pageLayer.HomePage;
import com.Demoblaze.pageLayer.LoginPage;
import com.Demoblaze.pageLayer.ProductPage;

import bsh.util.Util;

public class DemoblazeTest extends TestBase {

	@Test
	public void HomePageFun() throws InterruptedException {
		 HomePage hm = new  HomePage(driver);
		   hm.clickOnALogin();
		   
		   LoginPage login = new LoginPage(driver);
		   login.enterUsername("Test20");
		   login.enterPassword("test");
		   login.clickOnLogin();
		   
		   Thread.sleep(3000);
		   login.clickOnproduct();
		   
		  ProductPage add_cart = new ProductPage(driver);
		  add_cart.clickOnaddToCart();
		  Thread.sleep(3000);
		  add_cart.popup();
		  add_cart.clickOnHome();
	     add_cart.clickOnLaptopo();
		 add_cart.clickLapProduct(); 
		 add_cart.clickAddCartLaptop(); 
		 Thread.sleep(3000);
		 add_cart.popup();
		  add_cart.clickOnHome();
		 add_cart.clickOnMonitor();
		 add_cart.clickMonitorProduct();
		 add_cart.addCartMonitorProduct();
		 Thread.sleep(3000);
		  add_cart.popup();
		 
	}
	
}
