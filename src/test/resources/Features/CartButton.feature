Feature: Cart Button

  Background:
    Given browser is open

  Scenario: Checking whether the cart button works
    And user is on client page
    When user clicks on cart button
    Then user is navigated to cart page