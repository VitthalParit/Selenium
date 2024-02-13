package Scroll;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Scrooling {

	
	@Test
	public void scrolling() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		JavascriptExecutor ss=(JavascriptExecutor)driver;
		
		ss.executeScript("window.scrollBy(00,444", "");
		
		WebElement element = driver.findElement(By.xpath(""));
		
	
		ss.executeScript("argument[0].Scrollintoview()",element);
		
		//Scroll table
		
		
		ss.executeAsyncScript("doscument.querySELECTOR('CSS').Scrolltop=500");
		
		List<WebElement>s=driver.findElements(By.xpath(""));
		
		SoftAssert as=new SoftAssert();
		for(int p=0; p<s.size(); p++) {
			int sum=0;
			
			int add=Integer.parseInt(s.get(p).getText());
			
			sum=sum+add;
			
			System.out.println("find out count " + sum);
		
		
		
		WebElement actual =driver.findElement(By.xpath(""));
		
		int d=Integer.parseInt(actual.getText().split(":")[1].trim());
				
				as.assertEquals(d, sum)
;
		}
		
		as.assertAll();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		
		
	}
}
