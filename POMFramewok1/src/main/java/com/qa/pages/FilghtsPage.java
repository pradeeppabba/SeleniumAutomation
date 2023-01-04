package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.BaseClass;

public class FilghtsPage {
	public FilghtsPage(){
		PageFactory.initElements(BaseClass.getDriver(), this);
		
	}
	
	@FindBy(xpath = "//input[@name='tripType'][1]")
	WebElement tripType;
	@FindBy(xpath = "//select[@name='passCount']")
	WebElement noOfPassangers;
	@FindBy(xpath = "//select[@name='fromPort']")
	WebElement locationFrom;
	@FindBy	(xpath = "//select[@name='fromMonth']")
	WebElement startMonth;
	@FindBy(xpath = "//select[@name='fromDay']")
	WebElement startDate;
	@FindBy(xpath = "//select[@name='toPort']")
	WebElement locationTo;
	@FindBy(xpath = "//select[@name='toMonth']")
	WebElement returnMonth;
	@FindBy(xpath="//select[@name='toDay']")
	WebElement returnDate;
	@FindBy(xpath = "(//input[@name='servClass'])[2]")
	WebElement typeOfClass;
	@FindBy	(xpath = "//select[@name='airline']")
	WebElement typeOfAirLine;
	@FindBy(xpath = "//input[@name='findFlights']")
	WebElement ContinueButton;
	@FindBy(xpath = "//table/following::font[@size='4'][1]")
	WebElement seatAvailableMsg;
	@FindBy(xpath = "//table/descendant::img[@src='images/home.gif']")
	WebElement backButton;
	
	public void filghtPageOperation(String passangers,String locfrom,String sMonth,String sDate,String locTo,String rMonth,String rDate,String tAirline) {
		tripType.click();
		Select dropDown1=new Select(noOfPassangers);
		dropDown1.selectByVisibleText(passangers);
		
		Select dropDown2=new Select(locationFrom);
		dropDown2.selectByVisibleText(locfrom);
		
		Select dropDown3=new Select(startMonth);
		dropDown3.selectByVisibleText(sMonth);
		
		Select dropDown4=new Select(startDate);
		dropDown4.selectByVisibleText(sDate);
		
		Select dropDown5=new Select(locationTo);
		dropDown5.selectByVisibleText(locTo);
		
		Select dropDown6=new Select(returnMonth);
		dropDown6.selectByVisibleText(rMonth);
		
		Select dropDown7=new Select(returnDate);
		dropDown7.selectByVisibleText(rDate);
		
		typeOfClass.click();
		
		Select dropDown8=new Select(typeOfAirLine);
		dropDown8.selectByVisibleText(tAirline);
		
		ContinueButton.click();
	
	}
	public String validateFilghtPage() {
		System.out.println(seatAvailableMsg);
		return seatAvailableMsg.getText();
		
	}
	public void goToHome() throws InterruptedException {
		 backButton.click();
		 Thread.sleep(3000);
		
	}
}

