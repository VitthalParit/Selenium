import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Orangelogin {

	@Test
	public void login() {
		
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
	
	
	

	}
}
