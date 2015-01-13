package TestCases;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import com.thoughtworks.selenium.Selenium;
import java.io.File;
/*remove all warning message */
@SuppressWarnings("unused")
public class Login {

 private WebDriver driver;
 private String baseUrl="http://www.yourwebsite.com";
 private StringBuffer verificationErrors = new StringBuffer();

 @BeforeClass
 public void setUp() throws Exception {
 /**launch firefox instance*/
 driver = new FirefoxDriver();
 /**wait for 30 sec, if page will load it will throw exception*/
 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

 /**wait for 30 sec to page to load*/
 //driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

 /**wait for 30 sec for script timeout*/
 //driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
 }
@Test()
 public void testUntitled() throws Exception {
 driver.get("http://www.yourwebsite.com");
 driver.findElement(By.name("username")).clear();
 driver.findElement(By.name("username")).sendKeys("username");
 driver.findElement(By.xpath("(//input[@name='password'])[2]")).clear();
 driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("password");
 driver.findElement(By.xpath("(//input[@name='submitbutton'])[2]")).click();
 System.out.println(driver.getCurrentUrl());
 }

 @AfterClass
 public void tearDown() throws Exception {
 driver.quit();
 String verificationErrorString = verificationErrors.toString();
 if (!"".equals(verificationErrorString)) {
 //fail(verificationErrorString);
 }
 }
 private boolean isElementPresent(By by) {
 try {
 driver.findElement(by);
 return true;
 }catch (NoSuchElementException e) {
 return false;
 }
 }

 }
