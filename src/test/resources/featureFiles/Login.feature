
@LogIn
Feature: Log in Page
  As a user I should be able to log in
  So I can buy products
  
  @ValidCredentials
  Scenario: User should be able to login
    Given User is on login page
    When User enters username as "test800@hotmail.com"
    And User enters password as "test123"
    And User click on sign in buttom
    Then User should be logged correctly
    
  @InvalidCredentials
  Scenario: User should not be able to login
    Given User is on login page
    When User enters username as "00@hotmail.com"
    And User enters password as "test1234"
    And User click on sign in buttom
    Then An error message Arraised
	
	@InvalidCharacters
	Scenario: User should see an error visibility about enter 
						invalid characters
	Given User is on login page
	When User enters username as "123asdlñ!"
	And User click out of the username
	Then An visual error arraised
	
	@BlankLabels
  Scenario: User should not be able to login
    Given User is on login page
    When User enters username as ""
    And User enters password as ""
    And User click on sign in buttom
    Then An error message Arraised
