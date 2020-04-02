@CatalogPage
Feature: Validate the item catalog

  @Add_a_product
  Scenario: User should add a new product
    Given User should select a product from the women page
    When User should add 25 items on cart
    Then Validate the 25 products into the cart
