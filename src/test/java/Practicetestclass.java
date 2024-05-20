import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.Utilities;

public class Practicetestclass {
	WebDriver driver = new ChromeDriver();
	SoftAssert soft = new SoftAssert();
	Actions an = new Actions(driver);

	@BeforeClass
	public void laouchurl() {

		driver.manage().window().maximize();
		driver.navigate().to("");
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
		// applying the ewait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test // login test cases
	public void logintest() {
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();
	}

	@Test // dropdown handle
	public void dropdownvarify() {

		WebElement ss = driver.findElement(By.xpath(""));

		Select as = new Select(ss);
		as.selectByIndex(0);
		as.selectByValue(null);
		as.selectByVisibleText(null);

	}

	@Test // dropdowm without for loop
	public void withoutselectclassdropdown() {
		List<WebElement> clollect = driver.findElements(By.xpath(""));

		for (int y = 0; y < clollect.size(); y++) {
			if (clollect.get(y).getText().equalsIgnoreCase("mumbai")) {

				clollect.get(y).click();

			}

		}
	}

	@Test // Autosuggesivedropdown
	public void Autosuggesivedropdown() {

		driver.findElement(By.xpath("")).sendKeys("ind");

		List<WebElement> cl = driver.findElements(By.xpath(""));

		for (WebElement c : cl) {
			if (c.getText().equalsIgnoreCase("indian oshoin terretory")) {
				c.click();
			}

		}
	}
	
	@AfterClass
	public void closebroser() {
		driver.quit();
	}

}
