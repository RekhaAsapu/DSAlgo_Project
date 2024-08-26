package Utilities;
	import java.io.File;
	import java.util.Iterator;

	import org.apache.poi.ss.usermodel.*;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.HashMap;
	import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
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

		
	    private static String EXCEL_FILE_PATH = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\DsAlgoTestData.xlsx";
	    private  ThreadLocal<Map<String, String>> testData = new ThreadLocal<>();

	    public  static Map<String, String> getTestData(String sheetName, int rowNum) throws IOException {
	        Map<String, String> dataMap = new HashMap<>();
        FileInputStream file = new FileInputStream(EXCEL_FILE_PATH);
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet(sheetName);
        if (sheet == null) {
            throw new IllegalArgumentException("Sheet with name " + sheetName + " does not exist.");
        }

        // Read header row
        Row headerRow = sheet.getRow(0);
        if (headerRow == null) {
            throw new IllegalArgumentException("Header row is missing.");
        }

        // Get the specified row
        Row dataRow = sheet.getRow(rowNum);
        if (dataRow == null) {
            throw new IllegalArgumentException("Row number " + rowNum + " does not exist.");
        }

        // Read each cell in the row
        for (int i = 0; i < dataRow.getLastCellNum(); i++) {
            String key = headerRow.getCell(i) != null ? headerRow.getCell(i).toString() : "";
            String value = dataRow.getCell(i) != null ? dataRow.getCell(i).toString() : "";
            dataMap.put(key, value);
        }
    
    return dataMap;
}
//	public class TestDataFromExcelSheet {
//
//	    private final static String EXCEL_FILE_PATH = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\DsAlgoTestData.xlsx";
//	    private static ThreadLocal<Map<String, String>> testData = new ThreadLocal<>();
//
//	    // Use CopyOnWriteArrayList to handle concurrent modifications if needed
//	    private static List<String> someList = new CopyOnWriteArrayList<>();
//
//	    public static Map<String, String> getTestData(String sheetName, int rowNum) throws IOException {
//	        // Use ThreadLocal to store data for each thread
//	        Map<String, String> dataMap = testData.get();
//	        if (dataMap == null) {
//	            dataMap = new HashMap<>();
//	            testData.set(dataMap);
//	        }
//
//	        FileInputStream file = new FileInputStream(EXCEL_FILE_PATH);
//	        Workbook workbook = new XSSFWorkbook(file);
//	        Sheet sheet = workbook.getSheet(sheetName);
//	        if (sheet == null) {
//	            throw new IllegalArgumentException("Sheet with name " + sheetName + " does not exist.");
//	        }
//
//	        // Read header row
//	        Row headerRow = sheet.getRow(0);
//	        if (headerRow == null) {
//	            throw new IllegalArgumentException("Header row is missing.");
//	        }
//
//	        // Get the specified row
//	        Row dataRow = sheet.getRow(rowNum);
//	        if (dataRow == null) {
//	            throw new IllegalArgumentException("Row number " + rowNum + " does not exist.");
//	        }
//
//	        // Read each cell in the row
//	        synchronized (dataMap) { // Synchronize access to dataMap
//	            for (int i = 0; i < dataRow.getLastCellNum(); i++) {
//	                String key = headerRow.getCell(i) != null ? headerRow.getCell(i).toString() : "";
//	                String value = dataRow.getCell(i) != null ? dataRow.getCell(i).toString() : "";
//	                dataMap.put(key, value);
//	            }
//	        }
//
//	        return dataMap;
//	    }
	    

	    public  void removeTestData() {
	        try {
				testData.remove();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	}
