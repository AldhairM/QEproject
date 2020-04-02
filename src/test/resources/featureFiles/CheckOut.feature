@ChekTransactions
Feature: Validate the transactions

  @CheckOut
   Scenario: User shold proced to CheckOut only a product
   	Given User login "test800@hotmail.com" or "test123"
   	And User selects a product from the women page
   	And User is on CartSummary page
   	When User clicks on procedToCheckOutBtn sometimes
    Then User should validate the confirmation message
