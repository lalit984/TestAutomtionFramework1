package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadXLSData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	
	public void getData(String excelSheetName) throws EncryptedDocumentException, IOException {
		File f= new File(System.getProperty("user.dir")+"\\src\\test\\java\\testCases\\MyFirstTestFW.java");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb= WorkbookFactory.create(fis);
		//Sheet sheetName=wb.getSheet(excelSheetName);
	}

}
