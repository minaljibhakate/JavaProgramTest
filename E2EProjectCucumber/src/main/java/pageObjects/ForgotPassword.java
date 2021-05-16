package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
	
	public WebDriver driver ;
	By emailAddress = By.id("user_email");
	By sendMeInstructions = By.cssSelector("[type='submit']");
	
	public ForgotPassword(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getEmail()
	{
		return driver.findElement(emailAddress);
	}
	public WebElement sendmeInstruction()
	{
		return driver.findElement(sendMeInstructions);
	}
}
