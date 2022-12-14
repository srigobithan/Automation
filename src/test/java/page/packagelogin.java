package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class packagelogin {

//			@FindBy(xpath  = "//*[@id=\"email\"]")
//			public static WebElement username;
//			
//			@FindBy(xpath  = "//*[@id=\"password\"]")
//			public static WebElement password;
//			
//			@FindBy(id  = "//*[@id=\"mui-4\"]")
//			public static WebElement loginbutton;
	
			@FindBy(id  = "email")
			public static WebElement username;
			
			@FindBy(id  = "password")
			public static WebElement password;
			
    		@FindBy(id  = "mui-1" )
			public static WebElement loginbutton;
    		
    		@FindBy(xpath = "/html/body/div[2]/div[3]/div[2]/button")
    		public static WebElement signout;
}
