package com.DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WrieOnExcel {
	@Test
	public void operation() throws IOException {
		
	FileInputStream fis=new FileInputStream("C:\\Users\\samyu\\OneDrive\\Desktop\\TestExcel.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet ws=wb.getSheet("Sheet1");
	Row r=ws.createRow(1);
	r.createCell(2).setCellValue("Ramesh");
	
	FileOutputStream fos=new FileOutputStream("C:\\Users\\samyu\\OneDrive\\Desktop\\TestExcel.xlsx");
	wb.write(fos);
	

}
}
