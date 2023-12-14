package dropdown;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Autosugetiondropdown {

	@Test
	public void autosuggetion() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		
		WebElement r= driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']"));
		r.click();
		
		Thread.sleep(3000);
		
	
		WebElement from = driver.findElement(By.xpath("//div[@class='oxd-table-filter-area']//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]"));
		Thread.sleep(3000);
		from.sendKeys("ESS");
		
		Thread.sleep(3000);
		from.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(30000);
		from.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		driver.close();
	}}
		

 