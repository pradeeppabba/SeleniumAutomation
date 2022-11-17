package screenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class SingleScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\samyu\\eclipse-MySeleniumFirstProject\\MySeleniumFirstProject\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement mouseover = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		Actions act=new Actions(driver);
		act.doubleClick().build().perform();
		TakesScreenshot take=driver;
		File ss=take.getScreenshotAs(OutputType.FILE);
		Files.copy(ss,new File("C:\\Users\\prade\\OneDrive\\Desktop\\Screenshot\\Homepage.jpg"));
	}	
	

}
