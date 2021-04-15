package seleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dateMonthSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.id("travel_date")).click();
		
		//driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("August");
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("August"))
		{
		//	driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
			driver.findElement(By.xpath("(//th[contains(@class,'next')])[1]")).click();
		}
		
		List<WebElement> AllDates = driver.findElements(By.className("day"));
		int totalCountOfDates = driver.findElements(By.className("day")).size();
		
		for(int i=0 ; i <totalCountOfDates ; i++ )
		{
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("21"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
		
	}

}
