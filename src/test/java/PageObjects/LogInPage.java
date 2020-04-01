package PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	public LogInPage(WebDriver driver) {
		/*PageFactory deja mi driver a la escucha debido a que 
		pueden existir elementos los cuales no pueden existir
		hasta que ocurra. Se utiliza para encontrar cualquier
		tipo de elemento*/
		PageFactory.initElements(driver, this);
	}

	@FindBy(className="login")
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
	
}

