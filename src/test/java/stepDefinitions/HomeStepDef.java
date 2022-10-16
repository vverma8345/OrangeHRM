package stepDefinitions;

import hook.WebDriverHook;
import io.cucumber.java.en.*;
import pages.BasePage;
import pages.HomePage;

public class HomeStepDef extends CommonStepDefs{
    public HomeStepDef(WebDriverHook webDriverHook) {
        super(webDriverHook);
    }


    @Then("I add new employee to OrangeHRM")
    public void i_add_new_employee_to_orange_hrm() {

        homePage.AddEmployee("Arjun","K","Rao");

    }
    @Given("I search employee with employeeId")
    public void i_search_employee_with_employee_id() {
        homePage.searchEmployee();

    }

    @Then("I delete the employee")
    public void i_delete_the_employee() {

          homePage.deleteEmployee();

        }

}
