package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Helper;

import java.io.IOException;
import java.time.Duration;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @purpose This method wait for element till present
     * @param element
     * @author Vimal Verma
     */

    public void waitforElement(By element)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(element));

    }

    public void navigateTourl() throws IOException {
        driver.get(Helper.dataReader("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

    }

    /**
     * @purpose This is used to verify text on webpage.
     * @param expectedText
     * @param element
     * @author Vimal Verma
     */
    public void verifyText(String expectedText,By element)
    {
        String actualText = driver.findElement(element).getText();
        Assert.assertEquals("Text was not matched",expectedText,actualText);

    }

    /**
     * @purpose To click on element
     * @param element
     * @author Vimal Verma
     */
    public void click(By element)
    {
        driver.findElement(element).click();

    }

}
