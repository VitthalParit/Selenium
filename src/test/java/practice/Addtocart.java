package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Addtocart {

	@Test
	public void Addtocart() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/client/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("vitthaleosoftqa@gmail.com");
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("9qPxdmA$Dd*u4!");
		driver.findElement(By.xpath("//input[@id='login']")).click();

		List<WebElement> add = driver.findElements(By.cssSelector(".mb-3"));

		WebElement ad = add.stream().filter(a -> a.findElement(By.xpath("//b")).equals("ZARA COAT 3")).findFirst()
				.orElse(null);

		ad.findElement(By.xpath(".card-body button:last-of-type")).click();
		
	}

}
