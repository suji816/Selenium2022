package com.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinhotelappTask10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get( "http://adactinhotelapp.com/");
		
		WebElement txtuser = driver.findElement(By.id("username"));
		 txtuser.sendKeys("sujith");
		 
		 
		 
		 WebElement txtpass = driver.findElement(By.id("password"));
		 txtpass.sendKeys("12345");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
