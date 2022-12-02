package com.qa.util;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.BaseClass;

public class PageUtils {
	public static long PAGE_LOAD_TIMEOUT=30;
	public static long IMPLICIT_WAIT=30;
	
	public static WebDriverWait webDriverWait(Duration waitTime) {
		return new WebDriverWait(BaseClass.getDriver(), waitTime);
	
	}
	public static void waitUntilClickable(WebElement element,Duration waitTime) {
			webDriverWait(waitTime).until(ExpectedConditions.elementToBeClickable(element));
		
		
	}
	public static void waitUntilVisible(WebElement element,Duration waitTime) {
			webDriverWait(waitTime).until(ExpectedConditions.visibilityOf(element));
	}
	public static void scrollToElement(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor)BaseClass.getDriver();
		executor.executeScript("argument[0].scrolltoView(true);", element);
	}
}




