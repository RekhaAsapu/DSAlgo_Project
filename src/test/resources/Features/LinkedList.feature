# hi i created a new branch
Feature: Linked List Navigation and Interaction

  Background: Successful login with valid credentials
    Given the user navigates to the login page
    When the user enters a valid username and password
    Then clicks the login button
    

  Scenario: User navigates to Introduction from linkedlistpage
    Given the user is on "linkedlistpage"
    When the user selects "Introduction" button
    Then the user should land on the "Introduction" page
    
      Scenario: User navigates to the Homepage from linkedlistpage
    Given the user is on "linkedlistpage"
     When the user selects "Sign out" button
    Then the user should land on the "NumpyNinja" page
    
  Scenario: User navigates to tryEditor from Introductionpage
    Given the user is on "Introductionpage"
    When the user selects "Try Here" button
    Then the user should land on the "Assessment" page
    
     Scenario: User navigates to the Homepage from Introductionpage
    Given the user is on "Introductionpage"
       When the user selects "Sign out" button
    Then the user should land on the "NumpyNinja" page
    
    

  Scenario: User navigates to Creating Linked List page from linkedlistpage
    Given the user is on "linkedlistpage"
    When the user selects "Creating Linked LIst" button
    Then the user should land on the "Creating Linked LIst" page


    
  Scenario: User navigates to tryEditor from Creating Linked LIst page
    Given the user is on "CreatingLinkedLIstpage"
    When the user selects "Try Here" button
    Then the user should land on the "Assessment" page
    
     Scenario: User navigates to the Homepage from CreatingLinkedLIstpage
    Given the user is on "CreatingLinkedLIstpage"
   When the user selects "Sign out" button
    Then the user should land on the "NumpyNinja" page
    
  Scenario: User navigates to Types of Linked List from linkedlistpage
    Given the user is on "linkedlistpage"
    When the user selects "Types of Linked List" button
    Then the user should land on the "Types of Linked List" page
    

  Scenario: User navigates to tryEditor from Types of Linked List page
    Given the user is on "TypesofLinkedListpage"
    When the user selects "Try Here" button
    Then the user should land on the "Assessment" page
    
     Scenario: User navigates to the Homepage from TypesofLinkedListpage
    Given the user is on "TypesofLinkedListpage"
       When the user selects "Sign out" button
    Then the user should land on the "NumpyNinja" page
    

  Scenario: User navigates to Implement Linked List in Python from linkedlistpage
    Given the user is on "linkedlistpage"
    When the user selects "Implement Linked List in Python" button
    Then the user should land on the "Implement Linked List in Python" page 
    

  Scenario: User navigates to tryEditor from ImplementLinkedListinPythonpage
    Given the user is on "ImplementLinkedListinPythonpage"
    When the user selects "Try Here" button
    Then the user should land on the "Assessment" page
    
     Scenario: User navigates to the Homepage from ImplementLinkedListinPythonpage
    Given the user is on "ImplementLinkedListinPythonpage"
       When the user selects "Sign out" button
    Then the user should land on the "NumpyNinja" page
    

  Scenario: User navigates to Traversal from linkedlistpage
    Given the user is on "linkedlistpage"
    When the user selects "Traversal" button
    Then the user should land on the "Traversal" page
    
    

  Scenario: User navigates to tryEditor from Traversalpage
    Given the user is on "Traversalpage"
    When the user selects "Try Here" button
    Then the user should land on the "Assessment" page
    
     Scenario: User navigates to the Homepage from Traversalpage
    Given the user is on "Traversalpage"
        When the user selects "Sign out" button
    Then the user should land on the "NumpyNinja" page
    

  Scenario: User navigates to Insertion from linkedlistpage
    Given the user is on "linkedlistpage"
    When the user selects "Insertion" button
    Then the user should land on the "Insertion" page

    
  Scenario: User navigates to tryEditor from Insertionpage
    Given the user is on "Insertionpage"
    When the user selects "Try Here" button
    Then the user should land on the "Assessment" page
    
     Scenario: User navigates to the Homepage from Insertionpage
    Given the user is on "Insertionpage"
       When the user selects "Sign out" button
    Then the user should land on the "NumpyNinja" page
    

  Scenario: User navigates to Deletion from linkedlistpage
    Given the user is on "linkedlistpage"
    When the user selects "Deletion" button
    Then the user should land on the "Deletion" page
    
    

  Scenario: User navigates to tryEditor from Deletionpage
    Given the user is on "Deletionpage"
    When the user selects "Try Here" button
    Then the user should land on the "Assessment" page
    

  Scenario: User navigates to Practice Questions from linkedlistpage
    Given the user is on "Deletionpage"
    When the user selects "Practice Questions" button
    Then the user should land on the "Practice Questions" page
