package Btestclass;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pomc.Brokenlinkpom;
import baset.Baset;

public class Brokenlinktestclass extends Baset {
	
	WebDriver driver;
	
	@Parameters({"api1"})
	@BeforeTest(alwaysRun = true)
	public void launchapi(String url) {
		driver=launch(url);
		
		
	}
	
	
	@Test(groups = "link")
	public void linkvallidation() throws MalformedURLException, IOException {
		Brokenlinkpom bpom=new Brokenlinkpom(driver);
		List<WebElement> gg=bpom.brkoenlinks();
	
	}



@AfterTest(alwaysRun = true)
public void closed() {
	
	driver.close();
}
}