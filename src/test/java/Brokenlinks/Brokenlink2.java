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

public class Brokenlink2 {

	@Test
	public void brokenlink2() throws MalformedURLException, IOException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> ss = driver.findElements(By.tagName("a"));

		SoftAssert hh = new SoftAssert();

		for (WebElement s : ss) {

			String xx = s.getAttribute("href");

			HttpURLConnection vv = (HttpURLConnection) new URL(xx).openConnection();
			vv.setRequestMethod(xx);
			vv.connect();
			int resronsecode = vv.getResponseCode();

			hh.assertEquals(resronsecode < 400, " " + s.getText() + " " + resronsecode);

		}

	}
}
