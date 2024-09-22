package com.Demo.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.DataProvider.DataProviderMethods;
import com.demo.DriverManager.DriverManager;

import PageObject.PageObject_LoginPage;



public final class  LoginPage extends BaseTest{
	
	public static String UserName;
	public static String Password;
	PageObject_LoginPage LoginPage;
	private LoginPage() {
	}
	
	@Test(priority = 1, dataProvider = "readExcelData", dataProviderClass = DataProviderMethods.class)
	public void GetUserCredential(Map<String, String> credentials) throws InterruptedException {	
		 String name = credentials.get("Name");
		    String password = credentials.get("Password");
		    
		 LoginPage=new PageObject_LoginPage(DriverManager.getDriver())
	      .Get_Password(0)
	     .Add_UserName(name, 0)
		 .Add_Password(20);
		
		 
		 
		 LoginPage.Click_On_LoginButton();
		 String LabelPresent =LoginPage.Get_LabelText(10);
		 Assert.assertEquals("Swag Labs", LabelPresent);
		
	}
	
	
}
