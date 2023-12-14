package Getlinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Getallinks {

	
	@Test
	public void links() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
	List<WebElement> links=driver.findElements(By.tagName("a"));
	
	
	System.out.println("all the links size"  + links.size());
	
	for(int u=0;u<links.size(); u++ ) {
		System.out.println("capture linmks " + links.get(u).getAttribute("href"));
		System.out.println("print all the links " + links.get(u).getText());
		
		Thread.sleep(3000);
		
		
		driver.close();
	}
	}
	
}
