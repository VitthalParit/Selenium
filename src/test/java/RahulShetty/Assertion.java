package RahulShetty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {

	
	@Test
	public void dropdown() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_SeniorCitizenDiscount\"]")).isSelected());
		

		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_SeniorCitizenDiscount\"]")).click();
	  
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_SeniorCitizenDiscount\"]")).isSelected());
	
		driver.close();
		
		
}}
