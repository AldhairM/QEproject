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
	
	@FindBy(how = How.CSS, using = "a[title='Proceed to checkout']")
	WebElement procedChkOutBtn;

	@FindBy(className = "product_img_link")
	List<WebElement> productList;

	@FindBy(xpath = "//span[text()='Add to cart']")
	List<WebElement> addCartBtn;

	@FindBy(xpath = "//span[text()='More']")
	List<WebElement> moreBtn;
	// Declare my head bar
	@FindBy(id="quantity_wanted")
	WebElement quantityLbl;

	@FindBy(xpath = "//a[@title=\'Women\']")
	WebElement womenCatalog;
	
	public void selectClothetoAdd(int index, WebDriver driver) {
		womenCatalog.click();
		if (index <= productList.size()) {
			WebElement item = productList.get(index);
			Actions action = new Actions(driver);
			action.moveToElement(item).perform();
			addCartBtn.get(index).click();
		}else{
			System.out.println("Index Error");
		}
	}
	
	public void procedToCheckOutBtn() {
		procedChkOutBtn.click();
	}
	

	public void selectClothetoMore(int index, WebDriver driver) {
		womenCatalog.click();
		if (index <= productList.size()) {
			WebElement item = productList.get(index);
			Actions action = new Actions(driver);
			action.moveToElement(item).perform();
			moreBtn.get(index).click();
		}else{
			System.out.println("Index Error");
		}
	}
	
	
	public void addClothe(int quantity) {
		quantityLbl.clear();
		quantityLbl.sendKeys(String.valueOf(quantity));
		addCartBtn.get(0).click();
		procedChkOutBtn.click();
	}
}
