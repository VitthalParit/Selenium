package rellativeloacters;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Rellativelocators2 {

	@Test
	public void locators() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement dd = driver.findElement(By.xpath("//input[@id='alertbtn']"));

		driver.findElement(with(By.tagName("input")).above(dd)).sendKeys("vitthal");

		WebElement rrr = driver.findElement(By.xpath("//legend[normalize-space()='Suggession Class Example']"));

		driver.findElement(with(By.tagName("input")).below(rrr)).sendKeys("mahesh");

		WebElement ss = driver.findElement(By.xpath("//input[@id='alertbtn']"));

		System.out.println(driver.findElement(with(By.tagName("input")).toRightOf(ss)).getText());

		WebElement c = driver.findElement(By.xpath("//input[@id='confirmbtn']"));

		System.out.println(driver.findElement(with(By.tagName("input")).toLeftOf(c)).getText());

		driver.quit();

	}

}