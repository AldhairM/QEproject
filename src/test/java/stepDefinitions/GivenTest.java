package stepDefinitions;

import org.openqa.selenium.WebDriver;

import PageObjects.LogInPage;
import io.cucumber.java.en.Given;

public class GivenTest {
	public static WebDriver driver = SetUpClassDefinition.driver;
	LogInPage lg;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("I'm here");
	}

	@Given("User login {string} or {string}")
	public void user_login(String email, String password) {
		// Write code here that turns the phrase above into concrete actions
		lg = new LogInPage(driver);
		lg.go();
		lg.sendEmail(email);
		lg.send(password);
		lg.clickSubmit();
	}
	
	@Given("User enter an aasdasd@gmail.com on new emailLabel")
	public void user_enter_an_aasdasd_gmail_com_on_new_emailLabel() {
	    // Write code here that turns the phrase above into concrete actions
		lg = new LogInPage(driver);
		
	}

}
