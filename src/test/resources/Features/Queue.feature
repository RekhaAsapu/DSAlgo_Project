@tag
Feature: Queue

  Background: Successful login with valid credentials
    Given the user navigates to the login page
    When the user enters a valid username and password
    Then clicks the login button

  Scenario: TS01 - Test the Hyperinks in the Queue over view page
    Given the user is on "queuePage"
    When User will click on "Implementation of Queue in Python" HyperLink
    Then User will redirected to the page with title "Implementation of Queue in Python"

  Scenario: TS02 - validate the implementation in python link
    Given the user is on "implQueueinPython"
    When User will click on "Try here" button
    Then User will redirected to "Assessment" page with Run button

  #Scenario: TS03 - validating the links
    #Given the user is on "assessment"
    #When User will enter code and click on Run button
    #Then User should see "something" below the Run button

  Scenario: TS04 - Test the Hyperinks in the Queue over view page
    Given the user is on "implQueueinPython"
    When User will click on "Implementation using collections.deque" HyperLink
    Then User will redirected to the page with title "Implementation using collections.deque"

  Scenario: TS05 - validating the implementation using collections deque link
    Given the user is on "implCollecDequeinPython"
    When User will click on "Try here" button
    Then User will redirected to "Assessment" page with Run button

  #Scenario: TS06 - testing the python code
    #Given the user is on "assessment"
    #When User will enter code and click on Run button
    #Then User should see "something" below the Run button

  Scenario: TS07 - Test the Hyperinks in the Queue over view page
    Given the user is on "implCollecDequeinPython"
    When User will click on "Implementation using array" HyperLink
    Then User will redirected to the page with title "Implementation using array"

  Scenario: TS08 - validating try here in implementation using array page
    Given the user is on "implUsingArray"
    When User will click on "Try here" button
    Then User will redirected to "Assessment" page with Run button

  #Scenario: TS09 - testing the python code
    #Given the user is on "assessment"
    #When User will enter code and click on Run button
    #Then User should see "something" below the Run button

  Scenario: TS10 - Test the Queue Operations in Queue OVerview page
    Given the user is on "implUsingArray"
    When User will click on "Queue Operations" HyperLink
    Then User will redirected to the page with title "Queue Operations"

  Scenario: TS11 - Validating the try here
    Given the user is on "queueOper"
    When User will click on "Try here" button
    Then User will redirected to "Assessment" page with Run button

  #Scenario: TS12 - testing the python code
    #Given the user is on "assessment"
    #When User will enter code and click on Run button
    #Then User should see "something" below the Run button

  Scenario: TS13 - Validate the Practice Questions HyperLink
    Given the user is on "queueOper"
    When User will click on "Practice Questions" HyperLink
    Then User will redirected to "Practice Questions" page for queueQuestions
