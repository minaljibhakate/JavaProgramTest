package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException
	{
		driver =initializeDriver();
	}
	@Test(dataProvider = "getData")
	public void basePageNavigation(String Username , String password, String text) throws IOException
	{
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		//l.getLogin().click();
		LoginPage lp = l.getLogin();
		//LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(password);
		//System.out.println(text);
		lp.getLogin().click();	
		log.info(text);
		ForgotPassword fp = lp.forgotPassword();
		fp.getEmail().sendKeys("minal@email.com");
		fp.sendmeInstruction().click();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object [][] data = new Object[2][3];
		
		//oth row
		data[0][0] ="nonrestricteduser@noemail.com";
		data[0][1]="123456";
		data[0][2]="non restricted user";
		//1st row
		data[1][0]="restricteduser@noemail.com";
		data[1][1]="123123";
		data[1][2]="restricted user";
		
		return data;
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
