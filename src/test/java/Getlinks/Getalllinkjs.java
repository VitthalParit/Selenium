package Getlinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Getalllinkjs {

	@Test
	public void linnkhandle() throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")
).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	Thread.sleep(3000);
	
	List<WebElement>links=driver.findElements(By.tagName("a"));
	
	System.out.println("all links " + links.size());
	
	
	
	for(int i=0; i<links.size(); i++) {
		System.out.println("capture link " + links.get(i).getAttribute("href"));
		
		System.out.println("print all the links in webpage " + links.get(i).getText());
		
	}
	
	
	String title=driver.getTitle();
	
	System.out.println("page title is " + title);
	
	String url=driver.getCurrentUrl();
	System.out.println(" url " + url);
	
	
	driver.quit();
		
	
	}
}
