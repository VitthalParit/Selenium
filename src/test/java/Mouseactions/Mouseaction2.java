package Mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.testng.annotations.Test;

public class Mouseaction2 {

	WebDriver driver=new ChromeDriver();
	@Test
	public void windowhandle() {

		
		driver.manage().window().maximize();

		driver.navigate().to("https://extendsclass.com/text-compare.html");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	Actions act=new Actions(driver);
	
	WebElement dd = driver.findElement(By.xpath("//div[@id='dropZone']//div[@class='CodeMirror-scroll']//div[6]//pre[1]"));
	WebElement xxx = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[3]/pre"));
	
	act.keyDown(dd, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
	act.keyDown(dd, Keys.CONTROL).sendKeys("v").build().perform();
	
	driver.close();
	
	
	
	
}
}