package Btestclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pomc.AbstractAlert;
import Pomc.userabstrackcomponent;
import baset.Baset;

public class Useabstracttestclass extends Baset {
	
	WebDriver driver;
	
	@Parameters({"api1"})
	@BeforeTest
	public void launchh(String iii) {
		
		driver= launch(iii);
	}
	
	@Test(priority = 2)
	public void Abstractusess() {
		userabstrackcomponent user=new userabstrackcomponent(driver);
		user.checkwindow();
		
	}
	
	@Test(priority = 1)
	public void Alerthandless() {
		AbstractAlert ss=new AbstractAlert(driver);
		ss.Alerthandle();
	}
	
	@AfterTest
	public void close() {

		driver.close();
}
}