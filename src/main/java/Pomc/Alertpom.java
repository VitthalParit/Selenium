package Pomc;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class Alertpom {

	WebDriver driver;

	public Alertpom(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='confirmbtn']")
	private WebElement ss;

	@FindBy(xpath = "//input[@id='alertbtn']")
	private WebElement alert;

	public void alerthandle() throws InterruptedException {
		alert.click();
		Thread.sleep(3000);
		Alert al = driver.switchTo().alert();
		al.accept();

	}

	public void dismissAlert() throws InterruptedException {
		ss.click();
		Thread.sleep(3000);
		Alert all = driver.switchTo().alert();
		all.dismiss();
	}

}
