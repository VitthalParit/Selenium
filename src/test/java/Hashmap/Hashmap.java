package Hashmap;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Hashmap {
	
	WebDriver driver;
	@Test(dataProvider = "Adesh" , priority = 1)
	public void demohashmP(HashMap<String, String>  vitthal) throws InterruptedException {
		
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(vitthal.get("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(vitthal.get("ID"));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(vitthal.get("possward"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.close();
		
		
	}
	
	
	@Test(dataProvider = "Adesh" , priority = 2)
	public void shettylogin(HashMap<String, String> mahesh) {
		
		driver.navigate().to(mahesh.get("URL"));
		
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(mahesh.get("ID"));
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys(mahesh.get("possward"));
		driver.findElement(By.xpath("//input[@id='login']")).click();
	}
	
	
	@DataProvider
	public Object[][] Adesh() {

			
			HashMap<String, String> j=new HashMap<String, String>();
			j.put("ID", "Admin");
			j.put("possward", "admin123" );
			j.put("URL", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			HashMap<String, String> l =new HashMap<String, String>();
			
			l.put("ID", "vitthaleosoftqa@gmail.com");
			l.put("possward", "9qPxdmA$Dd*u4!");
			l.put("URL", "https://rahulshettyacademy.com/client");
			
			
			
			
			return new Object[][] {{j} ,{l}};
		}
		
		
	}


