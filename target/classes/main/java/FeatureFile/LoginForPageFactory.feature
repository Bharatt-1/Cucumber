
Feature: feature to test login Functionality

 Scenario: Check login is Successful
    Given user is on the login page
    When user enters the correct username and correct password
    And click on login button
    Then user is navigated to the home page

