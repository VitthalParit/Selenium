package practice;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Practice4 {

	@Test
	public void practice4() throws IOException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		

		driver.findElement(By.xpath("")).sendKeys("Admin");

		driver.findElement(By.xpath("Admin@3")).sendKeys("22344554344");
		driver.findElement(By.xpath("")).click();

		// check element clickbale enable disply get Attribute (webelement method)

		boolean dd = driver.findElement(By.xpath("")).isDisplayed();
		boolean ff = driver.findElement(By.xpath("")).isEnabled();

		boolean ww = driver.findElement(By.xpath("")).isSelected();
		System.out.println(driver.findElement(By.xpath("")).getAttribute("href"));
		System.out.println(driver.findElement(By.xpath("")).getText());
		
		//handling dropdowm
		
		WebElement f= driver.findElement(By.xpath("Admin@3"));
		Select as=new Select(f);
		as.selectByIndex(0);
		as.selectByValue("");
		as.selectByVisibleText("");
		
		//ropdown handle without selecr classs
		
		List<WebElement>az=driver.findElements(By.xpath(""));
		
		for(WebElement vb:az) {
			if(vb.getText().equalsIgnoreCase("vitthal")) {
				vb.click();
			}
		}
		
		// handlin mouse ACTION 
		
		Actions ss=new Actions(driver);
		WebElement ddd=driver.findElement(By.xpath(""));
		WebElement ccc=driver.findElement(By.xpath(""));
		
		ss.moveToElement(ddd).click().build().perform();
		
		ss.moveToElement(ddd).contextClick().build().perform();
		
		ss.dragAndDrop(ddd, ccc).build().perform();
		ss.keyDown(Keys.CONTROL).sendKeys("a");
		ss.keyDown(Keys.CONTROL).sendKeys("c");
		ss.keyDown(Keys.CONTROL).sendKeys("v");
		
		// scolling
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(233,544");
		
		WebElement rr=driver.findElement(By.xpath(""))
;		js.executeAsyncScript("Argument[0]Scrollintoview true " , rr );


// create a new window

driver.switchTo().newWindow(WindowType.TAB);


Set<String> handles=driver.getWindowHandles();

Iterator<String>jj=handles.iterator();

String parent=jj.next();
String child=jj.next();

//swaitch the window focus

driver.switchTo().window(child);

driver.get("");

System.out.println(driver.getCurrentUrl());

driver.switchTo().frame(f);

driver.switchTo().defaultContent();

//Using rellative locators

WebElement lo=driver.findElement(By.xpath(""));
driver.findElement(with(By.tagName("a")).above(lo)).sendKeys("userid");
System.out.println(driver.findElement(with(By.tagName("a")).below(lo)).getText());

//find out webelement size width tacking scrreshotes in webelemeny

System.out.println(driver.findElement(By.xpath("")).getRect().getDimension().height);
System.out.println(driver.findElement(By.xpath("")).getRect().getDimension().width);

//tacking scrreshote on specofic webelement

WebElement sss=driver.findElement(By.xpath("ssaa"));

File ses = sss.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(ses, new File("png logo"));

//selct all the checkboxes at time o 

List<WebElement> oo= driver.findElements(By.xpath(""));

for(WebElement o : oo) {
	o.click();
}

//capture aLL THE LINKS PRINT , identify the 

SoftAssert s=new SoftAssert();

List<WebElement>ii=driver.findElements(By.xpath("a"));
for(WebElement i:ii) {
	String cc= i.getAttribute("href");
	System.out.println(cc);
	System.out.println(i.getText());
	HttpURLConnection b=(HttpURLConnection) new URL(cc).openConnection();
	b.setRequestMethod(cc);
	b.connect();
	int statuscode=b.getResponseCode();
	
	s.assertEquals(statuscode<400, i.getText() + " " +statuscode );
	
}










		
	}}
		 
		
		
			
		
		
		
		
		
		

	

