Feature: Login functionality

@SmokeTest
  Scenario: login with valid credentials
    Given user is on the login page
    When user enters the email and password
    And clicks login button
    Then user is navigated to the home page


  Scenario: login with invalid credentials
    Given user is on the login page
    When user enters the email and password
    And clicks login button
    Then user is navigated to the home page