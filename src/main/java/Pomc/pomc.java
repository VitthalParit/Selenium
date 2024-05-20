package Pomc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomc {
	
	WebDriver driver;
	
	public pomc(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	
	

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	private WebElement id;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	private WebElement poss;
	
	@FindBy(xpath = "//button[@type='submit']" )
	private WebElement l;
	
	public void actions(String g , String p) {
		id.sendKeys(g);
		poss.sendKeys(p);
		l.click();
		
		
		
		
	}
	

}
