Feature: Calculator
  # Beskriver att detta är en testfil för en kalkylator

  Background: Happens before each test
    # Detta körs automatiskt före varje enskilt scenario (testfall)
    Given the test case start with this
    And then something else happens

  Scenario Outline: Add two numbers
    # En mall för att köra många liknande tester med olika siffror
    Given I have two numbers <frist> and <second>
    When I <operation> the two numbers
    Then I get the result <result>

    Examples:
      # En tabell med testdata (indata och det förväntade resultatet)
      | frist | second | operation | result |
      | 10.0  | 20.0   | add       | 30.0   |
      | 125.0 | 375.0  | add       | 500.0  |
      | -35   | 45     | add       | 10     |
      | 50.0  | 35.0   | subtract  | 15.0   |
      | 7     | 3      | multiply  | 21     |
      | 45    | 3      | divide    | 15     |
      | 5     | 5      | multiply  | 25     |
      | 1000  | 10     | divide    | 100    |

  # Enskilda testfall för subtraktion (minus)
  Scenario: Subtract two numbers
    Given I have two numbers 50.0 and 20.0
    When I subtract the two numbers
    Then I get the result 30.0

  Scenario: Subtract two numbers
    Given I have two numbers 100.0 and 20.0
    When I subtract the two numbers
    Then I get the result 80.0

  Scenario: Subtract two numbers
    Given I have two numbers 50.0 and 20.0
    When I subtract the two numbers
    Then I get the result 30.0