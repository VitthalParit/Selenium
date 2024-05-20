package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locaotres {
	WebDriver driver=new ChromeDriver();
	

	@Test
	public void locatingwebelement() {
		
	 driver.manage().window().maximize();
	 driver.navigate().to("");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	 
		
	}
	
}
