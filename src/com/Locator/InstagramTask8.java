package com.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramTask8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver ();
		
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		
		Thread.sleep(3000);
		
		WebElement txtusername = driver.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP'][1]"));
		
		txtusername.sendKeys("suji_th_16");

		Thread.sleep(3000);
		
		WebElement txtpass = driver.findElement(By.xpath("//input[@name='password']"));
		txtpass.sendKeys("123456");
		
		
		
		
	}

}
