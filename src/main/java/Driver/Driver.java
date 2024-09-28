package Driver;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.demo.DriverManager.DriverManager;

import FrameworkConstrant.FrameWorkConstant;

public final class Driver {
	
	
	public static WebDriverWait wait;
	public static String ReadURL_FromConfig;
	
	private Driver() {
		
	}

	
	 @SuppressWarnings("deprecation")
	 
	public static void initDriver(String browserName) throws IOException {
		 
		 String browser =System.getProperty("+");
		 System.out.println(browser);
		 
		 
		 if (Objects.isNull(browser)) {
			 if(Objects.isNull(DriverManager.getDriver())) {
			 System.setProperty("webdriver.chrome.driver", FrameWorkConstant.getChromeDriverPath());
			 
				DriverManager.setDriver(new ChromeDriver());
		 }
		 
		 }
		 
		 
		 
		 
		 else if(browser.contains("Chrome")  ) {
		
		 if(Objects.isNull(DriverManager.getDriver())) {
			 
		 System.setProperty("webdriver.chrome.driver", FrameWorkConstant.getChromeDriverPath());
		 
			DriverManager.setDriver(new ChromeDriver());
			
		 }
		 
		 } 
		 
		
		 else {
			 
			 if(Objects.isNull(DriverManager.getDriver())) {
			 System.setProperty("webdriver.edge.driver", FrameWorkConstant.getEdgeDriverPath());
			 
				DriverManager.setDriver(new EdgeDriver());
			 
		 }}
		 
		 DriverManager.getDriver().manage().window().maximize();
			DriverManager.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			DriverManager.getDriver().get(FrameWorkConstant.getCApplicationURL());
			
		 
		 }
		 
		 
		
		 
		 
	 
	 
	 
     public static void CloseDriver() {
    	 if(Objects.nonNull(DriverManager.getDriver())) {
    		 DriverManager.getDriver().close();
    		 DriverManager.unload();
		 
    	 }
	 }

}
