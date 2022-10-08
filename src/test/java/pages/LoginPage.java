package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    By pageTitle = By.tagName("title");
    By txtUsername = By.name("username");
    By txtPassword = By.name("password");
    By btnLogin = By.xpath("//button[@type='submit']");

    By loginError = By.xpath("//p[text()='Invalid credentials']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    /**
     * @purpose This is used to login into the webpage.
     * @param username
     * @param password
     * @author Vimal Verma
     */
    public void userLogin(String username , String password)
    {
        driver.findElement(txtUsername).sendKeys(username);
        driver.findElement(txtPassword).sendKeys(password);

    }


    public  void clickOnLoginButton()
    {
        click(btnLogin);

    }

    public  void verifyErrorMsg(String error)
    {
        verifyText(error,loginError);

    }




}