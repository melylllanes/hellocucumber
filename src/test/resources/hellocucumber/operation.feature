Feature: Operations Test.
  Check operation are working correctly
  Scenario: Addition of 2 numbers
    Given I have entered 25 and 10 into calculator
    When I "a" number1 and number2
    Then I should be 35.0
