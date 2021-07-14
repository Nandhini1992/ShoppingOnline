package cucumberoptions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends BaseSteps {
	

	
	//Open Browser
@Before
	public static WebDriver LaunchBrowser() {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	//Close Browser
@After
	public static void CloseBrowser() {
		
		driver.close();
		driver.quit();
		
	}
	
	

}


