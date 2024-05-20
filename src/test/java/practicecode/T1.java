package practicecode;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class T1 {
	
	WebDriver driver=new ChromeDriver();
	Actions an=new Actions(driver);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	
	
	@Test                                     //nevigationcamand and webelementt method
	public void nevigationcamandandwebeleentmethod() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("");
		driver.get(null);
		driver.navigate().refresh();
		driver.navigate().forward();
	driver.navigate().back();	
	
	
	driver.findElement(By.xpath("")).sendKeys("");
	driver.findElement(By.xpath("")).sendKeys("");
	driver.findElement(By.xpath("")).click();
	driver.findElement(By.xpath("")).clear();
boolean result = driver.findElement(By.xpath("")).isDisplayed();
boolean result1=driver.findElement(By.xpath("")).isEnabled();
boolean result2=driver.findElement(By.xpath("")).isSelected();
WebElement attr=driver.findElement(By.xpath(""));
System.out.println(attr.getAttribute("href"));
System.out.println(attr.getCssValue("colourcapture"));
attr.sendKeys("fileuploading path");}
	
	@Test
	public void  dropdownhandle() {
		
		WebElement drop=driver.findElement(By.xpath(""));
		Select sel=new Select(drop);
		sel.selectByIndex(0);
		sel.selectByValue(null);
		sel.selectByVisibleText(null);
		
		
		
		 //autosegesive dropdown as well as without using select class we can handle dropdown
		
	driver.findElement(By.xpath("")).sendKeys("");
	List<WebElement>auto=driver.findElements(By.xpath(""));
	for(WebElement au:auto) {
		if(au.equals("indian")) {
			au.click();
		}
	}}
	
	
		@Test
		public void moluseactions() {
		WebElement web=driver.findElement(By.xpath(""));
		
		WebElement web1=driver.findElement(By.xpath(""));
		an.moveToElement(web).click().build().perform();
		an.moveToElement(web).doubleClick().build();
		an.moveToElement(web, 233, 233);
		an.doubleClick(web).build().perform();
		an.contextClick(web).build().perform();
		an.dragAndDrop(web, web1);
		
		
		}
		
		@Test                           //Alerpopup handle
		public void Alerthandle() {
			
			Alert all=driver.switchTo().alert();
			all.accept();
			all.dismiss();
			all.sendKeys("");
			System.out.println(all.getText()); 
		}
		
		
		@Test
		public void frameswitching() {
			
			WebElement ddd= driver.findElement(By.xpath(""));
			driver.switchTo().frame(0);
			boolean result2=driver.findElement(By.xpath("")).isSelected();
			driver.switchTo().frame("");
			driver.findElement(By.xpath("")).click();

			driver.switchTo().frame(ddd);
			boolean result21=driver.findElement(By.xpath("")).isEnabled();
			

			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
		}
		
		@Test                                         //multiple window handle
		public void windowhandle() {
			driver.switchTo().newWindow(WindowType.TAB);
			
			Set<String>windows=driver.getWindowHandles();
			
			Iterator<String>iterator=windows.iterator();
			String parent=iterator.next();
			String child= iterator.next();
			driver.switchTo().window(child);
			System.out.println(driver.getCurrentUrl());
		}
		
		@Test                                        // hightwidthdiemssion
		public void  hightwidthdiemssion() {
		WebElement  t=driver.findElement(By.xpath(""));
		
		System.out.println(t.getRect().getDimension().getHeight());
		System.out.println(t.getRect().getDimension().getWidth());
		
		
		}
		
		@Test
		public void changepositionandsizebroser() {
			
			
			//change size
			
			Dimension sd=new Dimension(233, 334);
			driver.manage().window().setSize(sd);
			
			//change position
			Point k=new Point(344, 877);
			driver.manage().window().setPosition(k);
		}
			
			
			
			@Test
			public void explicitwait() {
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
				driver.findElement(By.xpath("")).click();
			}
			
			
			
			
			
		
		
		                                                       //dimession hight widht 
		
			
			
			
			
			
			
			
			
		
		
		
		
		
		
}
			
			
			
			
			
	
		
		
		
			
			
		
	
	
	
	
			
	
		
		
		
	
	



	
		
	
	


