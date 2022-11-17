package Tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samyu\\eclipse-MySeleniumFirstProject\\MySeleniumFirstProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.herokuapp.com/basic_html_form.html");
		driver.findElement(By.name("username")).sendKeys("Pradeep");
		driver.findElement(By.name("password")).sendKeys("Prd@8817");
		driver.findElement(By.name("comments")).clear();
		driver.findElement(By.name("comments")).sendKeys("Hello world");
		
		//checkboxs
		 List<WebElement> ncheckboxs = driver.findElements(By.xpath("//input[@name='checkboxes[]']"));
		System.out.println(ncheckboxs.size());
		driver.findElement(By.xpath("(//input[@name='checkboxes[]'])")).click();	
		//radios
		driver.findElement(By.xpath("(//input[@name='radioval'])[1]")).click();
		
		WebElement drop2 = driver.findElement(By.name("multipleselect[]"));
		Select sc1=new Select(drop2);
		sc1.selectByValue("ms1");
		//dropdowns
		driver.findElement(By.xpath("//select[@name='dropdown']")).click();
		WebElement drop = driver.findElement(By.xpath("//select[@name='dropdown']"));
		Select sc=new Select(drop);
		sc.selectByValue("dd6");
		driver.findElement(By.xpath("//select[@name='dropdown']")).click();
		
		driver.findElement(By.xpath("//input[@name='submitbutton'][2]")).click();
		String url = driver.getCurrentUrl();
		
		
		
	
		
		

	}

}
