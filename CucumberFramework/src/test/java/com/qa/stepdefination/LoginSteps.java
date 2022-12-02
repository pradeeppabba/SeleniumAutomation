package com.qa.stepdefination;

import org.testng.Assert;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.PropertyUtils;

import io.cucumber.java.en.*;

public class LoginSteps {
	BaseClass baseClass=new BaseClass();
	LoginPage loginPage;
	HomePage homePage;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		baseClass.setupBrowser();
		BaseClass.getDriver().get(PropertyUtils.getProperty("test.website.url"));
	    
	}

	@When("User fill valid credential and click on login button")
	public void user_fill_valid_credential_and_click_on_login_button() throws InterruptedException {
		homePage=new HomePage();
		loginPage=new LoginPage();
		
		homePage.loginOperation();
		Thread.sleep(3000);
		loginPage.errorMessage();
		loginPage.login(PropertyUtils.getProperty("username"), PropertyUtils.getProperty("password"));
	    
	}

	@Then("Verify user is logged in")
	public void verify_user_is_logged_in() throws InterruptedException {
		loginPage=new LoginPage();
		String title=loginPage.validateLoginPage();
		Assert.assertEquals(title, "Login: Mercury Tours");
		Thread.sleep(3000);
	   
	}

	@When("User fill username as {string} and password as {string} and click on login button")
	public void user_fill_username_as_and_password_as_and_click_on_login_button(String string, String string2) throws InterruptedException {
		homePage=new HomePage();
		loginPage=new LoginPage();
		
		homePage.loginOperation();
		loginPage.login(string, string2);
	    
	}

	@Then("Verify the error message {string} for this {string}")
	public void verify_the_error_message_for_this(String string, String string2) {
		switch(string2) {
		case "email":
			Assert.assertEquals(loginPage.getInvalidErrorMessage(), string, "Test Failed");
			break;
		case "password":
			Assert.assertEquals(loginPage.getInvalidErrorMessage(), string, "Test Failed");
			break;
		case "invalid":
			Assert.assertEquals(loginPage.getInvalidErrorMessage(), string, "Test Failed");
			break;
		}
	    
	}

}
