package TestCases;

import org.testng.annotations.Test;

@Test(groups= "selenium-test")
public class TimeOut {
	/*The “timeout” means if a unit test is taking 
	longer than a specified number of milliseconds to finish, TestNG will
	 abort it and market it as failed.
	 	 */
	
	
	@Test (timeOut = 1000)
	public void timeoutmethd2(){
		System.out.println("This is going to time out");
		while(true);
			
		}
	
	@Test(timeOut = 5000)
	public void timeoutmethod() throws InterruptedException {
		System.out.println("This is time out method causing timeout for 4000ms");
		Thread.sleep(4000);
	}


	}
	
