package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import PageObjects.LogInPage;
import PageObjects.ProcedCheckOut;
import PageObjects.WomenPage;
import PageObjects.WomenPage.Titles;
import io.cucumber.java.en.When;

public class WhenTest {
	LogInPage lg;
	static WebDriver driver = GivenTest.driver;
	static Actions action = new Actions(driver);

	@When("User enters username as {string}")
	public void user_enters_username_as(String email) {
		lg = new LogInPage(driver);
		lg.sendEmail(email);

	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		lg.send(password);
	}

	@When("User click on sign in buttom")
	public void user_click_on_sign_in_buttom() {
		// Write code here that turns the phrase above into concrete actions
		lg.clickSubmit();
	}

	@When("User click out of the username")
	public void user_click_out_of_the_username() {
		// Write code here that turns the phrase above into concrete actions
		lg.clickOut();
	}

	@When("User selects a product from the women page")
	public void user_selects_a_product_from_the_women_page() {
		WomenPage wPage = new WomenPage(driver);
		wPage.getBarMenuElement(Titles.WOMEN);
		wPage.selectClothe(1, driver);
	}

	@When("User validate all CheckOut statements")
	public void user_validate_all_CheckOut_statements() {
		ProcedCheckOut proced = new ProcedCheckOut(driver);
		proced.statementsProced();
	}

	@When("User press createAnAccountBtn")
	public void user_press_createAnAccountBtn() {
		LogInPage lp = new LogInPage(driver);
		lp.clickSubmitCreate();
	}

	@When("User enters all the success on form and pass234")
	public void user_enters_all_the_success_on_form_and_pass234() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User register the information")
	public void user_register_the_information() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
