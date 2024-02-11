package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {
    By loginIcon = By.className("ico-login");
    By Emailfield = By.id("Email");
    By passWordfield = By.id("Password");
    By LoginButton = By.className("login-button");

    public void clickOnloginicon() {
        clickOnElement(loginIcon);
    }

    public void enterEmailfield(String email) {
        enterText(Emailfield, email);
    }

    public void enterpassWordfield(String password) {
        enterText(passWordfield, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(LoginButton);
    }


    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
