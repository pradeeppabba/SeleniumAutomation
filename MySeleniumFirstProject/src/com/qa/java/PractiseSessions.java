package com.qa.java;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class PractiseSessions {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samyu\\eclipse-MySeleniumFirstProject\\MySeleniumFirstProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		String title=driver.getCurrentUrl();
		System.out.println(title);
		
		/*driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prd@gmail.com");
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.meesho.com/");
		Actions ac=new Actions(driver);
		driver.findElement(By.xpath("//span[text()='Women Ethnic']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='All Kurtis']")).click();
		driver.switchTo().newWindow(WindowType.TAB);
		*/
		driver.get("https://www.monsterindia.com/");
		String pwindow = driver.getWindowHandle();
		System.out.println(pwindow);
		driver.findElement(By.xpath("//a[text()='Register with us']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("googleSignIn")).click();
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow.size());
		for (String str : allwindow) {
			System.out.println(str);
				if(!pwindow.equals(allwindow)) {
					driver.switchTo().window(str);
				}
		}
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("pradeeppabba3p@gmail.com");
		TakesScreenshot take=(TakesScreenshot)driver;
		File ss=take.getScreenshotAs(OutputType.FILE);
		Files.copy(ss, new File("C:\\Users\\prade\\OneDrive\\Desktop\\Screenshot\\MonsterPage.jpg"));
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("pradeepabba3p@gmail.com");
		driver.findElement(By.xpath(("//input[@type='password']"))).sendKeys("Prd@8817");
		
		
		
		
		

	}

}

