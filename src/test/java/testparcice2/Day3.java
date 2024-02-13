package testparcice2;

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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {

	WebDriver driver = new ChromeDriver();
	Actions as = new Actions(driver);

	@Parameters({ "user", "poss" })
	@Test
	public void paramentre(String u, String p) {

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(u);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(p);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@BeforeClass
	@Parameters({ "url" })
	public void login(String link) {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(link);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	@AfterClass
	public void logout() throws InterruptedException {

		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
