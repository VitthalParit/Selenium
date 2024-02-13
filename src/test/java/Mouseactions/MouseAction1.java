package Mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseAction1 {

	@Test
	public void mouseactions() {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://extendsclass.com/text-compare.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement select = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[6]/pre"));
		
		Actions act= new Actions(driver);
		act.keyDown(select, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
	    WebElement pest=driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[6]/pre"));
	    act.keyDown(pest, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	    
	    driver.close();
	}

}
