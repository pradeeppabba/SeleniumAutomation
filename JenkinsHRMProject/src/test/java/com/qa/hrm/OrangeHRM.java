package com.qa.hrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@Test(priority = 1)
	public void Operation() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(8000);
		
	}
	@Test(priority = 2)
	public void verifyLoginPage() {
		String actualTitle=driver.getTitle();
		String expectedTitle="OrangeHRM";
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Login Page Sucessfull");
		}else {
			System.out.println("Login Page Failure");
		}
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
