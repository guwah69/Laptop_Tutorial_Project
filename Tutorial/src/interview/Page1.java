package interview;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Page1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		WebDriver driver = new FirefoxDriver ();
		
		driver.get("http://bbc.co.uk");
		
		driver.findElement(By.linkText("Sport")).click();
		//
		
		
		//if driver.findElement(By.linkText("Football"));
		
		boolean present;
		try {
		   driver.findElement(By.linkText("Football"));
		   present = true;
		} catch (NoSuchElementException e) {
		   present = false;
		}
		

	}

}
