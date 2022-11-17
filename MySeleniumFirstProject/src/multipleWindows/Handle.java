package multipleWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\samyu\\eclipse-MySeleniumFirstProject\\MySeleniumFirstProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://monster.com/");
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		driver.findElement(By.xpath("//a[@class='semi-bold reg-btn block uprcse']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='googleSignIn']")).click();
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows.size());
		for (String pradeep : allwindows) {
			System.out.println(pradeep);
			if(!parentwindow.equals(allwindows)) {
				driver.switchTo().window(pradeep);
			}
			
		}

	}

}
