package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class allcheckboxes {

	@Test
	public void checkboxs() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(3000);
		List<WebElement>boxes= driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println("no of check boxes are vpresent on the box " + boxes.size());
		
		for(int i=0; i<boxes.size(); i++) {
			if(boxes.get(i).isSelected()) {
				System.out.println(" check box sulected");
			}
			else {
				System.out.println(" checkbos not sullected");
			}
				
			
		}
		
		Thread.sleep(3000);
		
		
		
		driver.quit();
	
	}
	

}
