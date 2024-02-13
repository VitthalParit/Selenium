package Checkboxes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Checkboxhandle {

	@Test
	public void dynamaicdropdown() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		List<WebElement> boxes = driver.findElements(By.xpath("//input[@class='radioButton']"));

		for (int p = 0; p < boxes.size(); p++) {
			boxes.get(p).click();
			System.out.println(boxes.get(p).getText());
		}

		System.out.println("" + boxes.size());

		driver.close();

	}
}