package Selenium.NeusAI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDtPro {
	static String emailData;
	static String passwordData;
	public void dataTest() throws EncryptedDocumentException, IOException {
		FileInputStream fs = new FileInputStream("C:\\Users\\rohit.joshi\\eclipse-workspace\\NeusAI\\DataFetch\\Youtube.xlsx");
		Workbook w1=WorkbookFactory.create(fs);
		emailData=w1.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		passwordData=w1.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		
	}

}
