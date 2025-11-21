package sess41;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	//static variables
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;
	
	//Method1 - returns row count
	public static int getRowCount(String xlfile, String xlsheet) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		int rowCount=ws.getLastRowNum();
		fi.close();
		wb.close();
		return rowCount;		
	}
	
	//Method 2-returns total cell count
	public static int getCellCount(String xlfile, String xlsheet, int rownum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook (fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		int cellnum=row.getLastCellNum();
		wb.close();
		fi.close();
		return cellnum;					
	}
	//Method 3 - get cell data
	public static String getCellData(String xlfile, String xlsheet,int rownum,int cellnum) throws IOException
	{
	fi=new FileInputStream(xlfile);
	wb=new XSSFWorkbook(fi);
	ws=wb.getSheet(xlsheet);
	row=ws.getRow(rownum);
	cell=row.getCell(cellnum);
	//Read data from cell
	//1.Approach 1 using toString() method
	String data;
	try
	{
	//data=cell.toString();
		DataFormatter formater=new DataFormatter();
		data=formater.formatCellValue(cell);
	}
	catch(Exception e)
	{
		data="";
	}
	wb.close();
	fi.close();
	return data;
	}
	//Method 4--write results back to excel sheet
	public static void setCellData(String xlfile, String xlsheet,int rownum,int cellnum,String data) throws IOException 
	{
	fi=new FileInputStream(xlfile);
	wb=new XSSFWorkbook(fi);
	ws=wb.getSheet(xlsheet);
	row=ws.getRow(rownum);
	cell=row.createCell(cellnum);
	cell.setCellValue(data);
	fo=new FileOutputStream(xlfile);
	wb.write(fo);
	wb.close();
	fo.close();
	fi.close();
	}
	
	//Method 5--styling green colour for test result
	public static void fillGreenColor(String xlfile,String xlsheet, int rownum, int cellnum) throws IOException
	{
style=wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND); 
				
		cell.setCellStyle(style);
		fo=new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}
	public static void fillRedColor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
		
		style=wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
		
		cell.setCellStyle(style);		
		fo=new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}
	}
	
	
	
	

