package Btestclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pomc.pomc4;
import baset.Baset;

public class shettylogin extends Baset {
	WebDriver driver;
	
	@Parameters({"api"})
	@BeforeTest
	public void urllaunch(String url) {
		driver=launch(url);
	}
	
	@Parameters({"email" ,"possward"})
	@Test
	public void logins(String v , String t) {
		pomc4 pm=new pomc4(driver);
		pm.actions(v, t);
		
	}
	@AfterClass
	public void closed() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
}
