package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.demo.basicMethods.BasicMethos;


public class PageObject_LoginPage extends BasicMethos{
	
	private WebDriver driver;
	
	private By Get_FullPasswordText=By.xpath("//*[@data-test='login-password']");
	private By UserName=By.xpath("//input[@id='user-name']");
	private By Password=By.xpath("//input[@id='password']");
	private By Login_Button=By.xpath("//input[@id='login-button']");
	private By AppLogo=By.xpath("//div[contains(@class,'app_logo')]");
	
	
	public static String GP_Password;
	
	public PageObject_LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
		
	}
	public PageObject_LoginPage Get_Password(int Wait) {
		
		String FullPasswordText= GetText(Get_FullPasswordText,Wait);
		 String[] PasswordArray = FullPasswordText.split(":");
		 GP_Password =PasswordArray[1]; 
		 return this;
    }

    public PageObject_LoginPage Add_UserName(String mailiID, int wait) {
    	SendKeys(UserName,wait,mailiID);
    	 return this;
    }

    public PageObject_LoginPage Add_Password(int wait) {
    	SendKeys(Password,wait,GP_Password);
    	return this;
    }
	
    public  HomePage  Click_On_LoginButton() {
    	 click(Login_Button,10);
    	 return new HomePage();
    	
    }
	
   public String Get_LabelText(int Wait) throws InterruptedException {
		

	 String LabelPresent=GetText(AppLogo,10);
	 
	 return LabelPresent;
	 

   
	
	
}
}
