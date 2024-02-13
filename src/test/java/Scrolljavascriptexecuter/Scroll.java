package Scrolljavascriptexecuter;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;

public class Scroll{

		
		@Test
		public void scroll() throws InterruptedException {
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("window.scrollBy(0,500");
			
			js.executeScript("document.queryselector().scrolltop=5000");
			
			
			List<WebElement> ss =driver.findElements(By.cssSelector(""));
			int sum=0;
			
			for(int o=0; o<ss.size(); o++ ) {
				
				 sum=sum+Integer.parseInt(ss.get(o).getText());
				
			}
			
			int total = Integer.parseInt(driver.findElement(By.xpath("")).getText().split(":")[1].trim());
			
			Assert.assertEquals(sum, total);
			
	       
			
		
			
			
			
			
}
}