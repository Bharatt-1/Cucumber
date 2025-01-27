Feature: Login functionality
  Background: user is on the signin page
    Given user is on the login page of app
    When user enters userid and pass
    And click ok
    Then user is navigated to the home page of app

  Scenario: login with valid credentials and check homepage is displayed
    When user enters the valid-email and valid-password
    And click login button
    Then user is navigated to home page


  Scenario: login with invalid credentials and check loginpage is redirected
    When user enters the invalid-email and invalid-password
    And click login button1
    Then user is navigated to signin page only