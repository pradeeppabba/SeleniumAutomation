package com.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.RegistrationPgae;
import com.qa.util.ExcelReader;
import com.qa.util.PropertyUtils;

public class RegistrationPageTest {
	BaseClass baseClass=new BaseClass();
	RegistrationPgae registrationPage;
	HomePage homePage;
	
	String sheetName="NewTours";
	@BeforeTest
	public void setUp() {
		baseClass.setupBrowser();
		BaseClass.getDriver().get(PropertyUtils.getProperty("test.website.url"));
		BaseClass.getDriver().manage().window().maximize();
		
	}
	
	@DataProvider
	public Object[][] getTestData() {
		Object[][] data=ExcelReader.getTestData(sheetName);
		return data;
		
	}

	@Test(priority = 1,dataProvider = "getTestData")
	public void registrationTest(String FirstName,String LastName,String Phone,String Email,String Address,String City,String State
    ,String PostalCode,String Country,String UserName,String Password,String ConfirmPassword) throws Exception {
		homePage=new HomePage();
		registrationPage=new RegistrationPgae();
		
		homePage.registerOperation();
		Thread.sleep(2000);
		registrationPage.registration(FirstName, LastName, Phone, Email, Address, City, State, PostalCode, Country, UserName, Password, ConfirmPassword);
		Thread.sleep(3000);
		
	}
	@Test(priority = 2,enabled = true)
	public void registrationPageText() {
		registrationPage=new RegistrationPgae();
		String actualText=registrationPage.validateRegistrationPage();
		if(actualText.contains("Thank you for registering.")) {
			System.out.println("Registration completed successfully");
		}else {
			System.out.println("Registration failed");
		}
		
	}
	@AfterTest
	public void tearDown() {
		//baseClass.tearDown();
	}

}
