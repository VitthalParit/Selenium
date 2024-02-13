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

public class screenshotsizewidhth {

	@Test
	public void locators() throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement textbox=driver.findElement(By.xpath("//input[@id='name']"));
		
		File source =textbox.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("logo.png"));
		System.out.println(textbox.getRect().getDimension().getHeight());
		System.out.println(textbox.getRect().getDimension().getWidth());
		
		
		
}

}