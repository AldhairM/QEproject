package stepDefinitions;

import org.openqa.selenium.WebDriver;

import PageObjects.LogInPage;
import PageObjects.WomenPage;
import io.cucumber.java.en.Given;

public class GivenTest {
	public static WebDriver driver = SetUpClassDefinition.driver;
	LogInPage lg;
	WomenPage wPage;
	
	/**
	 * LogIn Methods
	 */	
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		lg = new LogInPage(driver);
		lg.go();
		System.out.println("I'm here");
	}

	@Given("User login {string} or {string}")
	public void user_login(String email, String password) {
		lg = new LogInPage(driver);
		lg.go();
		lg.sendEmail(email);
		lg.send(password);
		lg.clickSubmit();
	}
	
	@Given("User enter an {string} on new emailLabel")
	public void user_enter_an_on_new_emailLabel(String newEmail) {
		lg = new LogInPage(driver);
		lg.go();
		lg.sendNewEmail(newEmail);
		lg.clickSubmitCreate();
	}
	
	/**
	 * Catalog Methods
	 */
	
	@Given("User selects a product from the women page")
	public void user_selects_a_product_from_the_women_page() {
		WomenPage wPage = new WomenPage(driver);
		wPage.selectClothetoAdd(1, driver);
	}
	

	@Given("User is on CartSummary page")
	public void user_is_on_CartSummary_page() {
		wPage = new WomenPage(driver);
		wPage.procedToCheckOutBtn();
	    }
	
	@Given("User should select a product from the women page")
	public void user_should_select_a_product_from_the_women_page() {
	 	WomenPage wPage = new WomenPage(driver);
		wPage.selectClothetoMore(1, driver);
	}

}
