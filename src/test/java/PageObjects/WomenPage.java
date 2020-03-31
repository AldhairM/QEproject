package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WomenPage {
	WebDriver driver;
	
	public enum Titles {
		WOMEN, DRESSES, TSHIRT
	}

	public WomenPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "product_img_link")
	List<WebElement> productList;

	@FindBy(xpath = "//span[text()='Add to cart']")
	List<WebElement> addCartBtn;

	// Declare my head bar
	@FindBy(how = How.XPATH, using = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/child::li")
	List<WebElement> barMenu;

	// Select by specific category
	public WebElement getBarMenuElement(Titles options) {
		WebElement element;
		switch (options) {
		case WOMEN:
			element = barMenu.get(0);
		case DRESSES:
			element = barMenu.get(1);
		case TSHIRT:
			element = barMenu.get(2);
		default:
			element = null;
		}

		return element;
	}

	public void selectClothe(int index, WebDriver driver) {
		if (index <= productList.size()) {
			WebElement t = productList.get(index);
			Actions action = new Actions(driver);
			action.moveToElement(t).perform();
			addCartBtn.get(index).click();
		}else{
			System.out.println("Index Error");
		}
	}
}
