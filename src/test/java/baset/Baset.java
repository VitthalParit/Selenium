package baset;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Hashmap.Hashmap;

public class Baset {

	protected WebDriver driver;

	public WebDriver launch(String s) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to(s);
		return driver;

	}

	@DataProvider
	public Object[][] getdata() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", "Admin");
		map.put("poss", "admin123");

		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("id", "Admi");
		map1.put("poss", "admin12");

		return new Object[][] { { map }, { map1 } };
	}

	public String Screenshotestake(String testcasename, WebDriver driver) throws IOException {

		TakesScreenshot take = (TakesScreenshot) driver;
		File srs = take.getScreenshotAs(OutputType.FILE);

		File soues = new File(System.getProperty("user.dir") + "//Screenshotes//" + testcasename + ".png");
		FileUtils.copyFile(srs, soues);
		return System.getProperty("user.dir") + "//Screenshotes//" + testcasename + ".png";

	}

}
