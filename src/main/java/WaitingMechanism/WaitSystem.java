package WaitingMechanism;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.DriverManager.DriverManager;

public class WaitSystem {
	
	WebElement element =null;
	protected  WebElement WaitSystem_ElementToBeClicable (By by, int WaitForElementToLoad) {
		
		element= new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(WaitForElementToLoad)).until(ExpectedConditions.elementToBeClickable(by)).findElement(by);
		return element;
	}
	
protected  WebElement WaitSystem_visibilityOfElementLocated(By by, int WaitForElementToLoad) {
		
		element= new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(WaitForElementToLoad)).until(ExpectedConditions.visibilityOfElementLocated(by)).findElement(by);
		return element;
	}

}
