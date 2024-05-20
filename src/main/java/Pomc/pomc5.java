package Pomc;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomc5 {
	
	WebDriver driver;
	
	public pomc5(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//input[@class='radioButton']")
	private List<WebElement> dd;

	
	
	public List<WebElement> actions() {
		
		for(WebElement h:dd) {
			h.click();
		
		}
		return dd;
		
		
	}
	

}
