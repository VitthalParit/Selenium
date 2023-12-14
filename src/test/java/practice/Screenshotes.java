package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshotes {
@Test
public void screenshot() throws IOException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("https://mvnrepository.com/artifact/commons-io/commons-io/2.15.0");
	
	File ss= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	String destPath=System.getProperty(("user.dir")+"\\ScreenShot\\testName.png");
	
	
	
	driver.quit();
	
}
}
