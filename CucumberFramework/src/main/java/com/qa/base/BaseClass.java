package com.qa.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.util.PropertyUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;

  @BeforeTest
  public void setupBrowser() {
	  String browserName=PropertyUtils.getProperty("browser");
	  switch(browserName.toLowerCase()) {
	  case"chrome":
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  break;
	  case"firefox":
		  WebDriverManager.firefoxdriver().setup();
		  driver=new FirefoxDriver();
		  break;
	  case"edge":
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  break;
		  default:
			  System.out.println("\nEnter valid browser from the list :chrome,firefox,edge");
			  break;
	  }
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  //driver.manage().timeouts().pageLoadTimeout(page, null)	  
   }
  public static WebDriver getDriver() {
	return driver;
	  
  }
  @AfterTest
  public void tearDown() {
	  driver.quit();
  }

}

