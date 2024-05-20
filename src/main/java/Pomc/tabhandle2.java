package Pomc;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Abstrackcomponemt.abstractclass;

public class tabhandle2 extends abstractclass {
	WebDriver driver;

	public tabhandle2(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='opentab']")
	private WebElement ddd;

	@FindBy(xpath = "//a[normalize-space()='Access all our Courses']")
	private WebElement dd;

	@FindBy(xpath = "//input[@id='alertbtn']")
	private WebElement ss;

	@FindBy(xpath = "//input[@id='confirmbtn']")
	private WebElement kk;

	public void switchswindow() {
		ddd.click();
		switchwindow();
		dd.click();

	}

	public void apopup() {
		ss.click();
		Alertaccept();
		
	}

	public void dpopup() {
		kk.click();
		Alertdismiss();
	}
}
