package Hashmap;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Hashamp1 {
	
	
	@Test(dataProvider = "vitthal")
	public void test1(HashMap<String, String> input) throws InterruptedException {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(input.get("id"));
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(input.get("poss"));
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);
	driver.close();
	
	
	}
	
	@DataProvider
	public Object[][] vitthal() {
		
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("id", "Admin");
		map.put("poss", "admin123");
		return new Object[][] {{map}};
	}
	
	

}
