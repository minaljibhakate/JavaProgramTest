package gridTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class remoteMachineGridTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		//open browser in grid machine
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"),dc);
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("KalpakJibhakte");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[name='btnK']")).click();
		
	}

}
