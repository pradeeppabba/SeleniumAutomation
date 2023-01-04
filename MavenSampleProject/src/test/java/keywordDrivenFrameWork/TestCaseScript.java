package keywordDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TestCaseScript extends ActionKeywords {
	ActionKeywords key;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet ws;
	FileOutputStream fio;
	Row r;
	
	@Test
	public void testData() throws IOException, InterruptedException {
		fis=new FileInputStream("C:\\Users\\samyu\\git\\SampleDemo\\MavenSampleProject\\src\\test\\resources\\KeywordDrivenFramework.xlsx");
		wb=new XSSFWorkbook(fis);
		ws=wb.getSheet("Sheet1");
		key=new ActionKeywords();
		
		int rowc=ws.getLastRowNum();
		
		for(int i=1;i<rowc;i++) {
			String runmode=ws.getRow(i).getCell(4).getStringCellValue();
			if(runmode.equals("Pass")) {
				String keyword=ws.getRow(i).getCell(3).getStringCellValue();
				
				if(keyword.equals("launchBrowser")) {
					key.launchBrowser();
				}
				else if(keyword.equals("launchApp")){
					key.launchApp();
					
				}
				else if(keyword.equals("enterUserName")){
					key.enterUserName();
				}
				else if(keyword.equals("enterPassword")) {
					key.enterPassword();
					
				}
				else if(keyword.equals("login")) {
					
					key.login();
				}
				else if(keyword.equals("logout")) {
					key.logout();
				}
				else if(keyword.equals("closeBrowser")) {
					key.closeBrowser();
				}
			}
		}
		
		
	}

}
