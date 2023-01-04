package modularDrivenFramwork;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.magneq.HRMLogin;

public class TestCase2 {
	WebDriver driver;
	HRMProject hrm;
	
	@Test
	public void data() throws InterruptedException {
		hrm=new HRMProject();
		hrm.open();
		hrm.login("Admin","admin123");
		hrm.loginStatus("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		hrm.addEmp("Pradeep","QA","Tester","Emp546");
		hrm.logOut();
		hrm.tearDown();
	}

}
