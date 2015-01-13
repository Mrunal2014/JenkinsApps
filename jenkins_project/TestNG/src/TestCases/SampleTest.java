package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SampleTest {
	
	@BeforeClass
	public void beforeclass(){
		System.out.println("Before SampleTest class");
	}
	
	
	@AfterClass
	public void afterclass(){
		System.out.println("After SampleTest class");
	}
	
	@Test
	
	public void testRegisterUser() {
		System.out.println("Test to Register User");
				
	}
	
	@Test(dependsOnMethods={"testRegisterUser"})
	public void testLoginUser() {
	
	System.out.println("Test for user to login");
				
	}
	
   @Test(dependsOnMethods={"testRegisterUser","testLoginUser"})
	public void testRegisterPassword() {
	//	throw new SkipException("Skipping Test");
		System.out.println("Test to change the user password");
				
	}
	
   
   @AfterSuite
	public void afterresuite(){
		System.out.println("After Suite execution in Sample test java");
	}
	
	
}
