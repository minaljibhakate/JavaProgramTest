package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		String checkboxText = driver.findElement(By.xpath("//label[contains(.,'Option2')]")).getText();
		System.out.println("checkboxText:" + checkboxText);
		
		//Selecting the checkbox value in dropdown
		Select dropdownselect = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdownselect.selectByVisibleText(checkboxText);
		
		//Sending text to text field
		driver.findElement(By.id("name")).sendKeys(checkboxText);
		//Clicking Alert button
		driver.findElement(By.id("alertbtn")).click();
		
		//Get the text from Alert
		String textFromAlert = driver.switchTo().alert().getText();
		System.out.println("textFromAlert:" + textFromAlert);
		
		String desiredText = textFromAlert.split(" ")[1].split(",")[0].trim();
		System.out.println("desiredText:" + desiredText);
		
		if(textFromAlert.contains(checkboxText))
		{
			System.out.println(" *** Alert text contains , text from checkbox value   ***");
		}
		
		
	}

}
