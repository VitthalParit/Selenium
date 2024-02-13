package Brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.netty.handler.codec.http.HttpRequest;

public class Brokenlink1 {

	@Test
	public void brokenlinks() throws MalformedURLException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		List<WebElement> links = driver.findElements(By.tagName("A"));
		SoftAssert asse=new SoftAssert();
		
		for (int p = 0; p < links.size(); p++) {
			String url = links.get(p).getAttribute("href");
		          
			
			
			HttpURLConnection DD=(HttpURLConnection)new URL(url).openConnection();
			
			DD.setRequestMethod("connect");
			DD.connect();
			
			int code=DD.getResponseCode();
			asse.assertEquals(code<400, "brken links " + links.get(p).getText() + " respose code "  + code);

			
		}
		
		asse.assertAll();
	}
}
