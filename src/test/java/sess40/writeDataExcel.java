package sess40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeDataExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream file =new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\writeData.xlsx");
		//Create workbook
		XSSFWorkbook workbook =new XSSFWorkbook();
		//Create sheet
		XSSFSheet sheet=workbook.createSheet();
		//Create row
		XSSFRow row1=sheet.createRow(0);
		//Create cells and enter data in each cell
		row1.createCell(0).setCellValue("Welcome");
		row1.createCell(1).setCellValue("Java");
		row1.createCell(2).setCellValue(29);
		//Attach the workbook to file
		workbook.write(file);
		workbook.close();
		file.close();

	}

}
