package Btestclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite;

import Pomc.framhande;
import baset.Baset;

public class mouseactiontest1 extends Baset {
	WebDriver driver;
	
	@Parameters({"api2"})
	@BeforeClass
	public void upload(String bbb) {
		driver=launch(bbb);
	}
	
	@Test
	public void action1() {
		framhande fm=new framhande(driver);
		fm.getmethod();
	}
	
	
	@AfterClass
	public void closed() {
		driver.close();
	}

}
