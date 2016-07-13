package Tutorial;

import java.util.concurrent.TimeUnit;

//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


//import page.classes.SearchPage;

public class TestNG_TestCase {
	private WebDriver driver;
	private String baseUrl;
	//static Logger log = Logger.getLogger(UsingLog4j.class);

	@BeforeMethod
	public void beforeMethod() {
		// driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Projects\\ChromeDriver.exe");
	    driver = new ChromeDriver();
		baseUrl = "https://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//PropertyConfigurator.configure("log4j.properties");
	}

	@Test
	public void testMethod() {
		driver.get(baseUrl);
		SearchPage.navigateToFlightsTab(driver);
		SearchPage.fillOriginTextBox(driver, "flight-origin");
		SearchPage.fillOriginTextBox(driver, "Chicago");
		//SearchPage.fillDepartureDateTextBox(driver, "12/25/2014");
		SearchPage.fillOriginTextBox(driver, "12/31/2014");
	}

	@AfterMethod
	public void afterMethod() {
	}

}
