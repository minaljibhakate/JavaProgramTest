package seleniumAssignment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class CheckboxAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");		
		
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print True
		driver.findElement(By.id("checkBoxOption1")).click();

		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print false
		
		int count = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println("======Count of the checkboxex====  " + count  );
	}
}
