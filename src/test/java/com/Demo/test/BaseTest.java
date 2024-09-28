package com.Demo.test;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.demo.basicMethods.BasicMethos;

import Driver.Driver;


public class BaseTest extends BasicMethos {

	public BaseTest (){
		
	}
	
	@BeforeMethod
	
	protected static void SetUp() throws Exception {
		Driver.initDriver(null);
		
	}
	@AfterMethod
	protected static void tearDown() {
		Driver.CloseDriver();

	}
}
