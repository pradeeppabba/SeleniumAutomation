package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(linkText = "SIGN-ON")
	WebElement login;
	
	@FindBy(linkText = "REGISTER")
	WebElement register;
	
	@FindBy(linkText = "CONTACT")
	WebElement contacts;
	
	@FindBy(linkText = "Flights")
	WebElement filghts;
	
	@FindBy(linkText = "Hotels")
	WebElement hotels;
	
	@FindBy(linkText = "Car Rentals")
	WebElement careRentals;
	
	@FindBy(linkText = "Destinations")
	WebElement destinations;
	
	@FindBy(linkText = "Vacations")
	WebElement vacations;
	
	public String verifyHomePageTitle(){
		return BaseClass.getDriver().getTitle();
		
	}
	
	public String verifyHomePageUrl() {
		
		return BaseClass.getDriver().getCurrentUrl();
	}
	
	public void loginOperation() {
		login.click();
	}
	
	public void registerOperation() {
		register.click();
	}
	
	public void contactsOperation() {
		contacts.click();
		
	}
	
	public void filghtOperation() {
		filghts.click();
	}
	
	public void hotelsOperation() {
		hotels.click();
	}
	
	public void carRentalsOperation() {
		careRentals.click();
	}
	
	public void destinationOperation() {
		destinations.click();
	}
	
	public void vacationsOperation() {
		vacations.click();
	}
	

}