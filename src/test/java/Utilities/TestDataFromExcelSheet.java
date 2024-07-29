package Utilities;
	import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
	import java.util.ArrayList;
	import java.util.LinkedHashMap;
	import java.util.List;
	import java.util.Map;

	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class TestDataFromExcelSheet {

		public String[] getCredentialsFromExcel(String sheetName, int rowNumber) {
			String Excelpath= System.getProperty("user.dir")
					+"\\src\\test\\resources\\testdata\\DsAlgoTestData.xlsx";	        
			String[] credentials = new String[3];
	        try {
	            FileInputStream fileInputStream = new FileInputStream(Excelpath);
	            Workbook workbook = WorkbookFactory.create(fileInputStream);
	            Sheet sheet = workbook.getSheet(sheetName);

	            Row row = sheet.getRow(rowNumber);
	            credentials[0] = row.getCell(0).getStringCellValue();
	            credentials[1] = row.getCell(1).getStringCellValue();
	            credentials[2] = row.getCell(2).getStringCellValue();


	            fileInputStream.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return credentials;
	    }

	

	
}


