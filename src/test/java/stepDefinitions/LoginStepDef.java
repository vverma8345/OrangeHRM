package stepDefinitions;
import hook.WebDriverHook;
import io.cucumber.java.en.*;

import java.io.IOException;

public class LoginStepDef  extends CommonStepDefs{

    public LoginStepDef(WebDriverHook webDriverHook) {
        super(webDriverHook);
    }

    @Given("I navigate to the login page")
    public void i_verify_login_page_with_title_as() throws InterruptedException, IOException {

       basePage.navigateTourl();
    }

    @Given("I enter the {string} as username and {string} as password")
    public void i_enter_the_as_username_and_as_password(String username, String password) {

        loginPage.userLogin(username,password);
    }
    @Then("I click on the login button")
    public void i_click_on_the_login_button() {

        loginPage.clickOnLoginButton();

    }

    @Then("I verify the error message as {string}")
    public void i_verify_the_error_message_as(String error) {

        loginPage.verifyErrorMsg(error);
    }





}
