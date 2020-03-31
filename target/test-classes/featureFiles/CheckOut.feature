@ChekTransactions
Feature: Verify all the ways to buy a product

  @CheckOut
   Scenario: User shold proced to CheckOut only a product
   	Given User login "test800@hotmail.com" or "test123"
   	When User selects a product from the women page
    And User validate all CheckOut statements
    Then User should validate the confirmation message
