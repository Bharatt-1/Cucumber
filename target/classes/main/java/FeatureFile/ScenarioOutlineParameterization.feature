
Feature: feature to test login Functionality of admin page
  Scenario Outline: Check login is Successful with valid Credentials
    Given user is on the login page of admin
    When user enters the <username> and <password>
    And click on login button
    Then user is navigated to the home page of admin

    Examples:
      | username |  | password |
      | admin    |  | admin    |
      | admin    |  | admin    |