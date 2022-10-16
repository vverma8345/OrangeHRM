Feature: Employee feature
  As a tester, I want to validate the user Employee feature. Both valid and invalid employee scenarios will be covered.

  @smoke
  Scenario: I verify add and delete operation on employee the home page
    Given I navigate to the login page
    And  I enter the "Admin" as username and "admin123" as password
    And  I click on the login button
    Then I add new employee to OrangeHRM
    And  I search employee with employeeId
    Then I delete the employee

