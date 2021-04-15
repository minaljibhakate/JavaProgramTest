package seleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> numberOfRows =  driver.findElements(By.cssSelector("[class=table-display] tr"));
		System.out.println("number of rows: " + numberOfRows.size());
		
		WebElement row = driver.findElement(By.xpath("//table[@id='product']/tbody/tr"));
		List<WebElement> numberOfColumn = row.findElements(By.tagName("th"));
		System.out.println("number of columns: " + numberOfColumn.size());
		
		List<WebElement> secondRowData =  driver.findElements(By.xpath("//table[@id='product']/tbody/tr[3]")) ;
		System.out.println(secondRowData.get(0).getText());		
	}

}
