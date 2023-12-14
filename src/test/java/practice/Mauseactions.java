package practice;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mauseactions {

	
	@Test
	public void handle() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://jqueryui.com/slider/");
		
		WebElement frame=driver.findElement(By.xpath("//iframe"));
		
		driver.switchTo().frame(frame);
		
		
		
	 WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
	 
//	 boolean status= slider.isDisplayed();
//	 System.out.println(status);
	 
	 
	
//		WebElement aa = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
//		
//		driver.switchTo().frame(aa);
//		
//		Thread.sleep(2000);
//		   
//	   WebElement frame = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
//			   
//		
//			   
//			   Thread.sleep(2000);
//			   
//			   Actions ss=new Actions(driver);
//			   
//			   ss.dragAndDropBy(frame, 988, 250);
//			   
//			   Thread.sleep(2000);
			   
			   driver.quit();
			   
			   
	}}
