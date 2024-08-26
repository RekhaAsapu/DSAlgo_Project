Feature: Array

  Background: Successful login with valid credentials
    Given the user navigates to the login page
    When the user enters a valid username and password
    Then clicks the login button

  Scenario: TS01 - Test the Hyperinks in the Array over view page
    Given the user is on "arrayPage"
    When User will click on "Arrays in Python" HyperLink for array
    Then User will redirected to the page with title "Arrays in Python" in array

  Scenario: TS02 - validate the arrays in Python link
    Given the user is on "arraysinPython"
    When User will click on "Try here" button for array
    Then User will redirected to "Assessment" page with Run button for array

  #Scenario: TS03 - validating the links
    #Given the user is on "assessment"
    #When User will enter code and click on Run button for array
    #Then User should see "something" below the Run button for array

  Scenario: TS04 - Test the Hyperinks in the array over view page
    Given the user is on "arraysinPython"
    When User will click on "Arrays Using List" HyperLink for array
    Then User will redirected to the page with title "Arrays Using List" in array

  Scenario: TS05 - validating the Arrays Using List link
    Given the user is on "arrayUsingList"
    When User will click on "Try here" button for array
    Then User will redirected to "Assessment" page with Run button for array

  #Scenario: TS06 - testing the python code
    #Given the user is on "assessment"
    #When User will enter code and click on Run button for array
    #Then User should see "something" below the Run button for array

  Scenario: TS07 - Test the Hyperinks in the Queue over view page
    Given the user is on "arrayUsingList"
    When User will click on "Basic Operations in Lists" HyperLink for array
    Then User will redirected to the page with title "Basic Operations in Lists" in array

  Scenario: TS08 - validating try here in implementation using array page
    Given the user is on "basicOperList"
    When User will click on "Try here" button for array
    Then User will redirected to "Assessment" page with Run button for array

  #Scenario: TS09 - testing the python code
    #Given the user is on "assessment"
    #When User will enter code and click on Run button for array
    #Then User should see "something" below the Run button for array

  Scenario: TS10 - Test the Queue Operations in Queue OVerview page
    Given the user is on "basicOperList"
    When User will click on "Applications of Array" HyperLink for array
    Then User will redirected to the page with title "Applications of Array" in array

  Scenario: TS11 - Validating the try here
    Given the user is on "AppOfArray"
    When User will click on "Try here" button for array
    Then User will redirected to "Assessment" page with Run button for array

  #Scenario: TS12 -  testing the python code
    #Given the user is on "assessment"
    #When User will enter code and click on Run button for array
    #Then User should see "something" below the Run button

  Scenario: TS13 - Validate the Practice Questions HyperLink
    Given the user is on "AppOfArray"
    When User will click on "Practice Questions" HyperLink for array
    Then User will redirected to "Practice Questions" page for arrayQuestions