Feature: Checking Sign Up functionality works

  Scenario: Check Sign Up functionality
    Given user is on Main page
    When user clicks on sign up button
    Then user is directed to registeration page

  Scenario: Check Successful Sign up
    Given user is on registration page
    And user enters the details
    When user clicks on register
    Then the browser is navigated to login page

