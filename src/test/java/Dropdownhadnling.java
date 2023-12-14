import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdownhadnling {
@Test
public void dropdownhandle() throws InterruptedException {
	
	WebDriver g= new ChromeDriver();
	
	g.manage().window().maximize();
	
	g.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

	
	
	WebElement ss=g.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	
	Select v= new Select(ss);
	
	v.selectByIndex(0);
	
	
	Thread.sleep(3000);
	
	v.selectByVisibleText("Option2");
	
	Thread.sleep(3000);
	
	v.selectByValue("option3");
	
	
	g.close();
}
}
