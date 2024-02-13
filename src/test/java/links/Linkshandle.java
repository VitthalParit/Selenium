package links;

import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Linkshandle {
@Test
public void linksdone() {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
      List<WebElement>si= driver.findElements(By.tagName("a"));
      System.out.println(" " + si.size());
      
      WebElement ss= driver.findElement(By.xpath("//div[@id='gf-BIG']"));
      
      System.out.println(" " + ss.findElements(By.tagName("a")).size());
      
      WebElement aa=ss.findElement(By.xpath(""));
      System.out.println(" "  + aa.findElements(By.tagName("a")).size());
      
      for(int t=1;t<aa.findElements(By.tagName("a")).size();){
    	  
    	  String ii=Keys.chord(Keys.CONTROL, Keys.ENTER);
    	  
    	  aa.findElements(By.tagName("a")).get(t).sendKeys(ii);
      }
      
      
    		  
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
}
}
