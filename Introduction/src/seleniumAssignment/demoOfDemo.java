package seleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoOfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("");		
		
		
		
	}

}
