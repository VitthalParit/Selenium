package dimessionwidhthnexttab;

import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class nextwindow2 {

	@Test
	public void locators() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> adress =driver.getWindowHandles();
		
		Iterator<String>it=adress.iterator();
		String parent=it.next();
		String child=it.next();
		
		driver.switchTo().window(child);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		driver.switchTo().window(parent);
		
		List<WebElement>buttons=driver.findElements(By.xpath("//input[@class='radioButton']"));
		for(WebElement button:buttons) {
			button.click();
		}
		
		
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Alert ss = driver.switchTo().alert();
		ss.accept();
		
		WebElement web=driver.findElement(By.id("dropdown-class-example"));
		
		Select dd=new Select(web);
		dd.selectByIndex(0);
		Thread.sleep(3000);
		dd.selectByValue("option2");
		Thread.sleep(3000);
		dd.selectByVisibleText("Option3");
		driver.quit();
		
		
		
		

		
		
		
		
		

}
}