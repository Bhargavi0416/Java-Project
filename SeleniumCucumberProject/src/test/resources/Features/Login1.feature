#Author
#Date
#Description
Feature: Feature to test the login functionality

  Scenario: Successful login with valid credentials
    Given User is on login page
    When the user is on login enters username and password
    And click the login button
    Then user is navigated to the home page
