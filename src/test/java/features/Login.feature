Feature: Login Feature Scenario SauceLab

  Scenario: This scenario is to define the login happy path
    Given I have launched the application
    When I enter the correct username and password
    And I click on the LOGIN Button
    Then I should land on the home page

  @regression
  Scenario: This sceanrio is to define the failure path
    When I enter the incorrect username and password
    And I click on the LOGIN Button
    Then I should get the error message "Epic sadface: Username and password do not match any user in this service"

  @sanity
  Scenario Outline: This sceanrio is to define the failure path
    When I enter the username as "<UserName>" and Password as "<Password>"
    And I click on the LOGIN Button
    Then I should get the error message "Epic sadface: Username and password do not match any user in this service"

    Examples: 
      | UserName    | Password |
      | abc@xyz.com | Abc@1234 |
      | pqr@xyz.com | Ert@1234 |
