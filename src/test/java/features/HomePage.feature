Feature: Homepage Feature Scenario

  Background: 
    Given I have launched the application
    And I enter the correct username and password
    And I click on the LOGIN Button

  Scenario: This scenario is to add the products to the cart
    When I click on Add to Cart on product "Sauce Labs Backpack"
    Then Basket item number should be 1
