package Comprehensive.Comprehensive_assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class One_exceldatareading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			//String path = "C:\\Users\\SVATHULURI\\Downloads\\Vathuluri Subramanyam.xlsx";
			FileInputStream fs = new FileInputStream(new File ("C:\\Users\\SVATHULURI\\Downloads\\Vathuluri Subramanyam.xlsx"));
			Workbook wb = new XSSFWorkbook(fs);
			Sheet sheet1 = wb.getSheetAt(0);
			
			for (Row row : sheet1) {
				for (Cell cell : row) {
					switch (cell.getCellType()) {
					case STRING:
						System.out.print(cell.getStringCellValue()+ "\t\t");
						break;
					case NUMERIC:
						System.out.print(cell.getNumericCellValue()+ "\t\t");
						break;
					default:
						System.out.print("\t\t");
						break;
						
					}
					
				}
				System.out.println();
			}
			wb.close();
			fs.close();
		}
		catch (IOException e) {
				e.printStackTrace();
			}
	}
	


	


	}


