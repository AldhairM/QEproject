package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProcedCheckOut {

	public ProcedCheckOut(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//TESTGIT
	//Adding a new item
	@FindBy(xpath = "//*[@id=\'layer_cart\']/div[1]/div[2]/div[4]/a/span")
	WebElement addtoCartCheckBtn;
	//Validate my Cart
	@FindBy(xpath = "//*[@id=\'center_column\']/p[2]/a[1]")
	WebElement summaryCheckBtn;
	//Validate my addres
	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
	WebElement addresCheckBtn;
	//Validate the shipping
	@FindBy(xpath = "//*[@id=\"form\"]/p/button")
	WebElement shippingCheckBtn;
	//Order confirmation
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
	WebElement confirmCheckBtn;
	
	@FindBy(className = "checker")
	WebElement inputCheck;
	
	@FindBy(className = "bankwire")
	WebElement bankWire;

	@FindBy(className = "cheque")
	WebElement cheque;

	@FindBy(xpath = "//p[@class='alert alert-success']")
	WebElement alertSucc;

	public void statementsProced() {
		//Sorry :(
		addtoCartCheckBtn.click();
		summaryCheckBtn.click();
		addresCheckBtn.click();
		inputCheck.click();
		shippingCheckBtn.click();
		cheque.click();
		confirmCheckBtn.click();
	}

	public void validateCheckOut() {
		String expectedResult = "Your order on My Store is complete.";
		Assert.assertEquals(alertSucc.getText(), expectedResult);
	}

}
