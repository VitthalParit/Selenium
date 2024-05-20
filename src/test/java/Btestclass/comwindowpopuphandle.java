package Btestclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pomc.tabhandle2;
import baset.Baset;

public class comwindowpopuphandle extends Baset {
	WebDriver driver;

	@Parameters({ "api1" })
	@BeforeTest
	public void launching(String kkkk) {
		driver = launch(kkkk);
	}

	@Test
	public void windowhandle() {
		tabhandle2 tab = new tabhandle2(driver);
		tab.switchswindow();

	}

	public void Alert() {
		tabhandle2 tab = new tabhandle2(driver);
		tab.apopup();
	}

	@AfterTest
	public void closed() {
		driver.close();

	}

}
