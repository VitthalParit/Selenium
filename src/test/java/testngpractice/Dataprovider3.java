package testngpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName;

public class Dataprovider3 {
	WebDriver driver = new ChromeDriver();

	@Parameters({ "URL" })
	@BeforeClass
	public void launchbroweser(String ul) {

		driver.manage().window().maximize();
		driver.navigate().to(ul);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

@Test(dataProvider = "getdata")
	public void loginpage(String id, String poss) {

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys();
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys();
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
	
	
	@DataProvider
	public Object[][] getdata(){
		
		Object[][] data=new Object[2][2];
		
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		data[1][0]="Admin";
		data[1][1]="admin123";
		return data;
	}

	

	
	
	

	@AfterClass
	public void close() {

		driver.quit();
	}

}
