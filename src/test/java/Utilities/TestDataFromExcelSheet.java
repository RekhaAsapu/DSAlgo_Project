package Utilities;
	import java.io.File;
	import org.apache.poi.ss.usermodel.*;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.HashMap;
	import java.util.Map;
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

/*	public class TestDataFromExcelSheet {

		public static String[] getCredentialsFromExcel(String sheetName, int rowNumber) {
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
	    }*/
	/*	public class TestDataFromExcelSheet {

		    // Synchronization object for thread safety
		    private static final Object lock = new Object();

		    public static String[] getCredentialsFromExcel(String sheetName, int rowNumber) {
		        String excelPath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\DsAlgoTestData.xlsx";
		        String[] credentials = new String[3];

		        // Synchronize file access to ensure thread safety
		        synchronized (lock) {
		            try (FileInputStream fileInputStream = new FileInputStream(new File(excelPath));
		                 Workbook workbook = WorkbookFactory.create(fileInputStream)) {

		                Sheet sheet = workbook.getSheet(sheetName);
		                Row row = sheet.getRow(rowNumber);

		                if (row != null) {
		                    credentials[0] = row.getCell(0) != null ? row.getCell(0).getStringCellValue() : "";
		                    credentials[1] = row.getCell(1) != null ? row.getCell(1).getStringCellValue() : "";
		                    credentials[2] = row.getCell(2) != null ? row.getCell(2).getStringCellValue() : "";
		                }

		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        }

		        return credentials;
		    }
		}*/
public class TestDataFromExcelSheet {

		
	    private  final static String EXCEL_FILE_PATH = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\DsAlgoTestData.xlsx";
	    private static ThreadLocal<Map<String, String>> testData = new ThreadLocal<>();

	    public  static Map<String, String> getTestData(String sheetName, int rowNum) throws IOException {
	        Map<String, String> data = new HashMap<>();
	        FileInputStream file = new FileInputStream(EXCEL_FILE_PATH);
	        Workbook workbook = new XSSFWorkbook(file);
	        Sheet sheet = workbook.getSheet(sheetName);

	        Row headerRow = sheet.getRow(0);
	        Row dataRow = sheet.getRow(rowNum);

	        if (headerRow != null && dataRow != null) {
	            for (Cell cell : headerRow) {
	                String header = cell.getStringCellValue();
	                String value = dataRow.getCell(cell.getColumnIndex()).getStringCellValue();
	                data.put(header, value);
	            }
	        }

	        workbook.close();
	        testData.set(data);
	        return testData.get();
	    }
	    public static void removeTestData() {
	        testData.remove();
	    }
	}
	
		

	

	

	



