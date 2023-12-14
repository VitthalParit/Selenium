package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frameandling {

	
	@Test
	public void checkboxs() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		Thread.sleep(3000);
		
		WebElement sss= driver.findElement(By.id("iframeResult"));
		
		
          driver.switchTo().frame(sss);
		
		WebElement ss= driver.findElement(By.xpath("//div[@id='tnb-google-search-mobile-show']//*[name()='svg']"));
		
		ss.click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//input[@id='tnb-google-search-input']")).sendKeys("vitthal");
		
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
	
		System.out.println(" " + driver.getTitle());
		
		driver.quit();
		
		
		
		
	
	
	}
}
