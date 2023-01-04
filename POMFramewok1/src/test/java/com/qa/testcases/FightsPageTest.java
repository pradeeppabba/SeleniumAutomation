package com.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.FilghtsPage;
import com.qa.pages.HomePage;
import com.qa.util.ExcelReader;
import com.qa.util.PropertyUtils;

public class FightsPageTest {
	BaseClass baseClass=new BaseClass();
	FilghtsPage filghtsPage;
	HomePage homePage;
	String sheetName1="FlightPage";
	
	@BeforeTest
	public void setUp() {
		baseClass.setupBrowser();
		BaseClass.getDriver().get(PropertyUtils.getProperty("test.website.url"));
		
	}
	
	@DataProvider
	public Object[][] getTestData() {
		Object[][] data = ExcelReader.getTestData(sheetName1);
		return data;
	}
	
	@Test(priority = 1,dataProvider = "getTestData")
	public void flightTest(String noOfPassangers,String locationFrom,String startMonth,String startDate,String locationTo,String returnMonth,String returnDate,String typeOfAirLine) throws InterruptedException {
		homePage=new HomePage();
		filghtsPage=new FilghtsPage();
		
		homePage.filghtOperation();
		Thread.sleep(3000);
		filghtsPage.filghtPageOperation(noOfPassangers, locationFrom, startMonth, startDate, locationTo, returnMonth, returnDate, typeOfAirLine);
		Thread.sleep(8000);
	}
	@Test(priority = 2)
	public void filghtPageText() throws InterruptedException {
		//filghtsPage=new FilghtsPage();
		String actualText=filghtsPage.validateFilghtPage();
		String expectedText="After flight finder - No Seats Avaialble";
		if(actualText.contains(expectedText)) {
			filghtsPage.goToHome();
			System.out.println("Filght Page successfully opened");
			
		}else {
			System.out.println("Flight Page Failure");
		}
		Thread.sleep(3000);
		
	}
	
	@AfterTest
	public void close() {
		baseClass.tearDown();
	}

}
