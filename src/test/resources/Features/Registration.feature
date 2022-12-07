Feature: Testing registration successful

  Background:
    Given browser is open

  Scenario: Check Registration successful
    And user is on registration page
    And user enters the details
    When user clicks on register
    Then the browser is navigated to login page
