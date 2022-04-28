package com.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTask9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://demo.automationtesting.in/");
		
		WebElement txtusrename = driver.findElement(By.id("email"));
		txtusrename.sendKeys("sujith");
		
		
	}

}
