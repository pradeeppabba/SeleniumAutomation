package com.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;
import com.qa.util.PageUtils;

public class LoginPage {
	public LoginPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(name = "userName")
	WebElement userName;
	@FindBy(xpath = "//input[@name='password']")
	WebElement passWord;
	@FindBy(xpath = "//input[@name='submit']")
	WebElement submit;
	@FindBy(xpath = "/form[@name='register']/child::table//span")
	WebElement invalidErrorMessage;
	@FindBy(xpath = "//span[@class='ns-eotqs-e-16']")
	WebElement errorMessage;
	
	public void errorMessage() {
		errorMessage.click();
	}
	public void login(String uN,String pW) throws InterruptedException {
		userName.sendKeys(uN);
		passWord.sendKeys(pW);
		submit.click();
		
		
	}
	public String validateLoginPage() {
		return BaseClass.getDriver().getTitle();
		
	}
	public String getInvalidErrorMessage() {
		PageUtils.waitUntilVisible(invalidErrorMessage,Duration.ofSeconds(10));
		return invalidErrorMessage.getText();
	}
	
}