  Feature: DataStructure Functionality 
   
   Background: Successful login with valid credentials
   
    Given the user navigates to the login page
    When the user enters a valid username and password
    Then clicks the login button
    
    Scenario: User navigates to the Time Complexity page
    Given the user is on "datastructurepage"
    When the user chooses "Time Complexity" link
    Then The user should land on the 'Time Complexity' page in datastructures section
    
     Scenario: User navigates to the Assessmentpage from TimeComplexitypage
    Given the user is on "TimeComplexitypage"
     When the user chooses "Try Here" link
    Then The user should land on the "Assessment" page in datastructures section
    
      Scenario: User navigates to the Homepage from TimeComplexitypage
    Given the user is on "TimeComplexitypage"
     When the user chooses "Sign out" link
    Then The user should land on the "NumpyNinja" page in datastructures section
    
     Scenario: User navigates to the practice page from Assessmentpage for Datastructures
    Given the user is on "TimeComplexitypage"
    When the user clicks "Practice Questions" link
    Then The user should land on the "Practice Questions" page in datastructures section
   