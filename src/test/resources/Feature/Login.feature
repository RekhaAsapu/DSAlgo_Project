

    
    Feature: Feature to test Loginfunctionality

  Background: 
    Given user is on DsAlgoAppliction
    When user enters valid username and valid password
    And clicks on login button
    Then user is navigated to home page
    
    
    Scenario: Login with invalid username
    Given User is on the Login Page
    When User  enters a invalid UserName
    Then User should see a Invalid Message
    
    Scenario: Login with invalid password
    Given User is on the Login Page
    When User  enters a invalid passord
    Then User should see a Invalid Message
    
    Scenario: Login with invalid password and invalid username
    Given User is on the Login Page
    When User  enters a invalid password and invalid username
    Then User should see a Invalid Message
   

 