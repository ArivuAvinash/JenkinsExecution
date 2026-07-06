package org.vtiger.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This Class  contains read data from external resources.
 * @author Arivu
 */
public class FileUtility {
	/**
	 * This method is used to fetch the data from properties file.
	 * @param key
	 * @return String
	 * @throws IOException
	 */
public String readDataFromPropertiesFile(String key) throws IOException {
	// create an object of file inputStream and pass the filepath
	FileInputStream fis= new FileInputStream("./src/test/resources/commondata.properties");
	// create object of filetye
	Properties prop= new Properties();
	//load the data
	prop.load(fis);
	//fetch the data 
	String value=prop.getProperty(key);
	return value;
}
/**
 * This method is used to fetch the data from Excel file
 * @param SheetName
 * @param RowNum
 * @param CellNum
 * @return String
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public String readDataFromExcelFile(String SheetName,int RowNum,int CellNum) throws EncryptedDocumentException, IOException
{
	// create an object of file inputStream and pass the filepath
		FileInputStream fis= new FileInputStream("./src/test/resources/Vtiger.xlsx");
	//open the excelfile
		Workbook wb = WorkbookFactory.create(fis);
	//traverse to sheet
		String value = wb.getSheet(SheetName).getRow(RowNum).getCell(CellNum).getStringCellValue();
		return value;
		
}
	
}
