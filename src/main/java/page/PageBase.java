package page;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {

    WebDriver driver;


    public PageBase(WebDriver driver) {
        this.driver = driver;
    }


    public void clickOnElement(By elementLocator) {
        waituntilelementpresence(elementLocator);
        scroLLToELementView(elementLocator);
        driver.findElement(elementLocator).click();
    }

    public void enterText(By elementLocator, String text) {
        waituntilelementpresence(elementLocator);
        scroLLToELementView(elementLocator);
        driver.findElement(elementLocator).sendKeys(text);
    }

    public void waituntilelementpresence(By elementLocator) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(elementLocator));
    }

    public void scroLLToELementView(By elementLocator) {
        WebElement element = driver.findElement(elementLocator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    }


}
