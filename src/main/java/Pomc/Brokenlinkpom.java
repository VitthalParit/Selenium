package Pomc;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.bouncycastle.oer.its.etsi102941.Url;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Brokenlinkpom {

	WebDriver driver;

	public Brokenlinkpom(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "a")
	private List<WebElement> ff;

	public List<WebElement> brkoenlinks() throws MalformedURLException, IOException {
		for (WebElement f : ff) {
			String h = f.getAttribute("href");
	
		
			HttpURLConnection gg = (HttpURLConnection) new URL(h).openConnection();
			gg.setRequestMethod(h);
			gg.connect();
			int code = gg.getResponseCode();
			
			System.out.println(" " + code);
			
		}
		
		return ff;
		
		}
}