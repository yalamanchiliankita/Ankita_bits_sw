Feature:

  Background:
    Given browser is open
    And user is on login page

  Scenario: Checking whether the cart button works
    When user clicks on cart button
    Then user is navigated to cart page