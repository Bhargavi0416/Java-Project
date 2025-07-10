
Feature: User Login
  I want to use this template for my feature file

  @smokeHook
  Scenario: Successful Login with valid credentials
    Given the user is on the login page
    When user is login user enters username and password
    Then user should be redirected to the dashboard
    
   @smokeHook 
    Scenario: Successful login with invalid credentials
    Given the user is on the login page
    When user is login user enters invalid username and password
    Then user should be redirected to the dashboard
    
  