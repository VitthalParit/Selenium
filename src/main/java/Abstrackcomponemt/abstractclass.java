package Abstrackcomponemt;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class abstractclass {

	WebDriver driver;

	public abstractclass(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void waitdd(By product) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(product));
	}

	public void switchwindow() {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();

		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(child);

	}

	public void Alertaccept() {
		driver.switchTo().alert().accept();
	}

	public void Alertdismiss() {
		Alert art1 = driver.switchTo().alert();
		art1.dismiss();
	}

}
