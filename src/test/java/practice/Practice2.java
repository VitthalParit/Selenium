package practice;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Practice2 {

	@Test
	public void brokenlink2() throws MalformedURLException, IOException, InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
	driver.manage().window().maximize();
	
	driver.navigate().to("");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	WebElement DDD=driver.findElement(By.xpath(""));
	
	Select drop=new Select(DDD);
	

       List<WebElement> checks=driver.findElements(By.xpath(""));
       
       for(WebElement check :checks) {
    	   check.click();
       }
       
       Thread.sleep(3000);
       
       drop.selectByIndex(0);
       
       drop.selectByValue("value");
       
       drop.selectByVisibleText(null);
       
       
       
       
	
	
	
	}
}
