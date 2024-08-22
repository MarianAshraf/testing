Feature: Create Survey
  Scenario Outline: Create Survey Scenario
    Given user click on survey from dashboard
    When  user click on create button
    And   choose survey from list bix
    And   fill "<title>" and click create
    Then  make sure that the survey is already added
    Examples:
    |          title             |
    |         meridian            |
    |         Amazing Survey     |
    |      Survey for Testing    |
