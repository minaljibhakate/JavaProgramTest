package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Actions a = new Actions(driver);
		
		WebElement profileElement = driver.findElement(By.id("nav-link-accountList"));
		WebElement searchElement = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		a.moveToElement(searchElement).click().keyDown(Keys.SHIFT).sendKeys("Mobile").doubleClick().build().perform();
		a.moveToElement(profileElement).contextClick().build().perform();
		
		
		
	}

}
