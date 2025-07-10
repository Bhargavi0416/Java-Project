
Feature: Testing the Pratice Login page functionalities
  I want to use this template for my feature file

  
  Scenario: Positive Login Test
    Given Browser  is  open
    And user is on the login page
    When user is on login page enters username and Password
    And user click the submit button
    Then it will navigate to the home page
    And URL should contain "practicetestautomation.com/logged-in-successfully/"
    And page should display success message
    Then Click on the Logout
    
  