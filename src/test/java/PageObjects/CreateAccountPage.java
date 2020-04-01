package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import SimileTools.LoadExcel;

public class CreateAccountPage {

	
	public CreateAccountPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "required form-group")
	List<WebElement> formLbls;
	
	@FindBy(name = "id_state")
	WebElement states;
	
	@FindBy(name = "id_country")
	WebElement countries;
	
	@FindBy(xpath ="//span[text()='Register']")
	WebElement registerBtn;
	
	@FindBy(className ="page-heading")
	WebElement pageHeading;
	
	@FindBy(id="create_account_error")
	WebElement errorCreateMessage;
	
	public void inputForm(String path, String email, String pass) {
		Select state = new Select(states);
		Select country = new Select(countries);
		LoadExcel tool = new LoadExcel();
		List<String> data = tool.loadData(path);
		int counter = 1;
		for (WebElement e :formLbls) {
			if(counter == 2||counter == 3) {
				e.sendKeys((counter == 2 ) ? email:pass);
			}else {
				e.sendKeys(data.get(counter));
			}
		counter++;
		}
		state.selectByValue(data.get(-2));
		country.selectByValue("21");
	}
	
	public void submitForm() {
		registerBtn.click();
	}
	
	public String getPageHead() {
		return pageHeading.getText();
	}
	
	public String getCreateErrorMessage() {
		return errorCreateMessage.getText();
	}	
}
