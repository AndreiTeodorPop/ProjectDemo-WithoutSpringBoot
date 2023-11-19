Feature: Register feature

  Scenario: Register functionality
    Given I have navigated to register page
    When I enter first and last name to Full Name box
    Then I refresh the page and navigate to Home Page