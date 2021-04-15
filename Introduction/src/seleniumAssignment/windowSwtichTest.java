package seleniumAssignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowSwtichTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		
		String parentwindow =it.next();
		System.out.println(parentwindow);
		String childwindow = it.next();
		System.out.println(childwindow);
		driver.switchTo().window(childwindow);
//		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
		//System.out.println(driver.findElement(By.xpath("//div[@class='col-md-8']/p[text()]")).getText());
		WebDriverWait wait = new WebDriverWait(driver, 40);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(.,'Please email us at mentor@rahulshettyacademy.com with below template to receive response')]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".im-para.red")));
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		//System.out.println(driver.findElement(By.xpath("//p[contains(.,'Please email us at mentor@rahulshettyacademy.com with below template to receive response')]")).getText());
		String emailText = driver.findElement(By.cssSelector(".im-para.red")).getText();
		String emailId = emailText.split("at")[1].trim().split(" ")[0];
		System.out.println(emailId);
		driver.switchTo().window(parentwindow);
		driver.findElement(By.id("username")).sendKeys(emailId);
		
		
	}

}
