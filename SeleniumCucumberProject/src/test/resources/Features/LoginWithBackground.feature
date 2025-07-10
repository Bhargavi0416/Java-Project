
Feature: User Login
  I want to use this template for my feature file
  
  Background:
     Given user is on the login page
     And user enters valid credentials
  
  
  
  Scenario: Successful login credentials
    When the user click the "login" button
    Then the user should be redirected to the "home" page
    

  
  Scenario: Logout funtionalities
    Given the user is logged in
    When the user clicks the  "Logout" button
    Then the user should be redirected to the "login" page

    
