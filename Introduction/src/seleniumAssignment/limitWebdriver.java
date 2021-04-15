package seleniumAssignment;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class limitWebdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerpart = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerpart.findElements(By.tagName("a")).size());
		
		WebElement discountDriver = footerpart.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(discountDriver.findElements(By.tagName("a")).size());
		
		for(int i=1 ; i< discountDriver.findElements(By.tagName("a")).size() ; i++)
		{
			String clickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			discountDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
				
				try{
				Thread.sleep(5000L);
				}
				catch(InterruptedException ie){
				}			//Thread.sleep(5000L);
		}
		Set<String> windowName= driver.getWindowHandles();
		Iterator<String> it = windowName.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
