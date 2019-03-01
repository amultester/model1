package com.facebook.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelsheet {
	XSSFWorkbook wb;
	
	public Excelsheet() throws Exception  {
		        File src= new File("./DataFile/Untitled 5.xlsx");
				FileInputStream fis= new FileInputStream(src);
				wb=new XSSFWorkbook(fis);
			
	}
	
	
	public String getexceldata(int sheetindex, int row, int column) 
	{
		return wb.getSheetAt(sheetindex).getRow(row).getCell(column).getStringCellValue();	
	}
	public  String getexceldata(String sheetname, int row, int column) 
	{
	
		return wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();	
	}

}
