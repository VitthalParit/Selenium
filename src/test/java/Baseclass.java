import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

	
	protected static WebDriver driver;

    public void initializeDriver() {
     
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
