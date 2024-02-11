package steps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

import static base.TestBase.driver;

public class followisStep {
    HomePage homePageObject = new HomePage(driver);

    @When("user clicks on facebook icon")
    public void userClicksOnFacebookIcon() {
        homePageObject.clicksOnfacebookIcon();
    }
    @When("user opens twitter link")
    public void userclicksOntwitterIcon() {
        homePageObject.clicksOntwitterIcon();
    }

    @When("user opens rss link")
    public void userclicksOnrssIcon() {
        homePageObject.clicksOnrssIcon();
    }

    @When("user opens youtube link")
    public void userclicksOnyoutubeIcon() {
        homePageObject.clicksOnyoutubeIcon();
    }

}
