package Getlinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.units.qual.t;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;

public class Getliks4 {

	@Test
	public void getlinks() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		List<WebElement>LINKS= driver.findElements(By.tagName("a"));
		System.out.println(" " + LINKS.size());
	
		for(int y=0; y<LINKS.size(); y++) {
			System.out.println(" " + LINKS.get(y).getText());
			
			System.out.println(" " + LINKS.get(y).getAttribute("href") );
			
		
		
		driver.close();
		
			
				
	}
}
}