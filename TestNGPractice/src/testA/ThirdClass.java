package testA;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ThirdClass {
	
	@Parameters({"URL"})
	@Test
	public void loginTest(String urlname)
	{
		System.out.println("Login Test class");
		System.out.println(urlname);
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("----Before executing any menthod in the class----");
	}
	
	@AfterClass
	public void aftrclass()
	{
		System.out.println("After all the method executed in this class.........");
	}
	
	@Test(timeOut=4000)
	public void WebLoginCarLoan()
	{
		System.out.println("Web login car loan");
	}
	
	@BeforeMethod
	public void beforeEveryMethod()
	{
		System.out.println("II will execute before each Method");
		
	}
	
	@AfterMethod
	public void AfterEveryMethod()
	{
		System.out.println("II will execute After each Method in class 3");
		
	}
	
	
	@Test(groups= {"Smoke"})
	public void MobileLoginCarLoan()
	{
		System.out.println("SMOKE : Mobile login car loan");
	}
	
	@Test(enabled=true)
	public void MobileLogoutCarLoan()
	{
		System.out.println("Mobile LOGOUT car loan");
	}
	
	@BeforeSuite
	public void bfSuite()
	{
		System.out.println("I am number 1");
	}
	
	@Test(dependsOnMethods={"WebLoginCarLoan","MobileLogoutCarLoan"})
	public void APILoginCarLoan()
	{
		System.out.println("API login car loan");
	}
	
	@Test(dataProvider="getData")
	public void datapritingclass(String uname, String passwd)
	{
		System.out.println("Data printing class .....");
		System.out.println(uname);
		System.out.println(passwd);
	}

	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		//1st set
		data[0][0] ="firstusername";
		data[0][1] = "firstpassword";
		//2nd set
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";
		//3rd set
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		
		return data;
		
	}
}
