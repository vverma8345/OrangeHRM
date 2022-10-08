Feature: Login feature
  As a tester, I want to validate the user login feature. Both valid and invalid login scenarios will be covered.

  @smoke
  Scenario: I verify login function with valid user on login page
    Given I navigate to the login page
    And   I enter the "username" as username and "password" as password
    Then  I click on the login button


  @regression
  Scenario Outline: I verify login function with invalid user on login page
    Given I navigate to the login page
    And   I enter the "<username>" as username and "<password>" as password
    And   I click on the login button
    Then  I verify the error message as "<error>"

    Examples:
      | username | password | error |
      |  invalid | invalid  | Invalid credentials |
      |  Admin   | invalid  | Invalid credentials |
      | invalid  | admin123 | Invalid credentials |


