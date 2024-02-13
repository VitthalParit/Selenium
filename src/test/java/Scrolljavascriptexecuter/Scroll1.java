package Scrolljavascriptexecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll1 {

	
	@Test
	public void scroll() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
           JavascriptExecutor js= (JavascriptExecutor)driver;
           
           WebElement point=driver.findElement(By.cssSelector("#mousehover"));
           
           js.executeScript("arguments[0].scrollIntoView()", point);
           
           
           
          
		
	}
}
