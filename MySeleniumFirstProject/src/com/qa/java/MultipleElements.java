package com.qa.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
//this program for multiple webelements

public class MultipleElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samyu\\eclipse-MySeleniumFirstProject\\MySeleniumFirstProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//getPagesource()
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle()
		//System.out.println(driver.getWindowHandle());
		
		//switchTO() method this method performs to handle the windows popups
		//driver.switchTo().newWindow(WindowType.TAB);
		//driver.get("https://www.facebook.com");
		
		//manage() -we can mange window and timeouts
		//driver.manage().window().maximize();
		
		//close() method it will close the current window
		driver.close();
		Thread.sleep(3000);
		driver.quit();
		
		
	    /*driver.get("https://www.meesho.com/");
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='NavBarDesktop__Subtitle-sc-1049n7y-0 khLrSE']"));
		System.out.println(list.size());
		
		for(WebElement element:list)
		{
			System.out.println(element.getText());
		}*/
		/*driver.get("https://amazon.in/");
		List<WebElement> list=driver.findElements(By.linkText("//a[@class='nav-a  ']"));
		int size=list.size();
		System.out.println("the web elements are :"+size);
		// webelement datattype
		for(WebElement element:list)
		{
			//to get the text of the web element we are using the getText() method
			System.out.println(element.getText());
			
		}*/
		
	} 

}
