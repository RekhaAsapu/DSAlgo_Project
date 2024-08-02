Feature: HomePage Navigation
  As a user
  I want to interact with the dropdown and Get Started buttons
  So that I can navigate to different sections of the website

    Background: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "dsalgoteam" and "Admin@1234"
    And The user click on login button
    Then The user redirected to homepage

  Scenario Outline: Navigate to the respective page by selecting an option from the dropdown
    When I select "<option>" from the dropdown
    Then I should be navigated to the "<expectedPageTitle>" page

    Examples: 
      | option     | expectedPageTitle |
      | Arrays     | arrays            |
      | LinkedList | LinkedList        |
      | Stack      | Stack             |
      | Queue      | Queue             |
      | Tree       | Tree              |
      | Graph      | Graph             |
