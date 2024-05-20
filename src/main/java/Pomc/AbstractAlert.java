package Pomc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Abstrackcomponemt.abstractclass;

public class AbstractAlert extends  abstractclass {
	WebDriver driver;
	
	public AbstractAlert(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='alertbtn']")
	private WebElement ff;
	
	
	public void Alerthandle() {
		ff.click();
		Alertaccept();
	 
	}
	

}
