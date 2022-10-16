package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
     By lnkAddEmployee = By.xpath("//a[text()='Add Employee']");
     By txtFirstName = By.name("firstName");
     By txtMiddleName = By.name("middleName");
     By txtLastName = By.name("lastName");
     By btnSave = By.xpath("//button[@type='submit']");

     By txtEmployeeId = By.xpath("//input[@class='oxd-input oxd-input--active']/parent::div[@class='']");
     By btnDelete = By.xpath("//button[@class='oxd-icon-button oxd-table-cell-action-space']/parent::div");

    public void AddEmployee(String firstName ,String middleName , String lastName) {
           click(lnkAddEmployee);
           enterText(txtFirstName,firstName);
           enterText(txtMiddleName,middleName);
           enterText(txtLastName,lastName);
           click(btnSave);

           System.out.println("********"+getEmployeeId()+"***********");

    }

    public String getEmployeeId()
    {
        String empId = driver.findElement(txtEmployeeId).getText();
        return empId;
    }


    public  void  searchEmployee(){
        enterText(txtEmployeeId,getEmployeeId());
        click(btnSave);
    }

    public void deleteEmployee()
    {
        click(btnDelete);
    }
}
