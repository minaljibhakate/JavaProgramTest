package seleniumAssignment;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class WebTableSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Click on column name
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> allVeggies = driver.findElements(By.xpath("//tr/td[1]"));// 1 Result
		
		List<WebElement> filteredVeggies = allVeggies.stream().filter(veggie->veggie.getText().contains("Rice")).collect(Collectors.toList()); //1 Result
		
		Assert.assertEquals(allVeggies.size(), filteredVeggies.size());
		
	}

}
