package Academy;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.base;

public class ValidateTitle extends base {
	
	public WebDriver driver;
	LandingPage l ;
	public static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver =initializeDriver();
		log.info("driver is Initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home page");
	}
	@Test
	public void validateAppTitle() throws IOException
	{
		l = new LandingPage(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		log.info("Successfully validated text message");
	}
	@Test
	public void validateHeader()
	{
		//l = new LandingPage(driver);
		Assert.assertEquals(l.getHeader().getText(), "Learn Hot tools like Selenium, Appium, JMeter, SoapUI,Database Testing and more..");
	}
	
	//div[class*='video-banner'] p
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
