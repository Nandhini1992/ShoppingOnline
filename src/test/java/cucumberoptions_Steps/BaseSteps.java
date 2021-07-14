package cucumberoptions;
import org.openqa.selenium.WebDriver;


public class BaseSteps {
	
	public static WebDriver driver;

	protected WebDriver GetDriver() {
		if (driver == null) {
			driver = Hooks.LaunchBrowser();
		}
		return driver;
	}
}


