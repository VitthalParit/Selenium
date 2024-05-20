package Btestclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pomc.selectedbox;
import baset.Baset;

public class webelementmtest extends Baset {

	WebDriver driver;

	@Parameters({ "api1" })
	@BeforeClass
	public void upload(String u) {
		driver = launch(u);

	}

	@Test
	public void checkoxescheck() {
		selectedbox select = new selectedbox(driver);
		List<WebElement> cc = select.checkvalidation();

	}

	@Test
	public void validation1() {
		selectedbox xc = new selectedbox(driver);
		List<WebElement> rr = xc.checkvalidation();
	}

	@Test
	public void validation2() {
		selectedbox ssl=new selectedbox(driver);
		ssl.butt();
		
	}
	@AfterTest
	public void quitee() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();

	}
}
