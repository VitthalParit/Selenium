package Pomc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Abstrackcomponemt.abstractclass;

public class userabstrackcomponent extends abstractclass {
	WebDriver driver;

	public userabstrackcomponent(WebDriver driver) {
		super(driver);

		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[@id='opentab']")
	private WebElement aaa;

	@FindBy(xpath = "//a[normalize-space()='Access all our Courses']")
	private WebElement dd;

	By products = By.xpath("//a[normalize-space()='Access all our Courses']");

	public void checkwindow() {
		aaa.click();
		swithtab();

		

		dd.click();
	}

}
