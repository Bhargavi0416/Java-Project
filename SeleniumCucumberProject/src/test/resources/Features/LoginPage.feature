
Feature: Testing the login functionlaities
  I want to use this template for my feature file

  
  Scenario Outline: positive Login test 
    Given browser is open
    And user is on login page
    When user is on Login page enters "<username>" and "<password>"
    And click the sumbit button
    Then it will navigate to home page
    And user need to click the Logout button

  
Examples:

    | username | password    | 
    | student  | Password123 | 
    | student  | Password123 | 
    | student  | Password123 | 