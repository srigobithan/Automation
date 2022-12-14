package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import firstproject.Newfile;
import page.packagelogin;

public class Testcase extends Newfile
{
	packagelogin loginnew = new packagelogin();
	
	@Test
	
	public void login() throws IOException, InterruptedException 
	{
		PageFactory.initElements(driver, loginnew);
		
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\check\\src\\test\\java\\excel\\New Microsoft Excel Worksheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("login");
		
		int rowcount = sheet.getLastRowNum();
		for(int i=1; i<=rowcount; i++)
		{
			XSSFRow row = sheet.getRow(i);
			
			String uName = (String)row.getCell(0).getStringCellValue();
			String pWord = (String)row.getCell(1).getStringCellValue();
			
			
			packagelogin.username.sendKeys(Keys.CONTROL, "a");
			packagelogin.username.sendKeys(Keys.DELETE); 
			packagelogin.username.sendKeys(uName);
			packagelogin.password.sendKeys(Keys.CONTROL, "a");
			packagelogin.password.sendKeys(Keys.DELETE);
			packagelogin.password.sendKeys(pWord);
			packagelogin.loginbutton.click();
			
			
			String strUrl = driver.getCurrentUrl();
			String url = "http://transport-hub-qa-release.com.s3-website.ap-south-1.amazonaws.com/dashboard";
			if(strUrl != url )
			{
				packagelogin.signout.click();
			}
		   
			
			
			Thread.sleep(2500);
						
		}
	}
		
	
	}
	
	
