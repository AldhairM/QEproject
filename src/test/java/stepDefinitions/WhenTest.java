package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import PageObjects.CreateAccountPage;
import PageObjects.LogInPage;
import PageObjects.ProcedCheckOut;
import PageObjects.WomenPage;
import io.cucumber.java.en.When;

public class WhenTest {
	LogInPage lg;
	public static WebDriver driver = GivenTest.driver;
	static Actions action = new Actions(driver);
	
	/**
	 * LogIn Methods
	 */
	
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

	/*
	 * CheckOut Methods
	 */

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

	@When("User enters all the {string} on form,{string} and {string}")
	public void user_enters_all_the_on_form_and(String path, String email, String password){
		CreateAccountPage cp = new CreateAccountPage(driver);
		System.out.println("I went");
		cp.inputForm(path, email, password);
		cp.submitForm();
	}

	@When("User register the information")
	public void user_register_the_information(){
		CreateAccountPage cp = new CreateAccountPage(driver);
		cp.submitForm();
	}
	
	
	@When("User clicks on procedToCheckOutBtn sometimes")
	public void user_clicks_on_procedToCheckOutBtn_sometimes() {
		ProcedCheckOut pco = new ProcedCheckOut(driver);
		pco.statementsProced();
	}

	/**
	 * Catalog Methods
	 */
	
	@When("User should add {int} items on cart")
	public void user_should_add_items_on_cart(Integer quantity) {
		WomenPage wPage = new WomenPage(driver);
		wPage.addClothe(quantity);
	}
	
}
