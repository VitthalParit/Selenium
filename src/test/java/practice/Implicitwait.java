package practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Implicitwait {

	@Test
	public void mouseaction() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.ebay.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));    //(10,TimeUnit.SECONDS);
		WebElement dd= driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		
		Actions ss=new Actions(driver);
		
	ss.moveToElement(dd).click().build().perform();
	
	
	driver.quit();
	
	
}
}