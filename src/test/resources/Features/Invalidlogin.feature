Feature: feature to test login functionality

  Scenario: Check login is unsuccessful with invalid credentials
    Given browser is open
    And user is on login page
    When user enters username and password
    Then user is navigated to the same page
    And user clicks on login


