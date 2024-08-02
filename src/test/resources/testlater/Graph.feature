 Feature: Graph Functionality
 
   Background: Successful login with valid credentials
    Given the user navigates to the login page
    When the user enters a valid username and password
    Then clicks the login button
    
    Scenario: User navigates to the graph page
    Given the user is on homepage
    When the user clicks on the get started link
    Then the user should be redirected to the graph page
    
    Scenario: User navigates to the graph Representations page
    Given the user is on graph page
    When user clicks Graph representations
    Then user should be navigated to Graph Representations page
    
    Scenario: User navigates to the Assessment page
    Given the user is on graph Representations page
    When user clicks Tryhere button
    Then user should be navigated to Assessment page
    
    Scenario: User navigates to the Assessment page
    Given user is on Assessment page with run button
    When user enters some code in editor
    And clicks Run button
    Then user should see output
    
    