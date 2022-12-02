package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.BaseClass;

public class RegistrationPage {
	public RegistrationPage() {
		PageFactory.initElements(BaseClass.getDriver(),this);
		
	}
	@FindBy(name="firstName")
	WebElement firstName;
	@FindBy(name="lastName")
	WebElement lastName;
	@FindBy(xpath = "//input[@name='phone']")
	WebElement phone;
	@FindBy(name="userName")
	WebElement email;
	@FindBy(name="address1")
	WebElement address;
	@FindBy(xpath = "//input[@name='city']")
	WebElement city;
	@FindBy(xpath = "//input[@name='state']")
	WebElement state;
	@FindBy(name="postalCode")
	WebElement postalCode;
	@FindBy(name="country")
	WebElement country;
	@FindBy(xpath = "//input[@name='email']")
	WebElement userName;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(name="confirmPassword")
	WebElement confirmPassword;
	@FindBy(xpath ="//input[@name='submit']")
	WebElement submit;
	
	@FindBy(xpath = "//table/tbody/tr/td/p/font/b/following::font[1]")
	WebElement actualText;
	
	public void registration(String fn,String ln,String phno,String mail,String adrs,String cty,String stat,String pincode,String coun,String un,String pw,String cpw) throws InterruptedException {
		firstName.sendKeys(fn);
		lastName.sendKeys(ln);
		phone.sendKeys(phno);
		email.sendKeys(mail);
		address.sendKeys(adrs);
		city.sendKeys(cty);
		state.sendKeys(stat);
		postalCode.sendKeys(pincode);
		Select dCountry=new Select(country);
		dCountry.selectByVisibleText(coun);
		userName.sendKeys(un);
		password.sendKeys(pw);
		confirmPassword.sendKeys(cpw);
		submit.click();
		Thread.sleep(5000);
		
	}
	public String validateRegistrationPage() {
		return actualText.getText();
		
	}

}
