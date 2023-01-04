package modularDrivenFramwork;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCase3 {
	WebDriver driver;
	HRMProject hrm;
	
	@Test
	public void data() throws InterruptedException {
		hrm=new HRMProject();
		hrm.open();
		hrm.login("Admin","admin123");
		hrm.deleteEmp();
	}

}
