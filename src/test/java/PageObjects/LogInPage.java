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
	
	@FindBy(id = "email")
	WebElement emailLbl;
	
	@FindBy(id = "passwd")
	WebElement passwdLbl;
	
	@FindBy(id = "SubmitLogin")
	WebElement submitLbl;
	
	@FindBy(id = "/html/body/svg/path[2]")
	WebElement footPage;
	
	public void sendEmail(String email) {
		//Input the email
		emailLbl.sendKeys(email);
	}
	
	public void clickOut() {
		//Its to only click on free space
		footPage.click();
	}
	
	public void send(String pass) {
		//Input the password
		passwdLbl.sendKeys(pass);
	}
	
	public void clickSubmit() {
		submitLbl.click();
	}
}

