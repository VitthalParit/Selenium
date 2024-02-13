package practice;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.t;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.ForDefinedMethod.WithAnnotationDefaultValue;

public class Practice3 {

	@Test
	public void practice() throws IOException {

		// browser loaunching and apply wait

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("");
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// find out hight and weight of perticullar webelement

		WebElement ff = driver.findElement(By.xpath(""));
		System.out.println(ff.getRect().getDimension().getHeight());

		System.out.println(ff.getRect().getDimension().getWidth());

		// csaputre screeshot of specific webeleemnt
		File srs = ff.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srs, new File("png.logo"));

		// rellative locstors

		WebElement cc = driver.findElement(By.xpath(""));

		System.out.println(driver.findElement(with(By.tagName("input")).toRightOf(cc)).getText());
		WebElement a = driver.findElement(By.xpath(""));
		driver.findElement(with(By.tagName("")).above(a)).sendKeys("vitthal");
		;
		WebElement c = driver.findElement(By.xpath(""));
		driver.findElement(with(By.tagName("")).below(c)).clear();
		WebElement b = driver.findElement(By.xpath(""));
		System.out.println(driver.findElement(with(By.tagName("q")).toLeftOf(b)).getAttribute(null));

		// mouse action

		WebElement o = driver.findElement(By.xpath(""));

		Actions aj = new Actions(driver);

		aj.moveToElement(o).click().build().perform();

		aj.moveToElement(o).contextClick().build().perform();

		// Scrolling the scrolll using javascrpt

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(455,600");

		WebElement ws = driver.findElement(By.xpath(""));

		js.executeAsyncScript("Argument[0].scrollintoview ", ws);

		// capute screenshot on the full webpage

	}

}
