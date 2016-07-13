package Tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserTest {
	
	
	
	
  @Test
  public void f() {
	  WebDriver dr;
	  dr = new FirefoxDriver();
	  String baseURL = "http://facebook.com";
	  
	  dr.get(baseURL);
	  
	  //driver.get("http://facebook.com");
	  
  }
}
