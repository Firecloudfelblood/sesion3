Feature: Go to mercado libre

  Scenario: Go to mercado libre and search for an item
    Given I´m on mercado libre page
    And I search for "Vinyl"
    When I Select the first item
    Then I Validate the first Item price more than 0.0