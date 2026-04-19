Feature: Add two numbers
  # Beskriver att vi ska testa att addera tal i olika webbläsare

  Scenario: Adding two numbers
    # Testar addition i webbläsaren Edge
    Given I am using "edge" as browser
    Given I have the frist number 20
    And I have the second number 30
    When I perform add of the two numbers
    Then I receive the result 50

  Scenario: Adding two numbers
    # Testar addition i webbläsaren Chrome
    Given I am using "chrome" as browser
    Given I have the frist number 50
    And I have the second number 30
    When I perform add of the two numbers
    Then I receive the result 80

  Scenario: Adding two numbers
    # Testar addition i webbläsaren Firefox
    Given I am using "firefox" as browser
    Given I have the frist number 5
    And I have the second number 5
    When I perform add of the two numbers
    Then I receive the result 10