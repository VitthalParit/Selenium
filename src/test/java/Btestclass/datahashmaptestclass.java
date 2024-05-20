package Btestclass;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pomc.dataproviderhashmap;
import baset.Baset;

public class datahashmaptestclass extends Baset {
	WebDriver driver;
	@Parameters({ "api3" })
	@BeforeClass(alwaysRun = true)
	public void laun(String kk) {
		driver = launch(kk);}

	@Test(dataProvider = "getdata", groups = "smoke")
	public void logintestcases(HashMap<String, String> input) throws InterruptedException {
		dataproviderhashmap mm = new dataproviderhashmap(driver);

		mm.data(input.get("id"), input.get("poss"));
	}
	
	@AfterClass(alwaysRun = true)
	public void closed() {
		driver.close();
	}

}
