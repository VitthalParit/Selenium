package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handlecheckbox {

@Test
public void checkboxs() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	
	Thread.sleep(3000);
	
	driver.quit();
			
}
		
	
}
