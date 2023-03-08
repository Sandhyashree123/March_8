package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static  WebDriver driver;
	public   void browserLaunch(String Url) {
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(Url);
	driver.manage().window().maximize();
	}
	
	
	//We can 3 steps in one line
		public static   WebElement locateElementmethod2(String locatortype, String value) {
			if(locatortype.equals("id")) {
			WebElement findElement = driver.findElement(By.id("username"));
			return findElement;
			}
			else if(locatortype.equals("name")) {
				WebElement findElement1= driver.findElement(By.name("password"));
				return findElement1;
			}else {
				WebElement findElement = driver.findElement(By.xpath("name"));
		         return findElement;
			}}
		public static WebElement loginbutton() {
			WebElement findElement = driver.findElement(By.name("login"));
			return findElement;
		}
		
		
		public  static void elementClick(WebElement element) {
			element.click();
	    
		}

		public static void enterText(WebElement element,String SendTokeys) {
				element.sendKeys(SendTokeys);
					
		}
		public static void crditcardtype(WebElement element,String id ) {
			Select s = new Select(element);
			s.selectByIndex(9);
		}
			public static void Searchhotel(WebElement element,String id ) {
				Select s = new Select(element);
				s.selectByValue(id);
			
			
}
}