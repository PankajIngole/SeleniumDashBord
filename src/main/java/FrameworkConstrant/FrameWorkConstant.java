package FrameworkConstrant;


public class  FrameWorkConstant {
	
		public  FrameWorkConstant() {
			
		}
		
		private static final String ResourcePath= System.getProperty("user.dir")+"/src/test/resources/Executeble/";
		private static final String ChromeDriverPath= ResourcePath+"chromedriver.exe";	
		private static final String ApplicationURL="https://www.saucedemo.com/";
		private static final String ExclePath="C:\\Users\\z004krnn\\Desktop\\AMN\\FrameWorke\\DashBord_Selenium\\src\\main\\resources\\Book1.xlsx";
			
		public static String getChromeDriverPath() {
			
			return ChromeDriverPath;
		}
          public static String getCApplicationURL() {
			
			return ApplicationURL;
		}
          public static String getExclePath() {
  			
  			return ExclePath;
  		}
	}

