import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

	
	@Test(dataProvider = "create")
	public void logintest(String user , String poss) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(poss);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@DataProvider(name="create")
	public Object[][]data1(){
		
		return new Object[][]
				
				{
			{"vitthal","Vitthal@"},
			{"adesh","2142423"},	
			{"Admin","admin123"},
			};
				
		
		
		
		
				
					
				}
	}

