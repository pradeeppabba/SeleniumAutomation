package com.DataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NowToursRegistration {
	WebDriver driver;
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet ws;
	Row r;
	
	
	@BeforeTest
	public void open() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@Test
	public void registerOperation() throws InvalidFormatException, IOException, InterruptedException {
		//file=new File("C:\\Users\\samyu\\OneDrive\\Desktop\\DataDrivenFrameWork - Copy.xlsx");
		fis=new FileInputStream("C:\\Users\\samyu\\git\\SampleDemo\\MavenSampleProject\\src\\test\\resources\\DataDrivenFrameWork - Copy.xlsx");
		
		wb=new XSSFWorkbook(fis);
		ws=wb.getSheet("Sheet1");
		int rowc=ws.getLastRowNum();
		//for(int i=1;i<rowc;i++) {
			r=ws.getRow(1);
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).clear();
		driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
		driver.findElement(By.name("lastName")).clear();
		driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='phone']")).clear();
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(String.valueOf((long)r.getCell(2).getNumericCellValue()));
		driver.findElement(By.id("userName")).clear();
		driver.findElement(By.id("userName")).sendKeys(r.getCell(3).getStringCellValue());
		driver.findElement(By.name("address1")).clear();
		driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='city']")).clear();
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(r.getCell(5).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='state']")).clear();
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(r.getCell(6).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='postalCode']")).clear();
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(String.valueOf((int)r.getCell(7).getNumericCellValue()));
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scroll(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		Select dCountry=new Select(driver.findElement(By.xpath("//select[@name='country']")));
		dCountry.selectByVisibleText(r.getCell(8).getStringCellValue());
		
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(r.getCell(9).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(r.getCell(10).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).clear();
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(r.getCell(11).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		String actalText=driver.findElement(By.xpath("//table/tbody/tr/td/p/font/b/following::font[1]")).getText();
		System.out.println(actalText);
		r.createCell(12).setCellValue(actalText);
		if(actalText.contains("Thank you for registering")) {
			System.out.println("registration completed");
			r.createCell(13).setCellValue("pass");
		}
		else {
			System.out.println("registration failed");
			r.createCell(13).setCellValue("fail");
		}
		Thread.sleep(5000);
		fos=new FileOutputStream("C:\\Users\\samyu\\git\\SampleDemo\\MavenSampleProject\\src\\test\\resources\\DataDrivenFrameWork - Copy.xlsx");
		wb.write(fos);
		
   }
	@AfterTest
	public void tearDown() {
		driver.close();
		
	}

}
