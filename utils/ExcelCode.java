package utils;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	
	
	
	public static String[][] readExcel() throws IOException {
		
		
		XSSFWorkbook wb= new XSSFWorkbook("./data/TC0012.xlsx");  //locate the workbook in the project
		
		XSSFSheet ws = wb.getSheetAt(0);  // locate the sheet number to fetch the data
	
		int rowCount = ws.getLastRowNum();
		int cellCount= ws.getRow(0).getLastCellNum();
		
		
		String[][] data= new String [rowCount][cellCount];
		
		
		for(int i=1; i<=rowCount; i++) {
			
			for(int j=0; j<cellCount; j++) {
				
				
				String CellValue = ws.getRow(i).getCell(j).getStringCellValue();
				
				data[i-1][j]= CellValue;
			}
		}
		
			wb.close();
			
			return data;
		
	}

}
