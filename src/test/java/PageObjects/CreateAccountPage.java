package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import UniqueTools.LoadExcel;

public class CreateAccountPage {

	
	public CreateAccountPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="customer_firstname")
	WebElement nameLbl;
	
	@FindBy(id="customer_lastname")
	WebElement lastNamtetLbl;
	
	@FindBy(id="email")
	WebElement emailtLbl;
	
	@FindBy(id="passwd")
	WebElement passwordLbl;
	
	@FindBy(id="firstname")
	WebElement firstLbl;
	
	@FindBy(id="lastname")
	WebElement lastLbl;
	
	@FindBy(id ="address1")
	WebElement addres1Lbl;
	
	@FindBy(id="city")
	WebElement cityLbl;
	
	@FindBy(id ="postcode")
	WebElement zipLbl;
	
	@FindBy(id ="phone_mobile")
	WebElement phoneLbl;
	
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
	
	public void inputForm(String path, String email, String pass){
		Select state = new Select(states);
		Select country = new Select(countries);
		LoadExcel tool = new LoadExcel();
		List<String> data = tool.loadData(path);
		nameLbl.sendKeys(data.get(1));
		lastNamtetLbl.sendKeys(data.get(2));
		emailtLbl.clear();
		emailtLbl.sendKeys(email);
		passwordLbl.sendKeys(pass);
		firstLbl.sendKeys(data.get(5));
		lastLbl.sendKeys(data.get(6));
		addres1Lbl.sendKeys(data.get(7));
		cityLbl.sendKeys(data.get(8));
		zipLbl.sendKeys(data.get(9));
		phoneLbl.sendKeys(data.get(10));
		state.selectByIndex(1);
		country.selectByIndex(1);

	}
	
	public void submitForm(){
		registerBtn.click();
	}
	
	public String getPageHead() {
		return pageHeading.getText();
	}
	
	public String getCreateErrorMessage() {
		return errorCreateMessage.getText();
	}	
}
