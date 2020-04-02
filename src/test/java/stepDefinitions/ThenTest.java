package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import PageObjects.CreateAccountPage;
import PageObjects.LogInPage;
import PageObjects.ProcedCheckOut;
import io.cucumber.java.en.Then;

public class ThenTest {
	
	WebDriver driver = WhenTest.driver;
	CreateAccountPage cp = new CreateAccountPage(driver);
	
	/**
	 * LogInPage Methods
	 */
	
	@Then("User should be logged correctly")
	public void user_should_be_logged_correctly() {
		LogInPage lp = new LogInPage(driver);
		lp.errorTitle();
	}

	@Then("An error message Arraised")
	public void an_error_message_Arraised() {
		// Write code here that turns the phrase above into concrete actions
		LogInPage lp = new LogInPage(driver);
		lp.errorMsg();
	}

	/**
	 * CheckOut Methods
	 */
	
	@Then("User should validate the confirmation message")
	public void user_should_validate_the_confirmation_message() {
		ProcedCheckOut proced = new ProcedCheckOut(driver);
		proced.validateCheckOut();
	}

	@Then("User login")
	public void user_login() {
		String expectedText ="My account";
		assertEquals(cp.getPageHead(), expectedText);
	}

	
	@Then("An error message appears on the page")
	public void an_error_message_appears_on_the_page() {
		String expectedText ="Invalid email address.";
		assertEquals(cp.getCreateErrorMessage(), expectedText);
	}
	
	@Then("Validate the {int} products into the cart")
	public void validate_the_products_into_the_cart(int quantitie) {
		ProcedCheckOut proced = new ProcedCheckOut(driver);
		proced.validateItemQuantitie(quantitie);
	}
}
