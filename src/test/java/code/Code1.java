package code;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Code1 {
	
	WebDriver driver=new ChromeDriver();
	@Test
	public void brokenlink() throws MalformedURLException, IOException {
		
		
		driver.manage().window().maximize();
		driver.navigate().to("");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
		
		@BeforeClass
		 public void links() {
			
		
		List<WebElement> size=driver.findElements(By.xpath(""));
		for(WebElement link : size) {
			String capture=link.getAttribute("href");
			
			HttpURLConnection p =(HttpURLConnection) new URL(capture).openConnection();
			
			p.setRequestMethod(capture);
			p.connect();
			int co = p.getResponseCode();
			
		
		}
		
		

}

		
