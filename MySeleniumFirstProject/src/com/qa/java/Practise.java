package com.qa.java;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\samyu\\eclipse-MySeleniumFirstProject\\MySeleniumFirstProject\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getWindowHandle());
		driver.switchTo().newWindow(WindowType.TAB);
		
		
	}

}

