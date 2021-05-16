package Academy;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.base;

public class ValidateNavigationBar extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());

	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException
	{
		driver =initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void validateAppNavBar() throws IOException
	{	
		LandingPage l = new LandingPage(driver);		
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		log.info("Navogation bar is displayed");
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
