package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SetUpClassDefinition {
	public static WebDriver driver;
	private String baseUrl;
	
	@Before
	public void setUp() {
		// Write code here that turns the phrase above into concrete actions
		baseUrl = "http://automationpractice.com/index.php";
		
		System.setProperty("webdriver.chrome.driver", "src\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Assert.assertTrue(driver.getCurrentUrl().equals(baseUrl));
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
