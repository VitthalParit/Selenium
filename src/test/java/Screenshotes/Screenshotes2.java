package Screenshotes;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshotes2 {
	
	@Test
	public void htackescreenshotes(String o) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://stackoverflow.com/questions/3422262/how-to-take-a-screenshot-with-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.get("http://www.google.com/");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"\\storeutitlity.png"));
		

		
	}

}
