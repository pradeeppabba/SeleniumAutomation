package com.magneq;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMLogin {
	WebDriver driver;
	public static Logger logger=(Logger)LogManager.getLogger(HRMLogin.class);
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		logger.info("Test case Execution started");
		driver=new ChromeDriver();
		logger.info("Browser opened sucessfully");
		//driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		logger.info("page opened Successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test
	public void operation() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		logger.info("username inserted successfully");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		logger.info("password inserted successfully");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(5000);
		logger.info("login Successfully");
	}
	@AfterTest
	public void tearDown() {
		driver.close();
		logger.info("driver closed");
	}

}
