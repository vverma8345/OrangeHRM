Feature: Employee feature
  As a tester, I want to validate the user Employee feature. Both valid and invalid employee scenarios will be covered.

  Background:
    Given I navigate to the login page
    And  I enter the "Admin" as username and "admin123" as password
    And  I click on the login button

  @emp
  Scenario: I verify add Employee on the home page
    And  I verify home page title as "OrangeHRM"
    Then I add new employee to OrangeHRM

  @smoke
  Scenario: I verify delete Employee on the home page
    And  I verify home page title as "OrangeHRM"
    And  I search employee with employeeId
    Then I delete the employee employee

