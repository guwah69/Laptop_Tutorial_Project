package Tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchFirefox {
	
	
	
  @Test
  public void f() {
	  
	  WebDriver driver;
	  driver = new FirefoxDriver();
	  String baseURL = "http://www.google.com";
	  
	  driver.get(baseURL);
		
  }
}
