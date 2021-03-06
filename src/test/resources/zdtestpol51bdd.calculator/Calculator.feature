Feature: basic calculator functions
  Scenario: adding two numbers
    Given I have a calculator
    When I add 2 and 3
    Then I should get 5