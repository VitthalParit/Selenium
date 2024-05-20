package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class getption {

	@Test
	public void getpotion() throws InterruptedException {

		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			WebElement ss = driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"));

			Select dd = new Select(ss);

			List<WebElement> ff = dd.getOptions();

			Thread.sleep(3000);
			for (int c = 0; c < ff.size(); c++) {
				dd.selectByIndex(c);

			}
			Thread.sleep(3000);
			driver.close();
		}
	}

}
