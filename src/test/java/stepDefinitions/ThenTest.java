package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import PageObjects.ProcedCheckOut;
import io.cucumber.java.en.Then;

public class ThenTest {
	WebDriver driver = WhenTest.driver;

	@Then("User should be logged correctly")
	public void user_should_be_logged_correctly() {
		// Write code here that turns the phrase above into concrete actions
		WebElement lblHeading = driver.findElement(By.className("page-heading"));
		Assert.assertTrue(lblHeading.getText().equals("MY ACCOUNT"));
		driver.quit();

	}

	@Then("An error message Arraised")
	public void an_error_message_Arraised() {
		// Write code here that turns the phrase above into concrete actions
		WebElement lblErrorMsg = driver.findElement(By.xpath("//*[@id='center_column']/div[1]/p"));
		Assert.assertTrue(lblErrorMsg.getText().equals("There is 1 error"));
		driver.quit();
	}

	@Then("An visual error arraised")
	public void an_visual_error_arraised() {
		// Write code here that turns the phrase above into concrete actions
		WebElement lblErrorMsg = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]"));
		String expectedClass = "form-group form-error";
		if (lblErrorMsg.equals(expectedClass)) {
			System.out.println("All is okay");
		}
		Assert.assertFalse(false);
		driver.quit();
	}

	@Then("User should validate the confirmation message")
	public void user_should_validate_the_confirmation_message() {
		ProcedCheckOut proced = new ProcedCheckOut(driver);
		proced.validateCheckOut();
	}

	@Then("User login with aasdasd@gmail.com and pass234")
	public void user_login_with_aasdasd_gmail_com_and_pass234() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("An error message appears on the page")
	public void an_error_message_appears_on_the_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
