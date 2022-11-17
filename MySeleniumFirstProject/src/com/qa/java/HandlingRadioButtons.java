package com.qa.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samyu\\eclipse-MySeleniumFirstProject\\MySeleniumFirstProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		WebElement yesRadio = driver.findElement(By.xpath("//input[@id='yesRadio']"));
		boolean select = yesRadio.isSelected();
		System.out.println(select);
		yesRadio.click();

	}

}
