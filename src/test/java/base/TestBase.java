package base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends AbstractTestNGCucumberTests {

    public static WebDriver driver;

    @BeforeMethod
    public void startBrowser() {
        driver = new FirefoxDriver();
        driver.navigate().to(" https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }

  //  @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
