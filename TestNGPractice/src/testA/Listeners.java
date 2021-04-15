package testA;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("It is successfull");
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("It is failed.....Class name is  : "+ result.getName());
	}
}
