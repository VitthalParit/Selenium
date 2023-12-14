import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class YourTestClass extends Baseclass {

    @BeforeClass
    public void setUp() {
        initializeDriver();
    }

    @Test
    public void yourTest() {
        // Your test logic using Selenium WebDriver
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        // Perform actions and assertions
    }

    @AfterClass
    public void tearDown() {
        closeDriver();
    }
}
