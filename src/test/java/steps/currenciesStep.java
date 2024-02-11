package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.currenciesPage;

import static base.TestBase.driver;

public class currenciesStep {

    currenciesPage currenciesPageObject = new currenciesPage(driver);



    @Given("user clicks on currencies menu")
    public void userClicksOnCurrenciesMenu() {
        currenciesPageObject.selectcurrencyMenu();
    }

    @Then("user select Euro")
    public void userSelectEuro() {
        currenciesPageObject.selectcurrencyMenu();
    }
}
