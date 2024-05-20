package Pomc;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class framhande {
	WebDriver driver;
	public framhande(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/di")
	private WebElement nn ;
	
	@FindBy(xpath = "//div[@id='dropZone2']//div[@class='CodeMirror-scroll']")
	private WebElement nnn ;
	
	public void getmethod() {
		
		Actions an=new Actions(driver);
		an.keyDown(nn, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		an.keyDown(nnn, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	
	}

}
