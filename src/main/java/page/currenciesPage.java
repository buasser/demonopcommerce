package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class currenciesPage extends PageBase {
    By CurrencyMenu = By.id("customerCurrency");

    public currenciesPage(WebDriver driver) {
        super(driver);
    }


    public void selectcurrencyMenu() {
        Select select = new Select(driver.findElement(CurrencyMenu));
        select.selectByVisibleText("Euro");
    }

}

