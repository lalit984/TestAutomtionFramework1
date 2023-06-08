package testCases;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class MyFirstTestFW extends BaseTest{
	
	
	@Test
	public static void LoginTest() throws InterruptedException {
		
		driver.get("https://www.zoho.com/");
		driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id(loc.getProperty("email_field"))).sendKeys("lalitsharma984@gmail.com");
		driver.findElement(By.id(loc.getProperty("next_button"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id(loc.getProperty("pwd_field"))).sendKeys("krishnajhappi2"); 
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("login_next_btton"))).click();
		
		

		

	 
		
		
		
		

	}

}

