package Pomc;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class radioandcheckbox {

	WebDriver driver;
	public radioandcheckbox(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "input[@type='checkbox']")
	private List<WebElement> radio;
	
	public List<WebElement> radiobutton() {
		for(WebElement f:radio) {
			f.click();
		}
		return radio;
		
	}
}
