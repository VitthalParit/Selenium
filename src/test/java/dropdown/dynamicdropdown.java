package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class dynamicdropdown {

	@Test
	public void dynamaicdropdown() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		//div[@id='divpaxinfo']
		for(int s=1; s<4; s++) {
			driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
		}
		
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		Thread.sleep(3000);
		driver.close();
		
	
		
		
		
		
				
				
	}
}
