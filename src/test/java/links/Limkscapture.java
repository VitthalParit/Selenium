package links;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Limkscapture {

	@Test
	public void linkscapture() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		System.out.println(driver.findElements(By.tagName("")).size());
		
		WebElement rr =driver.findElement(By.xpath(""));
		System.out.println(" " + rr.findElements(By.tagName("")));
		
		WebElement oo=rr.findElement(By.xpath(""));
		
		System.out.println(oo.findElements(By.tagName("")));
		
		for(int l=1; l<oo.findElements(By.tagName("")).size(); l++) {
			
			String enter=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			oo.findElements(By.tagName("")).get(l).sendKeys(enter);
			
			
			
		}
		
		
		Thread.sleep(30000);
	
		Set<String> it=driver.getWindowHandles();
		Iterator<String>pp=it.iterator();
		String parent=pp.next();
		String child=pp.next();
		
		
		
	}
}
