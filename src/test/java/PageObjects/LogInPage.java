package PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LogInPage {
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class=\"login\"]")
	WebElement signInPage;
	
	@FindBy(id = "email")
	WebElement emailLbl;
	
	@FindBy(id = "passwd")
	WebElement passwdLbl;
	
	@FindBy(id = "SubmitLogin")
	WebElement submitLbl;
	
	@FindBy(id = "/html/body/svg/path[2]")
	WebElement footPage;
	
	@FindBy(id="email_create")
	WebElement newEmailLbl;
	
	@FindBy(id="SubmitCreate")
	WebElement submitCreateLbl;	
	
	@FindBy(xpath="//*[@id=\'create_account_error\']/ol/li")
	WebElement errorEmailMessage;
	
	@FindBy(className = "page-heading")
	WebElement lblHeading;
	public void go() {
		signInPage.click();
	}	
	
	public void sendEmail(String email) {
		//Input the email
		emailLbl.sendKeys(email);
	}
	
	public void send(String pass) {
		//Input the password
		passwdLbl.sendKeys(pass);
	}
	
	public void clickSubmit() {
		submitLbl.click();
	}
	
	public void sendNewEmail(String newEmail) {
		//Input the password
		newEmailLbl.sendKeys(newEmail);
	}
	
	public void clickSubmitCreate() {
		submitCreateLbl.click();
	}
	
	public void clickOut() {
		//Its only to des-select something
		footPage.click();
	}
	
	public void errorMsg() {
		Assert.assertTrue(errorEmailMessage.getText().equals("There is 1 error"));
	}
	
	public void errorTitle() {
		Assert.assertTrue(lblHeading.getText().equals("MY ACCOUNT"));
	}
}

