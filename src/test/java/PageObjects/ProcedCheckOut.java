package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProcedCheckOut {

	public ProcedCheckOut(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// TESTGIT
	// Validate my Cart
	@FindBy(xpath = "//*[@id=\'center_column\']/p[2]/a[1]")
	WebElement summaryCheckBtn;
	// Validate my addres
	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
	WebElement addresCheckBtn;
	// Validate the shipping
	@FindBy(xpath = "//*[@id=\"form\"]/p/button")
	WebElement shippingCheckBtn;
	// Order confirmation
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

	@FindBy(xpath="//*[@id=\'header\']/div[3]/div/div/div[3]/div/a/span[1]")
	WebElement totalProducts;

	public void statementsProced() {
		// Sorry :(
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

	public void validateItemQuantitie(int quantitie) {
		String expected = String.valueOf(quantitie);
		System.out.println(expected);
		Assert.assertEquals(totalProducts.getText(),expected);
	}
}
