package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExamplePage {
    private WebDriver driver;

    public ExamplePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By searchBoxLocator = By.id("searchBoxId");

    // Actions
    public void enterSearchText(String searchText) {
        WebElement searchBox = driver.findElement(searchBoxLocator);
        searchBox.sendKeys(searchText);
    }
}

