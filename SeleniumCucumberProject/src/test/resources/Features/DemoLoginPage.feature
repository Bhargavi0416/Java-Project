
Feature: Testing the funtionalities with MultipleUsers
  

  Scenario Outline: Login with valid credentials
    Given browser is  open
    And user is on Login Page
    When user is on Login page it enters "<username>" and "<password>"
    And Click on the Login button 
    Then user is navigate to home page 
    Then go to sittings icon and click
    And click on logout button 

    
    Examples:
    
    | username      |    password    |
    | standard_user | secret_sauce   |
    | problem_user  | secret_sauce   |