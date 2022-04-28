package com.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBanktask5 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		
		WebDriver driver =new ChromeDriver ();
		
		driver.get(" https://netbanking.hdfcbank.com/");
		
		
		Thread.sleep(6000);
		
		WebElement txtuser = driver.findElement(By.xpath("//input[contains(@name,'fldLogin')]"));
		txtuser.sendKeys("sujith");
		
			
			
		
		
		
		
		
		
		
		
	}

}
