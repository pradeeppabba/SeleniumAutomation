package crossBrowsing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowsing {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		String path=System.getProperty("user.dir");
		System.out.println("the user direction is ="+path);
		
		//this line for getting the path of the line
		File f = new File(path+"\\data\\data.properties");
		//this line for read the data of the file
		FileInputStream fis=new FileInputStream(f);
		
		//we are created this line for .properties file reading purpose
		Properties prop=new Properties();
		
		//to load the data
		prop.load(fis);
		//this line getting the what the data present in the file with using getproperty
		//we can use key of the value
		String browse=prop.getProperty("browser");
		System.out.println(browse);
		
		if(browse.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver.exe");
		    driver=new ChromeDriver();
		}else if(browse.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", path+"\\drivers\\geckodriver.exe");
		    driver=new FirefoxDriver();
		}
		else {
			System.out.println("you are choosen wrong browser");
		}
		driver.get(prop.getProperty("url"));
		
		WebElement search = driver.findElement(By.xpath(prop.getProperty("searchXpath")));
        search.sendKeys(prop.getProperty("searchInput"));
	}

}
