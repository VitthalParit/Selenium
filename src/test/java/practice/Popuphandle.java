package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Popuphandle {

	@Test
	public void alert() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		
		Thread.sleep(3000);
		
		Alert ss=driver.switchTo().alert();
		ss.accept();
		
		Thread.sleep(3000);
		
		driver.close();
	}
}
