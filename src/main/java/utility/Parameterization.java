package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
	
	public static String getData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("D:\\AugestBatch1\\FaceBook\\src\\test\\resources\\TestData.xlsx");
		String value=WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value;
		
		
	}

}
