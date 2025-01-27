Feature: Login Functionality using POM
  Scenario Outline: Check login Using POM
  Given user is on the login page of admin
  When user enters the <username> and <password>
  And click on login button
  Then user is navigated to the home page of admin

    Examples:
      | username |  | password |
      | admin    |  | admin    |
      | admin    |  | admin    |