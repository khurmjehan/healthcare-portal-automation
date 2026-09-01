Feature: Healthcare Portal Health Check

  Scenario: stepDefinitions
    Given I launch the Chrome browser
    When I navigate to "https://example.com"
    Then The page title should contain "Example Domain"
    And I close the browser
