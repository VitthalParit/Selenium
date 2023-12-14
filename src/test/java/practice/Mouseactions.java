package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouseactions {

	@Test
	public void handle() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://jqueryui.com/droppable/");
		
	   WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
			   
			   driver.switchTo().frame(frame);
			   
	   Thread.sleep(3000);
	   WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	   
	   WebElement drop= driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	   
	   
	   Actions perform=new Actions(driver);
	   
	   perform.dragAndDrop(drag, drop).perform();
	   
	   Thread.sleep(3000);
	   
	   driver.quit();
	   
	   
	   
	   
		
}}
