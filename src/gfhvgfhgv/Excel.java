package gfhvgfhgv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class Excel {
	String Account;
	String Opportunity;
	String OpportunityValue;
	String Practice_Unit;
	String Start_Date;
	String Service_Offering;
	String Close_Date;
	String End_Date;
	Excel(){
		Account="Ingram Micro Inc";
		Opportunity="New Opportunity";
		OpportunityValue="1200";
		Practice_Unit="ADM";
		Start_Date="5/12/2019";
		Service_Offering="ADMS";
		Close_Date="5/15/2019";
		End_Date="5/28/2019";
	}
	Excel(int i) throws IOException{
		File src=new File("C:\\Users\\10644602\\Desktop\\init.xlsx");
		FileInputStream fis=new FileInputStream(src);		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1= wb.getSheetAt(0);
		DataFormatter formatter = new DataFormatter();
		
		//Cell user = sh1.getRow(i).getCell(0);
		//String uname = formatter.formatCellValue(sh1.getRow(i).getCell(0));
		
		Account=formatter.formatCellValue(sh1.getRow(i).getCell(0));
		Opportunity=formatter.formatCellValue(sh1.getRow(i).getCell(1));
		OpportunityValue=formatter.formatCellValue(sh1.getRow(i).getCell(2));
		Practice_Unit=formatter.formatCellValue(sh1.getRow(i).getCell(3));
		Start_Date=formatter.formatCellValue(sh1.getRow(i).getCell(4));
		Service_Offering=formatter.formatCellValue(sh1.getRow(i).getCell(5));
		Close_Date=formatter.formatCellValue(sh1.getRow(i).getCell(6));
		End_Date=formatter.formatCellValue(sh1.getRow(i).getCell(7));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src=new File("C:\\Users\\10644602\\Desktop\\init.xlsx");
		FileInputStream fis=new FileInputStream(src);		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1= wb.getSheetAt(0);
		Iterator rows = sh1.rowIterator();
		Excel e= new Excel(1);
		int i=1;
		//Excel[] e1 = new Excel[sh1.getPhysicalNumberOfRows()-1];
		while(i<sh1.getPhysicalNumberOfRows()){
			System.out.println(i);
			
				Excel e1 = new Excel(i);
				e=e1;
			
			System.out.println("Success1"+" "+ e.Opportunity);
			i++;
		}
		DataFormatter formatter = new DataFormatter();
		Cell user = sh1.getRow(1).getCell(0);
		String uname = formatter.formatCellValue(sh1.getRow(1).getCell(0));
		System.out.println("Success"+" "+ e.Account);
	}

}
