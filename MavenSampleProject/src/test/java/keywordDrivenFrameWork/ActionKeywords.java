package keywordDrivenFrameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionKeywords {
	WebDriver driver;
	
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public void launchApp() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void enterUserName() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	}
	public void enterPassword() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	}
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(3000);
		
	}
	public void logout() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='oxd-topbar-header']/div/ul/li/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
	}
	public void closeBrowser() {
		driver.close();
	}
	

}
