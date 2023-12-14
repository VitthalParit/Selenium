package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown2 {
  
	@Test
	public void dropdown() throws InterruptedException {
		WebDriver driver=new ChromeDriver()
;
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select ss=new Select(drop);
		
		Thread.sleep(3000);
		
		ss.selectByIndex(1);
		
		Thread.sleep(3000);
		
		ss.selectByValue("option3");
		
	Thread.sleep(3000);
		
		ss.deselectByVisibleText("Option1");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
	}
}
