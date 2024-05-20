package Pomc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class dropdownpom {
	WebDriver driver;
	
	Select base;
	
	
	public dropdownpom(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//select[@id='dropdown-class-example']")
	private WebElement drop;
	
	public void handletext(String text , String value, int s) throws InterruptedException {
		Select base=new Select(drop);
		
		base.selectByVisibleText(text);
		Thread.sleep(3000);
		base.selectByValue(value);
		Thread.sleep(3000);
		base.selectByIndex(s);
		
	}
	
	

	
}
