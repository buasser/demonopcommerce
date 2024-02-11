package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends PageBase {

    By genderField = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By dayDropdown = By.name("DateOfBirthDay");
    By monthDropdown = By.name("DateOfBirthMonth");
    By yearDropdown = By.name("DateOfBirthYear");
    By emailField = By.id("Email");
    By companyName = By.id("Company");
    By passwordField = By.id("Password");
    By confirmpasswordField = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void selectGenderfield() {
        clickOnElement(genderField);
    }

    public void enterFirstName() {
        enterText(firstName, "automation");
    }

    public void enterLastName() {
        enterText(lastName, "tester");
    }

    public void selectDayDropdown() {
        Select select = new Select(driver.findElement(dayDropdown));
        select.selectByIndex(2);
    }

    public void selectMonthDropdown() {
        Select select = new Select(driver.findElement(monthDropdown));
        select.selectByIndex(5);
    }

    public void selectYearDropdown() {
        Select select = new Select(driver.findElement(yearDropdown));
        select.selectByValue("1992");
    }

    public void enterEmailfield() {
        enterText(emailField, "test1@example.com");
    }

    public void enterCompanyname() {
        enterText(companyName, "Amit");
    }

    public void enterPassword() {
        enterText(passwordField, "P@ssw0rd");
    }

    public void enterConfirmpassword() {
        enterText(confirmpasswordField, "P@ssw0rd");
    }

    public void clickOnregisterButton() {
        clickOnElement(registerButton);
    }

}
