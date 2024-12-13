Feature: Login Functionality

  Scenario: Login with username and password - Positive Scenario
    Given Enter UserName
    And Enter Password
    Then click Login
    And verify HomePage
