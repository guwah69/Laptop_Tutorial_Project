package AppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://qaclickacademy.com"); //hit url
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getCurrentUrl());
		//driver.close();
		
		//FaceBook Test
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("test1");
		driver.findElement(By.id("pass")).sendKeys("Pass123");
		//driver.findElement(By.xpath(".//*[@id='u_0_o']")).click();
		//driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();
		

	}

}
