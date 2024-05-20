package Pomc;

import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectedbox {
	WebDriver driver;

	public selectedbox(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='checkbox']")
	private List<WebElement> checks;

	@FindBy(xpath = "//input[@class='radioButton']")
	private List<WebElement> r;

	public List<WebElement> checkvalidation() {
		for (WebElement d : checks) {
			boolean dd = d.isSelected();
			System.out.println(dd);

		}
		return checks;
	}

	public List<WebElement> buttonscheck() {
		for (WebElement a : r) {
			boolean ss = a.isEnabled();
			System.out.println(ss);
		}
		return r;
	}

	public List<WebElement> butt() {
		for (WebElement a : r) {
			boolean sss = a.isDisplayed();
			System.out.println(sss);
		}
		return r;
	}

}
