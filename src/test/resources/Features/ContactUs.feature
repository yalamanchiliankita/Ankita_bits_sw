Feature: Checking whether user is navigated to contact us page

  Background:
    Given user is on login page

  Scenario: User navigated to the contact us page
    When user clicks on contact us option
    Then user is directed to contact details page
