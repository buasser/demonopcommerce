package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import page.HomePage;
import page.RegisterPage;

import static base.TestBase.driver;

public class registerStep {

    HomePage homePageObject = new HomePage(driver);
    RegisterPage registerPageObject = new RegisterPage(driver);

    @Given("user go to register page")
    public void user_go_to_register_page() {
        homePageObject.clickOnRegisterButton();
    }

    @When("user clicks on regsister icon button")
    public void user_clicks_on_regsister_icon_button() {
        homePageObject.clickOnRegisterButton();
    }

    @When("user select gender type")
    public void user_select_gender_type() {
        registerPageObject.selectGenderfield();

    }

    @When("user enter first name")
    public void user_enter_first_name() {
        registerPageObject.enterFirstName();

    }

    @When("user enter last name")
    public void user_enter_last_name() {
        registerPageObject.enterLastName();

    }

    @When("user choose his day")
    public void user_choose_his_day() {
        registerPageObject.selectDayDropdown();

    }

    @When("user choose his month")
    public void user_choose_his_month() {
        registerPageObject.selectMonthDropdown();

    }

    @When("user choose his year")
    public void user_choose_his_year() {
        registerPageObject.selectYearDropdown();

    }

    @When("user enter email")
    public void user_enter_email() {
        registerPageObject.enterEmailfield();

    }

    @When("user fills Password field")
    public void user_fills_password_field() {
        registerPageObject.enterPassword();

    }

    @When("user fills confirm Password field")
    public void user_fills_confirm_password_field() {
        registerPageObject.enterConfirmpassword();

    }

    @Then("user clicks on register button")
    public void user_clicks_on_register_button() {
        registerPageObject.clickOnregisterButton();

    }


    @Then("user registered successfully")
    public void userRegisteredSuccessfully() {
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store. Register");
    }
}
