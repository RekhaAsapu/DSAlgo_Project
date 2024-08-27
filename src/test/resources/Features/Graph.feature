 Feature: Graph Functionality
 
   Background: Successful login with valid credentials
    Given the user navigates to the login page
    When the user enters a valid username and password
    Then clicks the login button
    
    Scenario: User navigates to the graphgraphpage
    Given the user is on "graphpage"
    When the user clicks "Graphgraph" link
    Then The user should land on the 'Graph' page in graphsection
    
     Scenario: User navigates to the Homepage from graphpage
    Given the user is on "graphpage"
     When the user chooses "Sign out" link
    Then The user should land on the "NumpyNinja" page in datastructures section
    
     Scenario: User navigates to the Assessmentpage
    Given the user is on "graphgraphpage"
     When the user clicks "Try Here" link
    Then The user should land on the "Assessment" page in graphsection
    
     Scenario: User navigates to the Homepage from graphgraphpage
    Given the user is on "graphgraphpage"
     When the user chooses "Sign out" link
    Then The user should land on the "NumpyNinja" page in datastructures section
   
    
    Scenario: User navigates to the graph Representations page from Assessmentpage
    Given the user is on "graphpage"
    When the user clicks "Graph representations" link
    Then The user should land on the "Graph Representations" page in graphsection
    
    Scenario: User navigates to the Assessmentpage
    Given the user is on "graphRepresentationspage"
     When the user clicks "Try Here" link
    Then The user should land on the "Assessment" page in graphsection
    
     Scenario: User navigates to the Homepage from graphRepresentationspage
    Given the user is on "graphRepresentationspage"
     When the user chooses "Sign out" link
    Then The user should land on the "NumpyNinja" page in datastructures section
    
    
    
    Scenario: User should able to see output
    Given the user is on "assessmentpage"
    When user enters some code in editor
    And clicks Run button
    Then user should see output in graphsection
    
    
    Scenario: User navigates to the practice page from Assessmentpage
    Given the user is on "graphgraphpage"
    When the user clicks "Practice Questions" link
    Then The user should land on the "Practice Questions" page in graphsection
    
  
    
    Scenario: User navigates to the Assessmentpage
    Given the user is on "practicepage"
    When the user clicks "Sign out" link
    Then The user should land on the "NumpyNinja" page in graphsection
    
  
    