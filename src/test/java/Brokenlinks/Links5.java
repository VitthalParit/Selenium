package Brokenlinks;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Links5 {
	WebDriver driver;


	@BeforeMethod
	public void clicklink() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neosoft\\Downloads\\chromedriver-win64.zip\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	}
		
		@Test
		public void clicklink1() {
			
		
	List<WebElement>links=driver.findElements(By.tagName("a"));
	for(WebElement d:links) {
		d.click();
		String capture = d.getAttribute("href");
		System.out.println(" " + capture);
	}}
		
		@AfterMethod
		public void screenshotes() {
			
		
	
		File ss= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String destPath=System.getProperty(("user.dir")+"\\ScreenShot\\testName.png");
		}	
	}

