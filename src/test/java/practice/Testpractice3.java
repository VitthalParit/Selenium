package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testpractice3 {
	WebDriver driver = new ChromeDriver();
	SoftAssert as = new SoftAssert();

	@BeforeClass
	public void browserlaunch() {
		driver.manage().window().maximize();
		driver.navigate().to("");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test // broken links
	public void brokenlinks() throws MalformedURLException, IOException {

		List<WebElement> gg = driver.findElements(By.tagName(null));

		for (WebElement link : gg) {
			String dd = link.getAttribute("href");
			HttpURLConnection hp = (HttpURLConnection) new URL(dd).openConnection();
			hp.setRequestMethod(dd);
			hp.connect();
			int o = hp.getResponseCode();
			as.assertEquals(200, o);

		}

	}

	@Test
	public void scrolling() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(122,233");

		WebElement ss = driver.findElement(By.xpath(""));
		js.executeScript("Argument[0]scrollintoview ", ss);

	}

	@Test
	public void framhandling() {

		WebElement frame = driver.findElement(By.xpath(""));// frame find out

		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("")).sendKeys("");
		driver.switchTo().defaultContent();

	}

	@Test
	public void windowhandles() {

		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> vv = driver.getWindowHandles();
		Iterator<String> b = vv.iterator();
		String parent = b.next();
		String child = b.next();

		driver.switchTo().window(child);

		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();
	}

	@AfterClass
	public void browserclose() {
		driver.quit();
	}

}
