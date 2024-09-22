package com.Demo.test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.DriverManager.DriverManager;

import PageObject.PageObject_LoginPage;




public final class  LoginPage2 extends BaseTest{
	public static String UserName;
	public static String Password;
	PageObject_LoginPage LoginPage;
	
	private LoginPage2() {
		
	}
	
	@Test(priority = 1)
	public void GetUserCredential() throws InterruptedException {		
	
		 LoginPage=new PageObject_LoginPage(DriverManager.getDriver())
			      .Get_Password(0)
			     .Add_UserName("standard_user", 0)
				 .Add_Password(20);
				
				 
				 
				 LoginPage.Click_On_LoginButton();
				 String LabelPresent =LoginPage.Get_LabelText(10);
				 Assert.assertEquals("Swag Labs", LabelPresent);
				
			}
		 
	

	
}
