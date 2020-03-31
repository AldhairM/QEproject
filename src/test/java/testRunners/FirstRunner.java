package testRunners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;;

@CucumberOptions(
		features = "src/test/resources/featureFiles",
		glue = {"stepDefinitions"},
		tags = "@CheckOut"
		)
public class FirstRunner extends AbstractTestNGCucumberTests{
	
}
