package com.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		
		WebElement txtusername = driver.findElement(By.id("email"));
		
		 txtusername.sendKeys("sujith");
		 
		 WebElement txtpassword = driver.findElement(By.id("pass"));
		 
		 txtpassword.sendKeys("8300191276");
		 
		 driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
