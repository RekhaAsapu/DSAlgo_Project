@tag
Feature: Queue
  
  Background: Successful login with valid credentials
    Given the user navigates to the login page
    When the user enters a valid username and password
    Then clicks the login button
    
   #Ts01 
   @tag1
  Scenario: Open "Queue" page
  Given  User is on "homePage" page with title "NumpyNinja"
  When   User will click on Queue "Get Started" button  
  Then   User will redirected to the Queue over view  page
  
  #Ts02 
  Scenario: Test the Hyperinks in the Queue over view page
  Given  User is on "queuePage" page with title "Queue"
  When   User will click on "Implementation of Queue in Python" HyperLink
  Then   User will redirected to the page with title "Implementation of Queue in Python"
  
  #Ts03
  Scenario:
  Given User is on "implQueueinPython" page with title "Implementation of Queue in Python"
  When  User will click on "Try here" button 
  Then  User will redirected to "Assessment" page with Run button 
   
  #Ts04
  Scenario:
  Given User is on "assessment" page with title "Assessment"  
  When  User will enter code and click on Run button
  Then  User should see "something" below the Run button 
   
  
  #Ts06
  Scenario: Test the Hyperinks in the Queue over view page
  Given   User is on "implQueueinPython" page with title "Implementation of Queue in Python"
  When   User will click on "Implementation using collections.deque" HyperLink 
  Then   User will redirected to the page with title "Implementation using collections.deque"
  
  #Ts07
  Scenario: validating the implementation using collections deque link
  Given  User is on "implCollecDequeinPython" page with title "Implementation using collections.deque" 
  When   User will click on "Try here" button
  Then   User will redirected to "Assessment" page with Run button
  
  #Ts08
  Scenario: testing the python code
  Given User is on "assessment" page with title "Assessment"    
  When  User will enter code and click on Run button
  Then  User should see "something" below the Run button  
  
  #Ts09
  Scenario: Test the Hyperinks in the Queue over view page
  Given   User is on "implCollecDequeinPython" page with title "Implementation using collections.deque"
  When   User will click on "Implementation using array" HyperLink 
  Then   User will redirected to the page with title "Implementation using array"
  
  #Ts10
  Scenario: validating try here in implementation using array page
  Given  User is on "implUsingArray" page with title "Implementation using array" 
  When   User will click on "Try here" button
  Then   User will redirected to "Assessment" page with Run button
  
   #Ts11
  Scenario: testing the python code
  Given User is on "assessment" page with title "Assessment"  
  When  User will enter code and click on Run button
  Then  User should see "something" below the Run button  
  
  #Ts12
  Scenario: Test the Queue Operations in Queue OVerview page
  Given  User is on "implUsingArray" page with title "Implementation using array"
  When   User will click on "Queue Operations" HyperLink 
  Then   User will redirected to the page with title "Queue Operations"
  
  #Ts13
  Scenario:  Validating the try here
  Given  User is on "queueOper" page with title "Queue Operations"
  When   User will click on "Try here" button
  Then   User will redirected to "Assessment" page with Run button
  
  Scenario: testing the python code
  Given User is on "assessment" page with title "Assessment"  
  When  User will enter code and click on Run button
  Then  User should see "something" below the Run button 
  
 
  #Ts14
  Scenario: Validate the "Practice Questions" HyperLink
  Given User is on "queueOper" page with title "Queue Operations"
  When  User will click on "Practice Questions" HyperLink
  Then  User will redirected to "Practice Questions" page for queueQuestions
  
  
  
  
  
  