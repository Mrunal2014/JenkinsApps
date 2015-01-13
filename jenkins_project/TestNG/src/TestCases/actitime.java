package TestCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class actitime {
	public WebDriver driver1;
	@Parameters({"browser"})
	@BeforeClass
	public void setup(String browser) throws MalformedURLException {
		DesiredCapabilities capability=null;
			
		if(browser.equalsIgnoreCase("firefox")){
			System.out.println("firefox");
			capability= DesiredCapabilities.firefox();
			capability.setBrowserName("firefox"); 
			capability.setPlatform(org.openqa.selenium.Platform.ANY);
			//capability.setVersion("");
		}
	
		if(browser.equalsIgnoreCase("iexplore")){
			System.out.println("iexplore");
			
			capability= DesiredCapabilities.internetExplorer();
			capability.setBrowserName("iexplore");
			capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capability.setPlatform(org.openqa.selenium.Platform.WINDOWS);
			capability.setVersion("10");
						
			
			
		}
		
		if(browser.equalsIgnoreCase("chrome")){
			System.out.println("Chrome");
			//System.setProperty("webdriver.chrome.driver", "F:\\WorkSpace\\Sellinium\\chromedriver.exe");
			capability= DesiredCapabilities.chrome();
			//capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capability.setBrowserName("chrome"); 
			capability.setPlatform(org.openqa.selenium.Platform.WINDOWS);
			//capability.setVersion("");
		}
		
		
		driver1 = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		//driver1.navigate().to("http://google.com");
		
	}
	
	
	@Test 
	public void login () throws InterruptedException, MalformedURLException {
		
			
		//WebDriver driver1 = new FirefoxDriver();
		driver1.get("http://demo.actitime.com");
		driver1.manage().window().maximize();
		driver1.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver1.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver1.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(7000);
		driver1.findElement(By.xpath("//a[@id='logoutLink']")).click();
		Thread.sleep(7000);
		
		
	}
	
	@AfterClass 
	public void teardown(){
		driver1.close();
	}	
	
		
		
	}
	


