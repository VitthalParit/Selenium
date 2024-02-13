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

public class Brokeliks4 {
	@Test
	public void links() throws MalformedURLException, IOException {
		WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.navigate().to("");
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   SoftAssert o=new SoftAssert();
	   
	   
	   
	  List<WebElement>p=driver.findElements(By.xpath(""));
	  for(WebElement n: p) {
		  String z=n.getAttribute("href");
		  
		  
		  HttpURLConnection hj=(HttpURLConnection)new URL(z).openConnection();
		  hj.setRequestMethod(z);
		  hj.connect();
		  int code=hj.getResponseCode();
		  
		  o.assertEquals(code<400, n.getText() + " " + hj);
		  
		  
	  }
	}

}
