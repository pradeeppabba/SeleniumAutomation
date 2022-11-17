package com.qa.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samyu\\eclipse-MySeleniumFirstProject\\MySeleniumFirstProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement element = driver.findElement(By.tagName("select"));
		Select dropdown=new Select(element);
		Thread.sleep(3000);
		//dropdown.selectByVisibleText("Bahrain");
		//dropdown.selectByIndex(20);
		//dropdown.selectByValue("AGO");
		//To get total dropdown count and all names of the dropdown list
		//getOptions();
		List<WebElement> list = dropdown.getOptions();
		System.out.println(list.size());
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
			
		}
		
	}

}
