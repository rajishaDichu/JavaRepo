package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode 
{
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	public static String getStringData(int a,int b) throws IOException//a ,b are rows and columns
	{
		f=new FileInputStream("C:\\Documents\\Book1.xlsx");//to access the file from the given location
		w=new XSSFWorkbook(f);//to access the particular workbook in from the file
		sh=w.getSheet("Sheet1");//to access the particular sheet from the workbook
		XSSFRow r=sh.getRow(a);//get the row value from sheet
		XSSFCell c=r.getCell(b);//get cell from sheet
		return c.getStringCellValue();//to retreive string value from a cell
		
	}
	public static String getIntegerData(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Documents\\Book1.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
		XSSFRow r=sh.getRow(a);
		XSSFCell c=r.getCell(b);
		int x= (int) c.getNumericCellValue();//type casting :from default double value  to int
		return String.valueOf(x);
		
	}
}
