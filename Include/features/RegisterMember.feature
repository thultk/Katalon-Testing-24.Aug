Feature: Register member
	@smoke
  Scenario: Test register member successfully
    Given User navigates to CMS Page
    When User clicks on SignUp link
    And User enters username
    And User enters email
    And User enters fullmane
    And User selects gender
    And User enters password
    And User enters confirmpassword
    And User clicks on Registration button
    Then Successful message displays
