package gfhvgfhgv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class incog {
	public static void main(String[] args) throws IOException{
		 DesiredCapabilities capabilities = DesiredCapabilities.chrome(); 
		 
	        ChromeOptions options = new ChromeOptions();
	        
	        options.addArguments("--incognito");
	        
	        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	        
	        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	        
	        WebDriver driver = new ChromeDriver(capabilities);
		//Excell code
		   File src=new File("C:\\Users\\10644602\\Desktop\\Test.xlsx");

		   FileInputStream fis=new FileInputStream(src);
	
		   XSSFWorkbook wb=new XSSFWorkbook(fis);

		   XSSFSheet sh1= wb.getSheetAt(0);
		   driver.findElement(By.id("passwordInput")).sendKeys("sh1.getRow(0).getCell(0).getStringCellValue()");
	
		   System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
		
  		   System.out.println("*********We are done***************");
}
}
