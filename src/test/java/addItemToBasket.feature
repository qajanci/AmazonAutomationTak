@search
Feature: Search Feature- Amazon
  As an user
  I want to search for a product
  So that I can choose and add to basket


  Scenario: Search product
    Given I am on amezon home page
    When  I search for a product
    Then  I should see the product in the search result
    When  I choose the first product
    And   I add product to basket
    Then  basket is updated with an item count
