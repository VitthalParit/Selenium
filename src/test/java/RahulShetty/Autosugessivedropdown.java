package RahulShetty;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Autosugessivedropdown {

	@Test
	public void Autosuggesivedropdown() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
	  
	  Thread.sleep(3000);
	  List<WebElement> all=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
	  for(WebElement al:all) {
		  if(al.getText().equalsIgnoreCase("india"))
		  {
			  al.click();
			  break;
		  }
	  }
	  
	  
	  
	}
}
