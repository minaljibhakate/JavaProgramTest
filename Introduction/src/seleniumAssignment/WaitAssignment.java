package seleniumAssignment;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
				
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		//driver.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();
		driver.findElement(By.partialLinkText("data via Ajax")).click();
		WebDriverWait linkwait = new WebDriverWait(driver, 30);
		
		linkwait.until(ExpectedConditions.elementToBeClickable(By.id("results")));

		System.out.println(driver.findElement(By.id("results")).getText());
	}
}
