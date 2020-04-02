package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SetUpClassDefinition {
	private String baseUrl;
	public static WebDriver driver;
	
	@Before
	public void setUp() {
		baseUrl = "http://automationpractice.com/index.php";
		System.setProperty("webdriver.chrome.driver", "src//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
