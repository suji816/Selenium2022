package com.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icicibanktask4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get( "https://infinity.icicibank.com/corp/Login.jsp");
		
		WebElement butlogin = driver.findElement(By.name("DUMMY1"));
		butlogin.click();
		
		WebElement txtuser = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
		txtuser.sendKeys("sujith");
		
		
		WebElement txtpass = driver.findElement(By.name("AuthenticationFG.ACCESS_CODE"));
		txtpass.sendKeys("pass");
	
		

		
		
	
		
		
		
		
	}

}
