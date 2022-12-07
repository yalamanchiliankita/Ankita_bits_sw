Feature: Checking logout Functionality

  Scenario: Check logout functionality works properly
    Given browser is open
    And user is on client page
    When user clicks on logout
    Then user is navigated back to the home page



