package seleniumAssignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//For Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//For Firefox browser
		//System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//For IE Browser 
		//System.setProperty("webdriver.ie.driver", "C:\\work\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
						
		driver.get("https://www.spicejet.com/default.aspx");
		//System.out.println(driver.getTitle());
				
		//Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//driver.findElement(By.id("divpaxinfo")).click();
		//Thread.sleep(2000);
		//Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adults");
		
	}

}
