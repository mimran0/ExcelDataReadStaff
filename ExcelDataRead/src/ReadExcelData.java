/**
 * 
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 * @author imran
 *
 */
public class ReadExcelData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReadExcelData ReadExcelData=new ReadExcelData();
		String vOutput=ReadExcelData.ReadCellData(6, 2);
		System.out.println(vOutput);

	}
	
	    //Developed by Imran on 10/11/2017
		//This function/method will return specific Excel Cell data using row number and column number
		//Input: Row Number, Column Number
		//Output: Specific cell value
		//Drawback: Excel FilePath is hard Coded. 
		public  String ReadCellData(int vRow, int vColumn){
			String Result=null;
			Workbook wb = null;
			try {
				FileInputStream fis = new FileInputStream("C:\\Users\\imran\\workspace_Test\\MyExcel.xlsx");
				wb = new XSSFWorkbook(fis);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			Sheet sheet = wb.getSheetAt(0);	
			Row row = sheet.getRow(vRow);    
			Cell cell = row.getCell(vColumn); 				
			switch (cell.getCellType()) {
			case Cell.CELL_TYPE_STRING:
				// System.out.print(cell.getStringCellValue());
				Result = cell.getStringCellValue();
				break;
		    case Cell.CELL_TYPE_BOOLEAN:	    
		    	boolean ab=cell.getBooleanCellValue();	    	
		    	Result=Boolean.toString(ab);
			    //System.out.print(cell.getBooleanCellValue());
			     break;
			case Cell.CELL_TYPE_NUMERIC:
				// System.out.print(cell.getNumericCellValue());
				double a = cell.getNumericCellValue();
				Result = Double.toString(a);
				break;		
			}	
			return Result;
		}

}
