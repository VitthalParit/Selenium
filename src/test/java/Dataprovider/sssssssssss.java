package Dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class sssssssssss {
	ExtentReports t;
	WebDriver driver;
	Actions an=new Actions(driver);
	
	

	@BeforeTest
	public void vitthal() {

		String ss = System.getProperty("user.dir")+"\\shubham\\report.html";

		ExtentSparkReporter v = new ExtentSparkReporter(ss);

		v.config().setReportName("Automation reprot");
		v.config().setDocumentTitle("testcase");
		t = new ExtentReports();
		t.attachReporter(v);
		t.setSystemInfo("tester", "vitthal parit");
	}
	
	@BeforeClass
	public void testcaes() {
		t.createTest("testcaes");
		
		
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		t.flush();
		
	}
	
	@Test
	public void search() throws InterruptedException {
		WebElement gg =driver.findElement(By.xpath(""));
		Thread.sleep(3000);
		an.moveToElement(gg).doubleClick().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("")).sendKeys("3hCgU");
		Thread.sleep(3);
		WebElement oo= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]"));
		
		Select g= new Select(oo);
		g.selectByIndex(2);
		
		driver.findElement(By.xpath("")).sendKeys("Michael Robertson\r\n");
		Thread.sleep(3000);
		WebElement l=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i"));
		Select t=new Select(l);
		t.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
		
		
		
		
		
	}
	
	
	
	
	
	@AfterTest
	public void close() {
		driver.quit();
	}
}
