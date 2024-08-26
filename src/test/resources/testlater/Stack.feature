@tag
Feature: Stack
  I want to use this template for my feature file

  Background: Successful login with valid credentials
    Given the user navigates to the login page
    When the user enters a valid username and password
    Then clicks the login button

  Scenario: TS01 - validating the StackPage
    Given the user is on "stackPage"
    When User will click on "Operations in Stack" link
    Then User will redirect to the "Operations in Stack" page title

  Scenario: TS02 - validate the "Operations in stack" Hyperlink
    Given the user is on "operationsStack"
    When User will click on "Try Here" button for stack
    Then User will redirected to a page with TryEditor with Run button to Test

  #Scenario: TS03 - validate the "TryEditorSpace" page
    #Given the user is on "assessment"
    #When User will enter code and click on run button
    #Then User will see "something" below the run button

  Scenario: TS04 - Validate the "Implimentation" HyperLink
    Given the user is on "operationsStack"
    When User will click on "Implementation" link
    Then User will redirect to the "Implementation" page title

  Scenario: TS05 - Validating the "Implimentation"
    Given the user is on "implementation"
    When User will click on "Try Here" button for stack
    Then User will redirected to a page with TryEditor with Run button to Test

  #Scenario: TS06 - validating the tryEditorSpace
    #Given the user is on "assessment"
    #When User will enter code and click on run button
    #Then User will see "something" below the run button

  Scenario: TS07 - Validate the  "Applications" HyperLink
    Given the user is on "implementation"
    When User will click on "Applications" link
    Then User will redirect to the "Applications" page title

  Scenario: TS08 - Validating the "Applications"
    Given the user is on "applications"
    When User will click on "Try Here" button for stack
    Then User will redirected to a page with TryEditor with Run button to Test

  #Scenario: TS09 - validating the tryeditorSpace
    #Given the user is on "assessment"
    #When User will enter code and click on run button
    #Then User will see "something" below the run button

  Scenario: TS10 - Validate the "Practice Questions" HyperLink
    Given the user is on "applications"
    When User will click on "Practice Questions" link
    Then User will redirected to "Practice Questions" page for stackQuestions
