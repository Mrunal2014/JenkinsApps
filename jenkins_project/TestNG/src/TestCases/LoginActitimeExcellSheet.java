package TestCases;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import jxl.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginActitimeExcellSheet  {
	private WebDriver driver1;

	@BeforeClass
	public void pretest() {
		driver1 = new FirefoxDriver();
		}
		

	
	@Test(description="Login to Actitime through excel sheet")
	public void TestLogin () throws Exception {
		//Set the location of file to file handler
		FileInputStream fi=new FileInputStream("F:\\Auto_Data.xls");
		//creating the workbook object and passing the file
		Workbook w = Workbook.getWorkbook(fi);
		//get the sheet
		Sheet s = w.getSheet(0);
	
			 
		driver1.get("http://demo.actitime.com");
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	try {
			
		for(int i=1; i<s.getRows();i++) {
			//Read the data:
			String s1 = s.getCell(0, i).getContents();
			String s2 = s.getCell(1, i).getContents();
			
			//WebElement ele1 = driver1.findElement(By.xpath("//a[@id='loginButton']"));
			WebElement ele1 = driver1.findElement(By.xpath("//input[@name='username']"));
			highlightElement(ele1,driver1);
			
		
			driver1.findElement(By.xpath("//input[@name='username']")).sendKeys(s1);
			driver1.findElement(By.xpath("//input[@name='pwd']")).sendKeys(s2);
			driver1.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(9000);
			//System.out.println(driver1.getTitle());
				if (driver1.getTitle().equals("actiTIME - Enter Time-Track")) {
					System.out.println("User is logged in successfully");
						}
				else {
					System.out.println("User is not logged in ");
					}
				
			 driver1.findElement(By.xpath("//a[@id='logoutLink']")).click();
			 
		  }
		
		
	 }
	 
		
	catch(Exception e)
	{
	System.out.println(e);
	}
		
				
	}
	
	@AfterClass
	public void cleanup() {
	driver1.quit();
	}
	

	
	public void highlightElement(WebElement element, WebDriver driver) throws InterruptedException {
		for (int i = 0; i < 2; i++) { 
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: red; border: 2px solid red;");
			Thread.sleep(5000);
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
			} 
		} 
		
	}


