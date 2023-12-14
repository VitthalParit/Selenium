import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pom1 {

	
	private WebDriver driver;

    public void ExamplePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By searchBoxLocator = By.id("//input[@id='name']");

    // Actions
    public void enterSearchText(String searchText) {
        WebElement searchBox = driver.findElement(searchBoxLocator);
        searchBox.sendKeys("vitthal");
    }
}
