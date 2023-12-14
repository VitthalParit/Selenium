package practice;

import static org.testng.Assert.expectThrows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explicitwait {
	
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver,10 );

	@Test
	public void  voidexplicit() {
		
		wait.until(Exceptedconditions)
		 
	}
}
