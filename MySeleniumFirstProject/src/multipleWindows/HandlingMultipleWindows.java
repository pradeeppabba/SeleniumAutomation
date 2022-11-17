package multipleWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\samyu\\eclipse-MySeleniumFirstProject\\MySeleniumFirstProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://monster.com/");
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		driver.findElement(By.xpath("//a[@class='semi-bold reg-btn block uprcse']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='googleSignIn']")).click();
		Set<String> allWindows=driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		for(String string:allWindows) {
			System.out.println(string);
			if(!parentWindow.equals(allWindows)) {
				driver.switchTo().window(string);
				
			}
		}
		driver.findElement(By.xpath("(//input[@id='identifierId'])[1]")).sendKeys("9090909090");
		driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")).click();
		
		

	}

}
