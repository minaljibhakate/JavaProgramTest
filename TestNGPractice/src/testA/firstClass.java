package testA;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class firstClass {
	
	@AfterTest
	public void lastExecution()
	{
		System.out.println("I will execute at the last");
	}
	
	@AfterSuite
	public void afSuite()
	{
		System.out.println("I am the last last last bcoz i m suite ");
	}
	
	@Test
	public void Demo()
	{
		System.out.println("Hello");
		Assert.assertTrue(false);
	}

	
	@Test(groups= {"Smoke"})
	public void SecondTest()
	{
		System.out.println("SMOKE : Bye ");
	}

}
