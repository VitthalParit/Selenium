import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom3 {
	
	public pom3(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	WebDriver driver;

	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement id;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement poss;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement l;
	
	public void actions(String g , String p) {
		id.sendKeys(g);
		poss.sendKeys(p);
		l.click();
		
		
		
		
	}
	
	
}
