package modularDrivenFramwork;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMProject {
	public WebDriver driver;
	
	@BeforeTest
	public void open() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
	}
	
	@Test(priority = 1)
	public WebDriver getDriver() {
		return driver;
	}
	
	@Test(priority = 2)
	public void login(String u,String p) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(u);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(p);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority = 3)
	public String loginStatus(String url) {
		String actualUrl=driver.getCurrentUrl();
		String expetedUrl=url;
		
		Assert.assertEquals(actualUrl,expetedUrl,"Url is mismatched");
		
		return actualUrl;
		
	}
	
	@Test(priority = 4)
	public void addEmp(String fn,String mn,String ln,String eid) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li/a/span[text()='PIM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//nav[@class=\"oxd-topbar-body-nav\"]/ul/li/a[text()='Add Employee']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys(fn);
		driver.findElement(By.name("middleName")).sendKeys(mn);
		driver.findElement(By.name("lastName")).sendKeys(ln);
		driver.findElement(By.xpath("//div[@class='oxd-grid-2 orangehrm-full-width-grid']/descendant::input")).sendKeys(eid);
		driver.findElement(By.xpath("//button[text()=' Save ']")).submit();
		Thread.sleep(5000);
	}
	
	@Test(priority = 5)
	public void deleteEmp() throws InterruptedException {
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li/a/span[text()='PIM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//nav[@class='oxd-topbar-body-nav']/ul/li/a[text()='Employee List']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeAsyncScript("window.scrollBy(0,300)");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("(//label/span/i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[3]")).click();
		driver.findElement(By.xpath("(//div[@class='oxd-table-cell-actions']/button/i[@class='oxd-icon bi-trash'])[3]")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-modal-footer']/button[@type='button']/i")).click();
		
	
		
	}
	
	@Test(priority = 6)
	public void updateEmp() {
		
	}
	
	@Test(priority = 6)
	public void logOut() {
		driver.findElement(By.xpath("//div[@class='oxd-topbar-header-userarea']/ul")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
