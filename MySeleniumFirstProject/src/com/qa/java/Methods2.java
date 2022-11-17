package com.qa.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samyu\\eclipse-MySeleniumFirstProject\\MySeleniumFirstProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.navigate().to("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println("The page title :"+title);
		String currentUrl=driver.getCurrentUrl();
		System.out.println("The current page Url :"+currentUrl);
		String address=driver.getWindowHandle();
		System.out.println("The page address :"+address);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.ajio.com/");
		List<WebElement>list=driver.findElements(By.xpath("//a[@class=' alignTag']"));
		System.out.println(list.size());
		for(WebElement element:list)
		{
			System.out.println(element.getText());
		}
		driver.close();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
