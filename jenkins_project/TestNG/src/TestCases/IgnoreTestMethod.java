package TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups= "selenium-test")
public class IgnoreTestMethod {
	
	@BeforeTest
	public void beforetest(){
		System.out.println("Method before every test in calss");
	}
	
	@AfterTest
	public void aftertest(){
		System.out.println("Method after every test");
	}

	@Test
	public void test1() {
		System.out.println("Test with default enabling");
	}
	
	@Test(enabled = true)
	public void test2(){
		System.out.println("Test with explicit enabling");
	}
	
	@Test(enabled = false) //This test will not run
	
	public void test3() {
		System.out.println("Test with disabled enabling");
	}
	
}
