package Btestclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pomc.radioandcheckbox;
import Pomc.dropdownpom;
import Pomc.pomc5;
import baset.Baset;

public class handlecheckboxes extends Baset {

	WebDriver driver;

	radioandcheckbox po;

	@BeforeTest
	public void objects() {
		new pomc5(driver);
	}

	@Parameters({ "api1" })
	@BeforeClass
	public void checkboxes(String w) {
		driver = launch(w);
	}

	@Test(priority = 2)
	public void clickcchecks() {
		pomc5 p5 = new pomc5(driver);
		List<WebElement> nnn = p5.actions();

	}

	@Test(priority = 1)
	public void check() {
		radioandcheckbox f = new radioandcheckbox(driver);
		List<WebElement> x = f.radiobutton();

	}

	@Test(priority = 3)
	public void handle() throws InterruptedException {
		dropdownpom dp = new dropdownpom(driver);
		dp.handletext("Option3", "option1", 2);

	}

	@AfterClass
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

}
