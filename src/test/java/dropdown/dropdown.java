package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdown {

	
	@Test
	public void dropdown() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement drop=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select ss=new Select(drop);
		Thread.sleep(3000);
		ss.selectByIndex(1);
		Thread.sleep(3000);
		ss.selectByVisibleText("Option2");
		Thread.sleep(3000);
		ss.selectByValue("option3");
		
		driver.close();
				
	}
	
	
	
	//Autosuggesive dropdown
	
	
	@Test
	public void dropdown2() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		List<WebElement> vv=driver.findElements(By.xpath(""));
		
		for(WebElement v: vv) {
			if(v.getText().equalsIgnoreCase("india")) {
				
				v.click();
			}
		}
}
}