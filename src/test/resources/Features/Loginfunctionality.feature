    Feature: Feature to test Loginfunctionality
     
    Scenario Outline: Login with correct username and correct password from Excel
   Given the user is on "loginpage"
   When User  enters a invalid and valid inputs from "<Sheetname>" and  <RowNumber> 
    Then click on login button
    Examples:
    |Sheetname            |RowNumber|
    |LoginUsernamePassword|     1|
  
    
     Scenario Outline: Login with correct username and incorrect password from Excel
   Given the user is on "loginpage"
   When User  enters a invalid and valid inputs from "<Sheetname>" and  <RowNumber> 
    Then click on login button
    Examples:
    |Sheetname            |RowNumber|
    |LoginUsernamePassword|     2|
  
    
     Scenario Outline: Login with incorrect username and correct password from Excel
   Given the user is on "loginpage"
   When User  enters a invalid and valid inputs from "<Sheetname>" and  <RowNumber> 
    Then click on login button
    Examples:
    |Sheetname            |RowNumber|
    |LoginUsernamePassword|     3|
    
     Scenario Outline: Login with incorrect username and incorrect password from Excel
   Given the user is on "loginpage"
   When User  enters a invalid and valid inputs from "<Sheetname>" and  <RowNumber> 
    Then click on login button
    Examples:
    |Sheetname            |RowNumber|
    |LoginUsernamePassword|     4|
    
      Scenario Outline: Login with empty username 
   Given the user is on "loginpage"
   When User  enters a invalid and valid inputs from "<Sheetname>" and  <RowNumber> 
    Then the user should see "Please fill out this field." message for "username"
    Examples:
    |Sheetname            |RowNumber|
    |LoginUsernamePassword|     5|
    
      Scenario Outline: Login with empty password 
   Given the user is on "loginpage"
   When User  enters a invalid and valid inputs from "<Sheetname>" and  <RowNumber> 
    Then the user should see "Please fill out this field." message for "password"
    Examples:
    |Sheetname            |RowNumber|
    |LoginUsernamePassword|     6|
    
      Scenario Outline: Login with empty username and empty password 
   Given the user is on "loginpage"
   When User  enters a invalid and valid inputs from "<Sheetname>" and  <RowNumber> 
    Then the user should see "Please fill out this field." message for "username and password"
    Examples:
    |Sheetname            |RowNumber|
    |LoginUsernamePassword|     7|
    
    
    
    Scenario: User navigates to login page after clicking get started button
    
    Given the user is on "getstartedpage"
    When User clicks on getstarted button in getstarted page
    Then User will be navigated to "NumpyNinja" page
    
    Scenario: User should not access getstated button without login
    Given the user is on "numpyninjapage"
    When User clicks on getstarted button in numpyninja page for "Arrays"
    Then user should get error message saying "You are not logged in"
