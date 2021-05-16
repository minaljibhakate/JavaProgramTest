package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver ;
	By email = By.id("user_email");
	By password = By.id("user_password");
	By login = By.cssSelector("[type='submit']");
	By forgotPassword = By.cssSelector("[href*='password/new']");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getEmail()
	{
		return driver.findElement(email);
	}

	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	
	public ForgotPassword forgotPassword()
	{
		driver.findElement(forgotPassword).click();
		ForgotPassword fp = new ForgotPassword(driver);
		return fp;
	}
	//CCI Login page
	/*By username = By.id("ctl00_ctpBody_login_txbUserName");
	By passwd = By.id("ctl00_ctpBody_login_txbPassword");
	By signin = By.id("ctl00_ctpBody_login_ibtnLogin");
	
	public WebElement getUsername()
	{
		return driver.findElement(username);
	}

	public WebElement getPasswd()
	{
		return driver.findElement(passwd);
	}
	public WebElement getSignin()
	{
		return driver.findElement(signin);
	}	*/
	//end of cci login details
	
	
}
