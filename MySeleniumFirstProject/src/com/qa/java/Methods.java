package com.qa.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samyu\\eclipse-MySeleniumFirstProject\\MySeleniumFirstProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		String expTitle="Google";
		String actTitle =driver.getTitle();
		String currentUrl=driver.getCurrentUrl();
		System.out.println("the title of the page is :"+actTitle);
		System.out.println(("the url of the page is :"+currentUrl));
		//how to validate Title?
		if(expTitle.equals(actTitle))
		{
			System.out.println("title test pass");
		}
		else
		{
			System.out.println("title test fail");
		}
		
		/*
		 *  navigate method contains four types of commands
		 *  1.to()-this command will navigate to URL
		 *  2.back()-this command works with backward the page
		 *  3.forward()-it works with forward the page
		 *  4.refresh()-it works with refresh the page
		 */
		driver.navigate().to("https://facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		String actTitle1 =driver.getTitle();
		String currentUrl1=driver.getCurrentUrl();
		System.out.println("the title of the page is :"+actTitle1);
		System.out.println(("the url of the page is :"+currentUrl1));
		//how to validate Title?
		if(expTitle.equals(actTitle))
		{
			System.out.println("title test pass");
		}
		else
		{
			System.out.println("title test fail");
		}
		
		
		
		
		
		
		
	}

}
