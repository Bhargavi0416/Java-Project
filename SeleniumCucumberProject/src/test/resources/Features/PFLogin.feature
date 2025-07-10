
Feature: Test the Login Functionality
 

  Scenario: Negative Username test 
  Given Browser is open
  And user is on the Login page 
  When user enter invalid  username and password
  And click on the submit button
  Then verify error message should be displayed
  And error message text should be "Your username is invalid!"
  
   

  
