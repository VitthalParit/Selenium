package code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Code2 {

	WebDriver driver = new ChromeDriver();

	@BeforeClass
	public void lOUNCH() {
		driver.manage().window().maximize();
		driver.navigate().to("");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test(dataProvider = "daata")
	public void dataprovider(String zz, String oo) {
		driver.findElement(By.xpath("")).sendKeys(zz);
		driver.findElement(By.xpath("")).sendKeys(oo);
		driver.findElement(By.xpath("")).click();
	}

	@DataProvider
	public Object[][] daata() {

		Object[][] d = new Object[3][2];

		d[0][0] = "Admin";
		d[0][1] = "Admin2";
		d[1][0] = "3323211";
		d[1][1] = "fewfew";
		d[2][0] = "faaa";
		d[2][1] = "ddwq";
		return daata();

	}

}
