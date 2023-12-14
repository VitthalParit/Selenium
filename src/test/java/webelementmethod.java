import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webelementmethod {

	@Test
	public void clearmethod() {
WebDriver b= new ChromeDriver();
		
		b.manage().window().maximize();
		b.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		b.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement c=b.findElement(By.xpath("//input[@placeholder='Username']"));
		c.sendKeys("Admin");
		
	WebElement t=b.findElement(By.xpath("//input[@placeholder='Password']"));
	t.sendKeys("admin123");
	
	WebElement q=b.findElement(By.xpath("//button[@type='submit']"));
	q.click();
	
	b.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	System.out.println(b.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/input")).getAttribute("class"));
	
	System.out.println(b.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/input")).getCssValue("width"));
	
	b.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/input")).sendKeys("admin");
	
	System.out.println(b.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/input")).isDisplayed());
	System.out.println(b.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/input")).isSelected());
	System.out.println(b.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/input")).isEnabled());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}
}
