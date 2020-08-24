Feature: Login to OrangeHRM

  Scenario Outline: Test login with valid credentials
    Given User navigates to OrangeHRM Page
    When User enters <username> and <password>
    And User clicks on Login button
    Then User is navigated to Welcome Page

    @valid
    Examples: 
      | username | password |
      | Admin    | admin123 |

    @invalid
    Examples: 
      | username | password |
      | user1    | test123  |
