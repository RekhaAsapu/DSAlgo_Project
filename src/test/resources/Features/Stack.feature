
@tag
Feature:  Stack 
  I want to use this template for my feature file
  
 Background: Successful login with valid credentials
    Given the user navigates to the login page
    When the user enters a valid username and password
    Then clicks the login button
 
 #Ts1
  @tag1
  Scenario: DsAlgo Application
  Given User is on "homePage" page with title "NumpyNinja"
  When User will click on "GetStarted" button for StackPage
  Then User will redirected to StackPage
  
  #Ts2
  Scenario: validating the StackPage
  Given  User is on "stackPage" page with title "Stack"
  When  User will click on "Operations in Stack" link
  Then  User will redirect to the "Operations in Stack" page title
  
    #Ts03
  Scenario: validate the "Operations in stack" Hyperlink
    Given User is on "operationsStack" page with title "Operations in Stack"
    When  User will click on "Try Here" button for stack
    Then  User will redirected to a page with TryEditor with Run button to Test
    
    #Ts04
    Scenario: validate the "TryEditorSpace" page
     Given User is on "assessment" page with title "Assessment"
     When  User will enter code and click on run button
     Then  User will see "something" below the run button
     
     #Ts05 
   Scenario: Validate the "Implimentation" HyperLink
    Given  User is on "operationsStack" page with title "Operations in Stack"
    When   User will click on "Implementation" link
    Then   User will redirect to the "Implementation" page title
    
    #Ts06
    Scenario: Validating the "Implimentation"
    Given  User is on "implementation" page with title "Implementation"
    When   User will click on "Try Here" button for stack
    Then   User will redirected to a page with TryEditor with Run button to Test 
    
    #Ts07
    Scenario: validating the tryEditorSpace
    Given User is on "assessment" page with title "Assessment"
    When  User will enter code and click on run button 
    Then  User will see "something" below the run button 
   
    #Ts08
    Scenario: Validate the  "Applications" HyperLink
    Given  User is on "implementation" page with title "Implementation"
    When   User will click on "Applications" link 
    Then   User will redirect to the "Applications" page title
    
     
    #Ts09
     Scenario: Validating the "Applications"
    Given  User is on "applications" page with title "Applications" 
    When   User will click on "Try Here" button for stack
    Then   User will redirected to a page with TryEditor with Run button to Test 
    
    #Ts10
    Scenario: validating the tryeditorSpace
    Given User is on "assessment" page with title "Assessment"
    When  User will enter code and click on run button 
    Then  User will see "something" below the run button
    
    #Ts11
     Scenario: Validate the "Practice Questions" HyperLink
    Given  User is on "applications" page with title "Applications" 
    When   User will click on "Practice Questions" link
    Then   User will redirected to "Practice Questions" page for stackQuestions
      

  
