package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {

	ExtentReports t;

	@BeforeTest
	public void vitthal() {

		String ss = System.getProperty("user.dir")+"\\create\report";

		ExtentSparkReporter v = new ExtentSparkReporter(ss);

		v.config().setReportName("Automation reprt");
		v.config().setDocumentTitle("testcase");
		t = new ExtentReports();
	}
	
	@Test
	public void testcaes() {
		t.createTest("testcases");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		t.flush();
		
	}
}
