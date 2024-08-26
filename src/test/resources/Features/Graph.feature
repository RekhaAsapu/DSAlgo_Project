 Feature: Graph Functionality
 
    Background: Successful login with valid credentials
    Given the user navigates to the login page
    When the user enters a valid username and password
    Then clicks the login button
    
    #Ts01
    Scenario: User navigates to the graphgraphpage
    Given the user is on "graphpage"
    When the user clicks "Graphgraph" link
    Then The user should land on the 'Graph' page in graphsection
    
    #Ts02
    Scenario: User navigates to the Assessmentpage
    Given the user is on "graphgraphpage"
    When the user clicks "Try Here" link
    Then The user should land on the "Assessment" page in graphsection
   
    #Ts03
    Scenario: User navigates to the graph Representations page from Assessmentpage
    Given the user is on "graphpage"
    When the user clicks "Graph representations" link
    Then The user should land on the "Graph Representations" page in graphsection
    
    #Ts04
    Scenario: User navigates to the Assessmentpage
    Given the user is on "graphRepresentationspage"
    When the user clicks "Try Here" link
    Then The user should land on the "Assessment" page in graphsection
    
    #Ts05
    Scenario: User should able to see output
    Given the user is on "assessmentpage"
    When user enters some code in editor
    And clicks Run button
    Then user should see output in graphsection
    
    #Ts06
    Scenario: User navigates to the practice page from Assessmentpage
    Given the user is on "graphgraphpage"
    When the user clicks "Practice Questions" link
    Then The user should land on the "Practice Questions" page in graphsection
    
    #Ts07
    Scenario: User navigates to the Assessmentpage
    Given the user is on "practicepage"
    When the user clicks "signout" link
    Then The user should land on the "NumpyNinja" page in graphsection
  
    