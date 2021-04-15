package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class framesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[@href='/nested_frames']")).click();
		
		System.out.println("outer frame size = " + driver.findElements(By.tagName("frame")).size());
		
		WebElement outerFrame = driver.findElement(By.cssSelector("frame[name='frame-top']"));
		driver.switchTo().frame(outerFrame);
		
		System.out.println("Inner frame size = " + driver.findElements(By.tagName("frame")).size());
		WebElement middleFrame = driver.findElement(By.cssSelector("frame[name='frame-middle']"));
		driver.switchTo().frame(middleFrame);
		System.out.println(driver.findElement(By.xpath("//div[contains(@id,'content')]")).getText());
		
	}

}
