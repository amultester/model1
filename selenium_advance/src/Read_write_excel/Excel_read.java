package Read_write_excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_read {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File src=new File ("C:\\\\Users\\\\innobot-user-1.LAPTOP-9DDO4JSH\\\\Desktop\\\\3576b3d4-5b96-5e61-43d5-fad4a2bdcc14.xlsx");
		FileInputStream input1 = new FileInputStream (src);
		XSSFWorkbook ws= new XSSFWorkbook(input1);
		XSSFSheet sh=ws.getSheetAt(0);
		String  value= sh.getRow(10).getCell(3).getStringCellValue();
		System.out.println("The end result" +value);
		
		sh.getRow(0).createCell(6).setCellValue("coulumn1");
		FileOutputStream src1= new FileOutputStream(new File("C:\\\\Users\\\\innobot-user-1.LAPTOP-9DDO4JSH\\\\Desktop\\\\newfile.xlsx"));
		ws.write(src1);
		
	}
}


