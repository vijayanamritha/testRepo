package sess40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataDynamicallyToExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\dynamic.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Sheet1");
		//Enter number of rows dynamically
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows=sc.nextInt();
		//Enter number of cells dynamically
		System.out.println("Enter number of cells");
		int cells=sc.nextInt();
		 for(int r=0;r<=rows;r++)
		 {
			 XSSFRow currentRow=sheet.createRow(r);
			 for(int c=0;c<cells;c++)
			 {
				// System.out.println("Enter data");
				 currentRow.createCell(c).setCellValue(sc.next());
			 }
		 }
		 System.out.println("File is created");
		 workbook.close();
		 file.close();
		
		

	}

}
