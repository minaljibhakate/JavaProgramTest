package stepDefinition;
import java.io.IOException;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PortalHomePage;
import resources.base;

@RunWith(Cucumber.class)
public class StepDefinitions extends base {

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws IOException {
		driver =initializeDriver();
	}
	
	@And("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_something_site(String strArg1) {
		driver.get(strArg1);
	}
	
	@And("^Click on Login Link in home page to load on Secure sign in page$")
	public void click_on_login_link_in_home_page_to_load_on_secure_sign_in_page() {
		LandingPage l = new LandingPage(driver);
		if(l.getPopupSize()>0)
		{
			l.getPopup().click();
		}
		l.getLogin();
	}
	
	/*@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
	public void user_enters_and_logs_in(String arg1, String arg2) {
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(arg1);
		lp.getPassword().sendKeys(arg2);
		lp.getLogin().click();	
	}*/
	
	 @When("^User enters (.+) and (.+) and logs in$")
	 public void user_enters_and_and_logs_in(String username, String password) {
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getLogin().click();
	}
	
	@Then("^Verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() {
	    PortalHomePage p = new PortalHomePage(driver);
	    p.getSearchBox().isDisplayed();
	}

	@And("^Close Browsers$")
    public void close_browsers() {
        driver.quit();
    }

}
