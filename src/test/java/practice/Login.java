package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {

	WebDriver driver = new ChromeDriver();

	@Parameters({ "URL", })
	@BeforeClass
	public void login(String a) throws InterruptedException {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to(a);
	}

	@Parameters({ "ID", "POSS" })
	@Test
	public void loginweb(String b, String c) {

		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(b);
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys(c);
		driver.findElement(By.xpath("//input[@id='login']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Sign Out']")).click();

	}

	@Test (dependsOnMethods = "loginweb")
	public void Addtocart() {

		List<WebElement> add = driver.findElements(By.xpath("//div[@class='card-body']"));

		WebElement ad = add.stream().filter(a -> a.findElement(By.tagName("//b")).getText().equals("ZARA COAT 3\r\n"))
				.findFirst().orElse(null);

		ad.findElement(By.xpath("//div[@class='container']//div[1]//div[1]//div[1]//button[2]")).click();
		//div[@class='container']//div[1]//div[1]//div[1]//button[2]
	}
	
	
	@BeforeClass
	public void logout() {
		driver.quit();
	}

}
