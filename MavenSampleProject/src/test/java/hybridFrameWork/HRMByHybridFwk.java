package hybridFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import modularDrivenFramwork.HRMProject;

public class HRMByHybridFwk {
	//we are combining DataDrivenFramework and ModularDrivenFramework
	
	HRMProject hrm=new HRMProject();
	FileInputStream fis;
	FileOutputStream fo;
	XSSFWorkbook wb;
	XSSFSheet ws;
	Row r;
	
	@Test
	public void hybridDriven() throws IOException, InterruptedException {
		hrm.open();
		fis=new FileInputStream("C:\\Users\\samyu\\OneDrive\\Desktop\\HybridFrameWork.xlsx");
		wb=new XSSFWorkbook(fis);
		ws=wb.getSheet("Sheet1");
		
		int row=ws.getLastRowNum();
		for(int i=1;i<=row;i++) {
			r=ws.getRow(i);
			Thread.sleep(3000);
			//calling login operation
			hrm.login(r.getCell(0).getStringCellValue(),r.getCell(1).getStringCellValue());
			Thread.sleep(2000);
			String expectedResult="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
			String actaulUrl=hrm.loginStatus(expectedResult);
			r.createCell(2).setCellValue(actaulUrl);
			
			if(expectedResult.equals(actaulUrl)) {
				r.createCell(3).setCellValue("Pass");
				System.out.println("test passed");
			}else {
				r.createCell(3).setCellValue("fail");
				System.out.println("test failed");
			}
			Thread.sleep(3000);
			hrm.getDriver().navigate().back();
			
			Thread.sleep(2000);
			
		}
		fo=new FileOutputStream("C:\\Users\\samyu\\OneDrive\\Desktop\\HybridFrameWork.xlsx");
		wb.write(fo);
		hrm.tearDown();
		
		
		
	}

}
