@CreateAnAccount
Feature: Title of your feature
  I want to use this template for my feature file

  @CreateValidAccount
  Scenario Outline: User will create a new account 
    Given User enter an <email> on new emailLabel
		When User press createAnAccountBtn
		And User enters all the <information> on form,<email> and <password>
		And User register the information	
		Then User login

    Examples: 
      | 			email			  	| password	 | 		information  |
      | "aaaasdasd@asdas.com" |  "pass234" |	 "src//data//data.xlsx"	 |
  
  @CreateInvalidAccount
  Scenario Outline: User try to create a new account with an email registered
    Given User enter an <email> on new emailLabel
		When User press createAnAccountBtn
		Then An error message appears on the page

    Examples: 
      | 			email			  |
      | "test800@hotmail.com" |  

