package seleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class scrollingPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		/*js.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");*/
		
		List<WebElement> count = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		// //td[contains(.,'28')]
		int sum =0;
		for (int i=0 ; i < count.size(); i++)
		{
			sum= sum+ Integer.parseInt(driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)")).get(i).getText());
		}
		System.out.println(sum);
		int amount = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		System.out.println(amount);
		Assert.assertEquals(sum, amount);
		
	}

}
