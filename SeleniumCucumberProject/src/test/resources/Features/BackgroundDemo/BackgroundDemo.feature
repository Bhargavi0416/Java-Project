
Feature: check the homepage functionality

  Background: user is Logged in
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to homepage

  Scenario: Check the logout function
    When user click on the welcome link
    Then logout link is displayed

  Scenario: verify quick launch toolbar is present
    When user click on dashboard link
    Then quick launch toolbar is diaplayed
