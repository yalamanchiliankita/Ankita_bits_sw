Feature: feature to test login functionality

  Background:
    Given browser is open

  Scenario: Check login is unsuccessful with invalid credentials
    And user is on login page
    When user enters credentials
    Then user is navigated to the same page
    And user clicks on login


