package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.PropertyUtils;

public class LoginPageTest {
	BaseClass baseClass=new BaseClass();
	HomePage homePage;
	LoginPage loginPage;
	
	
	@BeforeTest
	public void setUp() {
		baseClass.setupBrowser();
		BaseClass.getDriver().get(PropertyUtils.getProperty("test.website.url"));
		
	}
	
	@Test(priority = 1)
	public void loginTest() throws InterruptedException {
		homePage=new HomePage();
		loginPage=new LoginPage();
		homePage.loginOperation();
		loginPage.loginOperation(PropertyUtils.getProperty("username"),PropertyUtils.getProperty("password"));
		Thread.sleep(3000);
		
	}
	
	@Test(priority = 2)
	public void verifyLogin() {
		loginPage=new LoginPage();
		String actualText=loginPage.verifyLoginPage();
		System.out.println(actualText);
		Assert.assertEquals(actualText, "Login: Mercury Tours");
	}
	
	@AfterTest
	public void close() {
		baseClass.tearDown();
		
	}

}
