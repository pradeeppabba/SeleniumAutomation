package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;
import com.qa.util.PropertyUtils;

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
	@FindBy(xpath = "//table/tbody/tr/td/p/font/b")
	WebElement actualMsg;
	
	
	public void loginOperation(String uN,String pW) throws InterruptedException {
		userName.sendKeys(uN);
		passWord.sendKeys(pW);
		submit.click();
		
		
	}
	public String verifyLoginPage() {
		return BaseClass.getDriver().getTitle();
		
	}
}
