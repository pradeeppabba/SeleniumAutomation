package pageScrolling;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandllingPgScroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samyu\\eclipse-MySeleniumFirstProject\\MySeleniumFirstProject\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");

	}

}
