package Brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pomc.pomc3;
import baset.Baset;

public class Brokeliks5 extends Baset {
	WebDriver driver;
	
	@Parameters({"api"})
	public void lnch(String ul) {
		driver = launch(ul);
		
	}
	
	@Parameters({"user" , "poss"})
	@Test
	public void login2(String k , String d) {
		pomc3 p3=new pomc3(driver);
		p3.loginshetty(k, d);
	}

}
