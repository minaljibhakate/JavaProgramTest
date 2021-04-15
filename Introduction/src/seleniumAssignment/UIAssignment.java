package seleniumAssignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UIAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");		
		
		Select adultdropdown = new Select(driver.findElement(By.id("Adults")));
		adultdropdown.selectByVisibleText("3");

		// Check the presence of alert
		driver.switchTo().alert().dismiss();
			   
		Select Childrendropdown = new Select(driver.findElement(By.id("Childrens")));
		Childrendropdown.selectByValue("1");
		
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();
		
		driver.findElement(By.id("MoreOptionsLink")).click();
		
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("AirIndia");
		
		driver.findElement(By.id("SearchBtn")).click();
		
		String errorText =  driver.findElement(By.id("homeErrorMessage")).getText();
		System.out.println(errorText);
				
	}

}
