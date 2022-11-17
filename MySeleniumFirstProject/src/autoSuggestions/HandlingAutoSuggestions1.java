package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestions1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samyu\\eclipse-MySeleniumFirstProject\\MySeleniumFirstProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("surya venu");
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='eIPGRd']"));
		System.out.println(list.size());
		for (WebElement webElement : list) {
			if(webElement.getText().equals("surya venu")) {
				webElement.click();
				break;
				
			}
			
		}

	}

}
