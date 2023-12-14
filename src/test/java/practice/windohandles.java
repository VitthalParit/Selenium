package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.systeminfo.SystemInfo;
import org.testng.annotations.Test;

public class windohandles {
	@Test
	public void alert() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		
		Thread.sleep(4000);
		Set<String>windowhanles=driver.getWindowHandles();
		System.out.println(windowhanles);
		
		Iterator<String> ss =windowhanles.iterator();
		String handle=ss.next();
		String childw=ss.next();
		
		driver.switchTo().window(childw);
		
		driver.findElement(By.xpath("//li[@class='nav-item']//a[normalize-space()='Courses']")).click();
		
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='u70-search-form-autocomplete--3']")).sendKeys("selenium automation");
		
		Thread.sleep(3000);
		driver.close();
}}
