package RahulShetty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateCommand {
@Test
public void Navigatecommand() throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://rahulshettyacademy.com/");
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);

	driver.navigate().back();
	Thread.sleep(3000);
	driver.close();
	
}
}
