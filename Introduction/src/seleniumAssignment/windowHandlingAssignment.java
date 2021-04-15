package seleniumAssignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowHandlingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> wList = driver.getWindowHandles();
		Iterator<String> window = wList.iterator();
		String parentwindow = window.next();
		System.out.println(parentwindow);
		String childwindow = window.next();
		System.out.println(childwindow);
		
		driver.switchTo().window(childwindow);
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/h3")));
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		
		driver.switchTo().window(parentwindow);
		System.out.println(driver.findElement(By.xpath("//h3[contains(.,'Opening a new window')]")).getText());
	}

}
