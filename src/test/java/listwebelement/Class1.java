package listwebelement;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class1 {

	@Test
	public void Collection() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		String[] collect = { "vitcccthal", "brokely ", "cucumbdder", "Beetroot "

		};

		List<WebElement> sss = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int u = 0; u < sss.size(); u++) {
			String []name = sss.get(u).getText().split("-");
			String vv=name[0].trim();

			List<String> list = Arrays.asList(collect);

			if (list.contains(name)) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(u).click();
			}
		}
		
		Thread.sleep(3000);
		driver.close();

	}
}
