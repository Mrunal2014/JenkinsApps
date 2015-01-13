package TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadData {
	
	@BeforeTest
	public void beforetest1(){
		System.out.println("The different users and passwords are:");
	}
	
	
	@Test(dataProvider="getdata")
	public void login(String U, String P) {
		
		
		System.out.println("Username: " + U + " and Password: " + P);
		
	}
	
	
	@DataProvider
	public Object[][] getdata() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0]="U1";
		data[0][1]="P1";
		
		data[1][0]="U2";
		data[1][1]="P2";
		
		data[2][0]="U3";
		data[2][1]="P3";
		
		return data;
		
	}
	
	//@AfterTest(dependsOnMethods={"login"})
	@AfterTest
	public void aftertest1(){
		System.out.println("This is method after test");
	}
	
	

}
