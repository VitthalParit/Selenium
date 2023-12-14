package RahulShetty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Staticdropdown {

	
	@Test
	public void Staticdropdown() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select top=new Select(dropdown);
		top.selectByIndex(0);
		System.out.println(top.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		top.selectByVisibleText("AED");
		System.out.println(top.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		top.selectByValue("USD");
		System.out.println(top.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		driver.close();
	}
}
