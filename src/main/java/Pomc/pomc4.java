package Pomc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomc4 {
	
	WebDriver driver;
	
	public pomc4(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	
	

	@FindBy(xpath = "//input[@id='userEmail']")
	private WebElement id;
	
	@FindBy(xpath = "//input[@id='userPassword']")
	private WebElement poss;
	
	@FindBy(xpath = "//input[@id='login']")
	private WebElement l;
	
	public void actions(String g , String p) {
		id.sendKeys(g);
		poss.sendKeys(p);
		l.click();
		
		
		
		
	}
	

}
