package testc;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pomc.pomc;
import baset.Baset;

public class testc1 extends Baset{
	WebDriver driver;
	
	@Parameters({"url"})
	@BeforeClass
	public void launchind(String i) {
		
		driver=launch(i);
	}
       
	
	@Parameters({"user" , "poss"})
	@Test
	public void laod(String n , String k) {
		pomc pm=new pomc(driver);
		pm.actions(n, k);
	}
	
	@AfterClass
	public void closed() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	


		 
	
	
		 
		 
		 
	
	
}
