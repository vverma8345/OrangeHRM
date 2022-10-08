package stepDefinitions;

import hook.WebDriverHook;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;

public class CommonStepDefs {

    BasePage basePage;
    LoginPage loginPage;
    public CommonStepDefs(WebDriverHook webDriverHook) {
        WebDriver driver = webDriverHook.getDriver();

        //BagePage
        basePage = new BasePage(driver);
        //LoginPage
        loginPage = new LoginPage(driver);

    }
}
