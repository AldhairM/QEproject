package testRunners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/resources/featureFiles",
		glue = {"stepDefinitions"},
		tags = "@CheckOut"
		)
public class FirstRunner extends AbstractTestNGCucumberTests{
	/**
	 * You could use this tags:
	 * 	-@LogIn
	 * 		-@ValidCredentials  
	 * 		-@InvalidCredentials
	 * 		-@InvalidCharacters
	 * 		-@BlankLabels
	 * 
	 * 	-@CatalogPage
	 * 		-@Add_a_product
	 * 
	 *  -@ChekTransactions
	 *  	-@CheckOut
	 *  
	 *  -@CreateAnAccount
	 *    	-@CreateValidAccount
	 *      -@CreateInvalidAccount
	 */
}
