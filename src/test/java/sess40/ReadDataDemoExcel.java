package sess40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataDemoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Read data from excel sheet
		//Open file in the location in read mode
		FileInputStream file =new FileInputStream(System.getProperty("user.dir") + "\\testdata\\data.xlsx");
		//Acess workbook
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		//Acess sheet from workbook
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		//Get the total num of row to use in loop
		int rows=sheet.getLastRowNum();
		System.out.println(rows);
		//Get the total num of cells in each row
		int cells=sheet.getRow(1).getLastCellNum();
		System.out.println(cells);
		//for loop to iterate through rows
		for(int r=0;r<=rows;r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
			//For loop to read data from each cell in a row
			for(int c=0;c<cells;c++)
			{
				XSSFCell datacell=currentRow.getCell(c);
				//get the data from the cell
				System.out.print(datacell.toString());
				System.out.print("\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
		
		

	}

}
