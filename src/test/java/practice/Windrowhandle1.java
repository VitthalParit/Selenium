package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windrowhandle1 {

	
	@Test
	public void handle() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		
		Thread.sleep(4000);
		
		Set<String> handle =driver.getWindowHandles();
		System.out.println(" " + handle.size());
		
		Iterator<String> ss=handle.iterator();
		
		String parent=ss.next();
		
		String child=ss.next();
		
		driver.switchTo().window(child);
		
		driver.findElement(By.xpath("//li[@class='nav-item']//a[normalize-space()='Courses']")).click();
		
		Thread.sleep(2000);
		
		WebElement dd= driver.findElement(By.xpath("//input[@id='u5-search-form-autocomplete--3']"));
				dd.click();
		
		Thread.sleep(2000);
		
		dd.sendKeys("selenium automation");
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
