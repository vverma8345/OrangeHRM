package hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import utils.Helper;

import java.time.Duration;

public class WebDriverHook {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @Before
    public void setUp() throws Exception {

        System.out.println("**** Test running on Chrome browser ****");
        //System.setProperty("webdriver.chrome.driver", chromeDriver);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @After
    public void tearDown() throws Exception {

            driver.quit();

    }
}
