package mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samyu\\eclipse-MySeleniumFirstProject\\MySeleniumFirstProject\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		Actions act=new Actions(driver);
		WebElement men = driver.findElement(By.xpath("//div[@class='NavBarDesktop__Subtitle-sc-1049n7y-0 khLrSE'][3]"));
		act.moveToElement(men).build().perform();
		//Handling the sub menu web element
		
		/*Actions act=new Actions(driver);
		WebElement men = driver.findElement(By.xpath("//div[@class='NavBarDesktop__Subtitle-sc-1049n7y-0 khLrSE'][3]"));
		act.moveToElement(men).build().perform();
		act.contextClick(men).build().perform();
		act.doubleClick(men).build().perform();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable'][1]"));
		act.dragAndDrop(drag, drop).build().perform();
		
		
		*/

	}

}
