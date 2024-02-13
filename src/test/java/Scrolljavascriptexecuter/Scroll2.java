package Scrolljavascriptexecuter;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll2{

		
		@Test
		public void scroll() throws InterruptedException {
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeAsyncScript("window.scrollBy(0,500");
			
			List<WebElement> ss=driver.findElements(By.xpath(""));
			int sum=0;
			
			for(int i=0; i<ss.size(); )
			
			
			
			
			
}
}