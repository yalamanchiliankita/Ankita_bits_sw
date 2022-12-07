Feature: Checking logout Functionality
  Background:
    Given browser is open
    And user is on login page

  Scenario: Check logout functionality works properly
    And user enters credentials with clicking login
    And user is on client page
    When user clicks on logout
    Then user is navigated back to the home page



