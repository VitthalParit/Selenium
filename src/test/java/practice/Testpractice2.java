package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testpractice2 {
	WebDriver driver = new ChromeDriver();
	SoftAssert soft = new SoftAssert();
	Actions an = new Actions(driver);

	@BeforeClass
	public void launchbrowser() {

		driver.manage().window().maximize();
		driver.navigate().to("");
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
		// applying the ewait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test // capturelinkandbrkenlinks
	public void capturelinkandbrkenlinks() throws MalformedURLException, IOException {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			String pp = link.getAttribute("Href");

			// brken links

			HttpURLConnection v = (HttpURLConnection) new URL(pp).openConnection();
			v.setRequestMethod(pp);
			v.connect();

			// store status code

			int code = v.getResponseCode();
			soft.assertEquals(200, code);

		}
	}

	@Test // mousev actions
	public void mouseactions() {
		
		WebElement az=driver.findElement(By.xpath(""));
		WebElement ff=driver.findElement(By.xpath(""));
		
		an.moveToElement(az).click().build().perform();
		
		an.contextClick(az).build().perform();
		
		//drag and drop 
		
		an.dragAndDrop(az, ff).build().perform();
		
		//keyboard actions
		
		an.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		an.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		an.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
	}
	
	@Test
	public void scrolling() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	}
	
}
