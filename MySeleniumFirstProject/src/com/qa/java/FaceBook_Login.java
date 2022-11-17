package com.qa.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\samyu\\eclipse-MySeleniumFirstProject\\MySeleniumFirstProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pradeeppabba3p@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Prd@8817");
		driver.findElement(By.xpath("(//*[contains(text(),'Log in')])[1]")).click();
		

	}

}