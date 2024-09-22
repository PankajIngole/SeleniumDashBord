package com.demo.basicMethods;


import org.openqa.selenium.By;


import WaitingMechanism.WaitSystem;



public class BasicMethos extends WaitSystem{
	
	
	protected void click(By login_Button, int WaitForElementToLoad) {

		WaitSystem_ElementToBeClicable(login_Button,WaitForElementToLoad).click();
	
	}
	
	protected void SendKeys(By userName, int WaitForElementToLoad, String Text) {

		WaitSystem_ElementToBeClicable(userName,WaitForElementToLoad).sendKeys(Text);
	}
	protected String GetText(By get_FullPasswordText, int WaitForElementToLoad) {

		return WaitSystem_ElementToBeClicable(get_FullPasswordText,WaitForElementToLoad).getText();
	}


}
