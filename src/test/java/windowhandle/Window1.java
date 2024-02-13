package windowhandle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.systeminfo.SystemInfo;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Window1 {
	
WebDriver driver=new ChromeDriver();


	@Test
	public void windowhandle() {

		
		driver.manage().window().maximize();

		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	

		driver.findElement(By.xpath("//button[@id='openwindow']")).click();

		Set<String> handle = driver.getWindowHandles();

		Iterator<String> parent = handle.iterator();
		String perentwindow = parent.next();
		String childwindow = parent.next();
		driver.switchTo().window(childwindow);

		driver.findElement(By.xpath("//a[normalize-space()='Access all our Courses']")).click();

		driver.switchTo().window(perentwindow);
		
		

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("vitthal");

		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();

		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("mahesh");
		
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		
		Alert all=driver.switchTo().alert();
		
		System.out.println(all.getText());
		
		all.dismiss();
		
	driver.close();
	

	}
}
