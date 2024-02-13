package Getlinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Getlinks3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.anthropic.com/index/claude-2");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		List<WebElement> collect=driver.findElements(By.xpath("a"));
		
		System.out.println(" " + collect.size() );
		for(int t=0; t<collect.size(); t++) {
			System.out.println(collect.get(t).getText());
			System.out.println(collect.get(t).getCssValue("href"));
		}
		driver.close();
		
		
	}

}
