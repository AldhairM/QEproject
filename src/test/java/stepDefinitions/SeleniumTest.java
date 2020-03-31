package stepDefinitions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:/Users/test.admin/Desktop/academia-2020/SeleniumText/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();

		  //Open the URL in chrome browser
		  driver.get("http://automationpractice.com/index.php");
		  
		  String homePage = driver.getCurrentUrl();
		  //Print the value of variable in the console
		  System.out.println("The current URL is " + homePage);

		  driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]")).click();
		  System.out.println("We go to login page");
		  
		  String loginPage = driver.getCurrentUrl();
		  //Print the value of variable in the console
		  System.out.println("The current URL is " + loginPage);

		  WebElement txt = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]"));
		  driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
		  System.out.println("We clic the Email Txtbox");	
		  
		  String expectedClass = "form-group form-error";
		  String actualClass = "";
		  
		  actualClass = txt.getAttribute("class");
		  if (actualClass.equals(expectedClass)) {
			  System.out.println("All its okay");
		  }
		  else {
			  System.out.println("Error detected");
		  }
		  
		  driver.quit();
	}

}
