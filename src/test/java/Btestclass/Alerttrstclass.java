package Btestclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pomc.Alertpom;
import baset.Baset;

public class Alerttrstclass extends Baset {

	WebDriver driver;

	@Parameters({ "api1" })
	@BeforeClass
	public void launc(String a) {
		driver = launch(a);
	}

	@Test(priority = 1)
	public void Alert() throws InterruptedException {
		Alertpom p = new Alertpom(driver);
		p.alerthandle();

	}

	@Test(priority = 2)
	public void handle() throws InterruptedException {
		Alertpom p = new Alertpom(driver);

		p.dismissAlert();

	}

	@AfterClass
	public void quit() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
