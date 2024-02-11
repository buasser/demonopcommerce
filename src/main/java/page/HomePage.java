package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {

    By RegisterButton = By.className("ico-register");

    By facebookIcon = By.className("facebook");
    By twitterIcon = By.className("twitter");
    By rssIcon = By.className("rss");
    By youtubeIcon = By.className("youtube");
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnRegisterButton() {
        clickOnElement(RegisterButton);
    }

    public void clicksOnfacebookIcon() {
        clickOnElement(facebookIcon);
    }

    public void clicksOntwitterIcon() {
        clickOnElement(twitterIcon);
    }

    public void clicksOnrssIcon() {
        clickOnElement(rssIcon);
    }

    public void clicksOnyoutubeIcon() {
        clickOnElement(youtubeIcon);
    }
}
