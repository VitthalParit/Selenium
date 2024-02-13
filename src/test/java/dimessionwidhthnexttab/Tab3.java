package dimessionwidhthnexttab;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tab3 {

	
	@Test
	public void locators() throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement cat = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(cat.getRect().getDimension().getHeight());
		System.out.println(cat.getRect().getDimension().getWidth());
		
		File rr= cat.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(rr, new File("cc.png"));
		
		driver.close();
		
	}
}
