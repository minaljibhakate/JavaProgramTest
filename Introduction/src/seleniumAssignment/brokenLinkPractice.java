package seleniumAssignment;
import org.openqa.selenium.WebElement;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class brokenLinkPractice {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		SoftAssert a =new SoftAssert();
		
		//String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		List<WebElement> allLinks = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for (WebElement link :allLinks)
		{
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respcode = conn.getResponseCode();
			System.out.println(respcode);
			//a.assertTrue(respcode<400, "the link with text '" + link.getText() + "' is broken with code  "+respcode);
	        a.assertTrue(respcode<400, "The link with Text"+link.getText()+" is broken with code" +respcode);
			/*if(respcode>400)
			{
				System.out.println("the link with text '" + link.getText() + "' is broken with code  "+respcode);	
				Assert.assertTrue(false);
			}*/
		}
		
		
	}
}
