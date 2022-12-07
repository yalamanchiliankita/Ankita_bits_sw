Feature: Checking logout Functionality
  Background:
    Given browser is open

  Scenario: Check logout functionality works properly
    And user is on client page
    When user clicks on logout
    Then user is navigated back to the home page



