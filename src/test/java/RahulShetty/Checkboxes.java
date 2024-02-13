package RahulShetty;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkboxes {
	@Test
	public void Autosuggesivedropdown() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).click();
	  System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
	  
	  Thread.sleep(3000);
	  
	  System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	  Thread.sleep(3000);
	  driver.close();
	  
}
}