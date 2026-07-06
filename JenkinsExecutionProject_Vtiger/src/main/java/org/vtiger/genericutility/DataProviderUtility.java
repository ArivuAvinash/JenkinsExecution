package org.vtiger.genericutility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataProviderUtility {
	@DataProvider(name="MultipleData")
	public  Object[][] toLearn_readMultipleDataFromExcelFile() throws Throwable 
	{
//		Create object of FileInputStream class and pass the excel file path
		FileInputStream efis = new FileInputStream("./src/test/resources/Vtiger.xlsx");
		
//		Create Object of WorkBookFactory to open the excel file
		Workbook wb = WorkbookFactory.create(efis);
		
//		Traverse to sheet
		Sheet sheet = wb.getSheet("MultiData");
		
		int lastrownum = sheet.getLastRowNum();//2
		int physical = sheet.getRow(0).getPhysicalNumberOfCells();//3
		Object[][] data=new Object[lastrownum][physical];//data[2][3]
		for(int i = 1; i<=lastrownum ; i++)
		{
			Row row = sheet.getRow(i);//
			for(int j=0; j< physical ; j++)
			{
				 Cell cell = row.getCell(j);
				data[i-1][j]= cell.getStringCellValue();
				
				
		
			}
			
		}
//		close workbook
		wb.close();
		return data;
		
		}
	@DataProvider(name="Multicontact")
	public  Object[][] toLearn_readMultipleContactDataFromExcelFile() throws Throwable 
	{
//		Create object of FileInputStream class and pass the excel file path
		FileInputStream efis = new FileInputStream("./src/test/resources/Vtiger.xlsx");
		
//		Create Object of WorkBookFactory to open the excel file
		Workbook wb = WorkbookFactory.create(efis);
		
//		Traverse to sheet
		Sheet sheet = wb.getSheet("Multicontact");
		
		int lastrownum = sheet.getLastRowNum();//2
		int physical = sheet.getRow(0).getPhysicalNumberOfCells();//3
		Object[][] data=new Object[lastrownum][physical];//data[2][3]
		for(int i = 1; i<=lastrownum ; i++)
		{
			Row row = sheet.getRow(i);//
			for(int j=0; j< physical ; j++)
			{
				 Cell cell = row.getCell(j);
				data[i-1][j]= cell.getStringCellValue();
				
				
		
			}
			
		}
//		close workbook
		wb.close();
		return data;
		
		}
}
