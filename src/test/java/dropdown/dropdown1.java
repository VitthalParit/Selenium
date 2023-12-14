package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdown1 {

	@Test
	public void dropdown() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select g= new Select(dropdown);
		
		Thread.sleep(3000);
		g.selectByVisibleText("Option3");
		
		Thread.sleep(3000);
		g.selectByValue("option1");
		
		Thread.sleep(3000);
		
		g.selectByIndex(0);
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	
		
		
		
	}
	
	
	
	
		
	
	}

