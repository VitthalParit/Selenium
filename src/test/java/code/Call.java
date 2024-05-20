package code;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Call {
	WebDriver driver = new EdgeDriver();

	Actions dd = new Actions(driver);

	@BeforeClass
	public void vitthal() throws InterruptedException {

		driver.manage().window().maximize();
		driver.navigate().to("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@BeforeMethod
	public void vitthel() {

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("hicafod7833@getmola.com");
		driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys("Vitthal@95");
		driver.findElement(By.xpath("/html/body/main/div/div/div/div[2]/div/div/form/div[3]/button")).click();

	}

	@Test
	public void rwfk() throws InterruptedException {

		WebElement rr = driver.findElement(By.xpath("/html/body/main/div/ul/li[3]/a/img[1]"));

		dd.moveToElement(rr).click().build().perform();
		Thread.sleep(3000);
		WebElement aa = driver.findElement(By.xpath("/html/body/main/section/div[3]/div[1]/div/button/div/img"));
		dd.moveToElement(aa).click().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"offcanvasRightFilter\"]/div[2]/form/div[1]/input")).sendKeys("aug");
		driver.findElement(By.xpath("//*[@id=\"startDate\"]/input")).sendKeys("02-02-2024");
		driver.findElement(By.xpath("//*[@id=\"toDate\"]/input")).sendKeys("10-02-2024");
		driver.findElement(By.xpath("//*[@id=\"offcanvasRightFilter\"]/div[2]/form/div[3]/input")).sendKeys("1222");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"offcanvasRightFilter\"]/div[2]/form/div[4]/button[2]")).click();	
		
	}

}
