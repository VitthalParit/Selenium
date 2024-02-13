package Scroll;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Scroll2 {

	@Test
	public void scrolling() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
      JavascriptExecutor js=(JavascriptExecutor)driver;
      
      js.executeScript("window.ScrollBy(00,400)", "");
      
      
      //specific webelement
      
      WebElement web=driver.findElement(By.xpath(""));
      js.executeScript("Argument[0].Scrollintoview", web);
      
      //Scroll webtable
      
      js.executeScript("document.querySelector(xpath).scrolltop=500");
      
      List<WebElement>ff= driver.findElements(By.xpath(""));
     SoftAssert gg=new SoftAssert();
     
      
      for(WebElement f : ff) {
    	  int sum=0;
    	  int o=Integer.parseInt(f.getText());
    	  
    	  sum=sum+o;
    	  System.out.println(" " + sum);
    	  
    	  WebElement ele=driver.findElement(By.xpath(""));
    	  
    	  int w=Integer.parseInt(ele.getText().split(":")[1].trim());
    	  
    	  gg.assertEquals(sum, w);
    	  
    	  
    			  
      }
      
      gg.assertAll();
      
      
      driver.quit();
      
      
}
}

