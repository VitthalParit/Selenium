package Pomc;

import java.util.Iterator;
import java.util.Set;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tabhandle {
	WebDriver driver;

	public Tabhandle(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[@id='openwindow']")
	private WebElement tab;
	
	@FindBy(xpath = "//a[normalize-space()='Access all our Courses']")
	private WebElement ddd;
	

	public void hadnlewindow() throws InterruptedException {
		tab.click();
		Thread.sleep(3000);
		Set<String> ha = driver.getWindowHandles();
		Iterator<String> dd = ha.iterator();
		String parent = dd.next();
		String child = dd.next();
		driver.switchTo().window(child);
		Thread.sleep(3000);
		ddd.click();
		driver.switchTo().window(parent);

	}
}
