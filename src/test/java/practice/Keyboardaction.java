package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keyboardaction {

@Test
public void mouseaction() throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://extendsclass.com/text-compare.html");
	
	WebElement ss= driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[3]/pre"));
	
	Actions s=new Actions(driver);
	
	s.keyDown(ss, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
	Thread.sleep(3000);
	
	WebElement zz =driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[3]/pre"));
	
	s.keyDown(zz, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	
	Thread.sleep(3000);
	
	driver.quit();
}
}
