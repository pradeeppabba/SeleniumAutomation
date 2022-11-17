package mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEventsOnFlipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samyu\\eclipse-MySeleniumFirstProject\\MySeleniumFirstProject\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ril.com/");
		Actions act=new Actions(driver);
		WebElement business = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[3]"));
		act.moveToElement(business).build().perform();
		act.contextClick(business).build().perform();
		act.doubleClick(business).build().perform();
		
		
		

	}

}
