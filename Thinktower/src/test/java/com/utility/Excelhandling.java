package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelhandling {
	static  XSSFWorkbook wb;
	public Excelhandling() throws Exception {
	
	File src= new File("./Datafile/Gmail.xlsx");
	FileInputStream fis= new FileInputStream(src);
	 wb=new XSSFWorkbook(fis);
	
	}
	public  String sheetdata(int Shname,int rownum,int cellnum) {
		return wb.getSheetAt(Shname).getRow(rownum).getCell(cellnum).getStringCellValue();
	}
}
