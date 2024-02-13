package RahulShetty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alertpopup {

	@Test
	public void Aelrtpopup() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("vitthal");
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@id='name']")).clear();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("adesh");
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.close();

	}
}
