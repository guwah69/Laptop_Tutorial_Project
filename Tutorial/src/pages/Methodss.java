package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methodss {
	
	public String GoToFacebook()
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("http://facebook.com");
		
		return "Pass";
	}

}
