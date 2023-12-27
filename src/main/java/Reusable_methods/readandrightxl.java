package Reusable_methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readandrightxl {
	
	public String[][] excelarray() throws IOException{
		
		File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Allparts\\src\\main\\resources\\dataprovider.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		//int lastrow = sh.getLastRowNum();
		int lastrow =sh.getPhysicalNumberOfRows();
		int lastcolum = sh.getRow(0).getLastCellNum();
		
	
		String data[][] = new String[lastrow-1][lastcolum];
		
		for(int i=0;i<lastrow-1;i++) {
			for(int j=0;j<lastcolum;j++) {
				
				DataFormatter df = new DataFormatter();
				String formatcell = df.formatCellValue(sh.getRow(i+1).getCell(j));
				data[i][j] = formatcell;
				//System.out.println(data[i][j]);
			}
			//System.out.println();
		}
		
		return data;
	}

}
