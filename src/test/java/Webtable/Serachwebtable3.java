package Webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Serachwebtable3 {

	@Test
	public void Serachwebtable() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		SoftAssert soft=new SoftAssert();
		
		driver.findElement(By.xpath("")).sendKeys("");
		List<WebElement> colect=driver.findElements(By.xpath(""));
		
		List<WebElement> result=colect.stream().filter(s->s.getText().contains("veg")).collect(Collectors.toList());
		
}
}