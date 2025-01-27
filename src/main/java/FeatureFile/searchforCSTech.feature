Feature: feature to search CSTech and check google functionality
  Scenario: validate google search with CSTech
    Given browser is open
    And user is on the google search page
    When user enters the CSTech in search box
    And clicks enter button
    Then user is navigated to CSTech webpage