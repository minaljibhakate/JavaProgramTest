package seleniumAssignment;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class webTableSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Click on column name
		driver.findElement(By.xpath("//tr//th[1]")).click();

		//Collect veggie names from first column
		List<WebElement> veggieNames= driver.findElements(By.xpath("//tr//td[1]"));
		
		//collect all names in string of new list
		List<String> originalList= veggieNames.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort the list in new list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedList));
		System.out.println("====Done====");
		List<String> price;
		do
		{
			List<WebElement> eachColumnVeggie= driver.findElements(By.xpath("//tr//td[1]"));
			price = eachColumnVeggie.stream().filter(s->s.getText().contains("Rice")).map(s->getVeggiePrice(s)).collect(Collectors.toList());
			price.forEach(a->System.out.println(a));
			if(price.size()<1)
			{
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
				
			}
		}while(price.size()<1);
		
	}

	private static String getVeggiePrice(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
