package Getlinks;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gettalllinks2 {

	
@Test
public void testclass() throws Exception {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.anthropic.com/index/claude-2");
	
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println(" "  + links.size() );
	
	
	for(int f=0; f<links.size(); f++) {
		System.out.println("capture link " + links.get(f).getAttribute("href"));
		System.out.println("print links " + links.get(f).getText());
		
		
		Thread.sleep(3000);
		driver.close();
	}
}
}
