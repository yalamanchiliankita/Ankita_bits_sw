Feature: feature to test login functionality

  Background:
    Given browser is open

  Scenario Outline: Check login is successful with valid credentials
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the client page

    Examples:
      | username | password |
      | y.ankita.rao@gmail.com | 123456 |