package testA;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondClass {

	@Test(groups= {"Smoke"})
	public void Second()
	{
		System.out.println("SMOKE : Second");
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will execute first");
	}
}
