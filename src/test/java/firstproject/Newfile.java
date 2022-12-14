package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Newfile {

	public static WebDriver driver;
	
	@BeforeMethod
	public  void main() {
		// TODO Auto-generated method stub
		//Chrome Intialization	1
		System.setProperty("driver.chrome.driver","C:\\Program Files\\chromedriver_selenium\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 //window Maximize
		 driver.manage().window().maximize();
		 driver.get("http://transport-hub-qa-release.com.s3-website.ap-south-1.amazonaws.com/");	
		 
		// another way of declear
		// WebElement username= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/span[1]/input"));
		// username.sendKeys("user");
				
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/span[1]/input")).sendKeys("user");	
//		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/span[2]/input")).sendKeys("password");	
//		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/button")).click();
		 
	}

}
