package Btestclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pomc.Tabhandle;
import Pomc.pomc5;
import baset.Baset;

public class Tabhandletest extends Baset {

	WebDriver driver;
	@Parameters({"api1"})
	@BeforeClass
	public void upload(String load) {
		driver=launch(load);
		
	}
	
	@Test(priority = 1)
	public void handlewindow() throws InterruptedException {
	Tabhandle tab=new Tabhandle(driver);
	tab.hadnlewindow();
	}
	
	@Test(priority = 2)
	public void checkboxse() {
		pomc5 p5=new pomc5(driver);
	List<WebElement> ff=p5.actions();
	}
	@AfterClass
	public void closed () throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
}
