

    
    Feature: Feature to test Loginfunctionality
  
    Scenario Outline: Login with invalid input and valid input from Excel
    "<Sheetname>" and <RowNumber>
    Given User is on the Login Page    
   When User  enters a invalid and valid inputs from "<Sheetname>" and  <RowNumber> 
    Then click on login button
    Examples:
    |Sheetname            |RowNumber|
    |LoginUsernamePassword|     1|
    |LoginUsernamePassword|     2|
    |LoginUsernamePassword|     3|
    |LoginUsernamePassword|     4|
    
    
    
   
   

 