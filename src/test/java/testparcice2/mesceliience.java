package testparcice2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mesceliience {
	
	WebDriver driver=new ChromeDriver();
	
	
	
	
@Test
public void mouseactions() throws AWTException {
	
	driver.manage().window().maximize();
	driver.navigate().to("");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	
	Robot dd=new Robot();
	dd.keyPress(KeyEvent.VK_ENTER);
	
	
	
	
	
	
	
	
	
	
}

}
