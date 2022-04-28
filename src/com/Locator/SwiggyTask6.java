package com.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyTask6 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		
		//driver.get(" https://www.swiggy.com/");
		
		driver.getTitle();
		
		
	//	WebElement txtlocation = driver.findElement(By.id("location"));
		//txtlocation.sendKeys("chennai");
		
		
		
		
	}
	

}
