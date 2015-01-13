package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class uploadPic {
	//Code to validate
	
	@BeforeSuite
	public void beforesuite(){
		System.out.println("Before Suite execution");
	}
	
	
	
	@BeforeTest
	public void beforetest(){
		System.out.println("Before test execution");
	}
	
	@AfterTest
	public void aftertest(){
		System.out.println("After test execution");
	}
	
	@BeforeMethod
	public void beforemethod(){
		System.out.println("Before method execution");
	}
	
	
	@AfterMethod
	public void aftermethod(){
		System.out.println("After method execution");
	}
	
	
	
	@Test
	public void TestuploadPic () {
		//Code to chek the actual and expected
		String actual = "A";
		String expected = "A";
		System.out.println("In TestUploadPic test case");
		//Assertions to report failures
		Assert.assertEquals(actual, expected);
		Assert.assertTrue(3>2, "Some Error Message");
		
	}
	
	@Test(dependsOnMethods={"TestuploadPic"})
	public void TestViewPic () {
		
		System.out.println("Viewing pic");
		
	}

}
