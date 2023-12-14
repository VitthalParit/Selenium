package Getlinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alllinks {

	@Test
	public void capturelink() throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> al=driver.findElements(By.tagName("a"));
		
		System.out.println(" " + al.size());
		
		for(int p=0; p<al.size(); p++) {
			System.out.println("getlink " + al.get(p).getAttribute("href"));
			System.out.println("print link " + al.get(p).getText());
		}
		
		
		driver.quit();
	}
}
