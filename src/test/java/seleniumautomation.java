import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seleniumautomation {

	@Test
	public void firsttest() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
	
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		
		
		driver.close();
		
	}
}
