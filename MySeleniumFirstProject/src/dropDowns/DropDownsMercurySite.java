package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownsMercurySite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samyu\\eclipse-MySeleniumFirstProject\\MySeleniumFirstProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		WebElement element = driver.findElement(By.tagName("select"));
		Select dropdown=new Select(element);
		Thread.sleep(3000);
		dropdown.selectByVisibleText("wildlife");
		
		
	}

}

