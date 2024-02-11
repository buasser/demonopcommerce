package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import page.LoginPage;

import static base.TestBase.driver;

public class loginStep {

    LoginPage loginpageObject = new LoginPage(driver);

    @Given("user go to login page")
    public void userGoToLoginPage() {
        loginpageObject.clickOnloginicon();
    }

    @When("user click on login icon")
    public void userClickOnLoginIcon() {
        loginpageObject.clickOnLoginButton();
    }

    @Then("user login with valid email {string}")
    public void userLoginWithValidEmail(String email) {
        loginpageObject.enterEmailfield(email);
    }

    @And("user enter valid password {string}")
    public void userEnterValidPassword(String password) {
        loginpageObject.enterpassWordfield(password);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        loginpageObject.clickOnLoginButton();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
    }

    @Then("user login with email {string}")
    public void userLoginWithEmail(String email) {
        loginpageObject.enterEmailfield(email);
    }

    @And("user enter password {string}")
    public void userEnterPassword(String password) {
        loginpageObject.enterpassWordfield(password);
    }

    @Then("user user could not login to the system")
    public void userUserCouldNotLoginToTheSystem() {
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store. Login");
    }
}
