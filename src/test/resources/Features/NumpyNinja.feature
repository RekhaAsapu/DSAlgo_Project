Feature: HomePage Navigation
  As a user
  I want to interact with the dropdown and Get Started buttons
  So that I can navigate to different sections of the website

   Background: Successful login with valid credentials
    Given the user navigates to the login page
    When the user enters a valid username and password
    Then clicks the login button

  Scenario Outline: Navigate to the respective page by selecting an option from the dropdown
    When I select "<option>" from the dropdown
    Then I should be navigated to the "<ExpectedPageTitle>" page

    Examples: 
      | option     | ExpectedPageTitle |
      | Arrays     | Array            |
      | Linked List | Linked List        |
      | Stack      | Stack             |
      | Queue      | Queue             |
      | Tree       | Tree              |
      | Graph      | Graph             |

  Scenario Outline: Navigate to the respective page by selecting an option from the Get Started Button
    When I select "<option>" from the subtitle
    Then I should be navigated to the "<ExpectedPageTitle>"

       Examples: 
      | option     | ExpectedPageTitle |
      | Arrays     | Array            |
      | Linked List | Linked List        |
      | Stack      | Stack             |
      | Queue      | Queue             |
      | Tree       | Tree              |
      | Graph      | Graph             |
