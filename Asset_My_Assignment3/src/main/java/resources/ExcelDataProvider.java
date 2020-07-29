package resources;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	public  ExcelDataProvider() {

		try { 
            FileInputStream file = new FileInputStream(new File("E:\\testdata.xlsx")); 
            
            Map<Integer, List<String>> data = new HashMap<Integer, List<String>>();
  
            // Create Workbook instance holding reference to .xlsx file 
            XSSFWorkbook workbook = new XSSFWorkbook(file); 
  
            // Get first/desired sheet from the workbook 
            XSSFSheet sheet = workbook.getSheetAt(0); 
  
            // Iterate through each rows one by one 
            Iterator<Row> rowIterator = sheet.iterator(); 
            
            int rowCnt = 0;
            
            
           while (rowIterator.hasNext()) { 
                Row row = rowIterator.next(); 
                // For each row, iterate through all the columns 
                Iterator<Cell> cellIterator = row.cellIterator(); 
                
                List<String> obj = new ArrayList<String>();
  
                while (cellIterator.hasNext()) { 
                    Cell cell = cellIterator.next(); 
                    // Check the cell type and format accordingly 
               
               
            switch(cell.getCellType()) 
            { 

            case STRING:
                
            	System.out.print(cell.getStringCellValue() + "\t"); 
                  
              break;
              
            case NUMERIC: 
              
            System.out.print(cell.getNumericCellValue() + "\t"); 
               
              break;
               
            }
            
                }
                
                data.put(rowCnt, obj);
                rowCnt++;

                    
                     
                        
                    } 
                
                System.out.println(""); 
             
                
        		
		}
		
	
        catch (Exception e) { 
            e.printStackTrace(); 
        }
		
		
		
		
    
    

	}

}
