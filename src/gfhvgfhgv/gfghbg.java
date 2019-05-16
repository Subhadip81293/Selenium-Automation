package gfhvgfhgv;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
import org.openqa.selenium.Keys;

public class gfghbg {
	
	public static void main(String[] args) throws IOException{
		   //Excell code
		   File src=new File("C:\\Users\\10644602\\Desktop\\Test.xlsx");
		   FileInputStream fis=new FileInputStream(src);		
		   XSSFWorkbook wb=new XSSFWorkbook(fis);
		   XSSFSheet sh1= wb.getSheetAt(0);
		   DataFormatter formatter = new DataFormatter();
		  
		
		    //Incognito
		    DesiredCapabilities capabilities = DesiredCapabilities.chrome(); 
	        ChromeOptions options = new ChromeOptions(); 
	        options.addArguments("--incognito");
	        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver(capabilities);
	        
	        //LTI
	        driver.get("https://iconnect.lntinfotech.com/sap/bc/ui5_ui5/ui2/ushell/shells/abap/FioriLaunchpad.html#ZTCC_SEM-display");
	      
	        //Wait
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	        
	        //UserName
	        Cell user = sh1.getRow(0).getCell(1);
			String uname = formatter.formatCellValue(user);
	        driver.findElement(By.id("i0116")).sendKeys(uname);
	        driver.findElement(By.id("idSIButton9")).click(); 
	        
	        //Password
	        Cell pwd = sh1.getRow(1).getCell(1);
			String password = formatter.formatCellValue(pwd);
	        driver.findElement(By.id("passwordInput")).sendKeys(password);
	        driver.findElement(By.id("submitButton")).click();
	        driver.findElement(By.id("idSIButton9")).click();
	      
	        System.out.println(driver.getTitle());
	       
	        
	        //Timesheet
	        driver.findElement(By.id("__tile11-title-inner")).click();
	        System.out.println(driver.getTitle());
	       
	        
	        try{
	        	
	        //sleep
	        Thread.sleep(10);
	        
	        //maximize window
	        driver.manage().window().maximize();
	        
	        //tab switch
	        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));
            
            //Wait
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	        System.out.println(driver.getTitle());	       	 
	        
	        //Finding iframe
	    	List<WebElement> elements = driver.findElements(By.tagName("iframe"));
	    	int numberOfTags = elements.size();
	    	System.out.println("No. of Iframes on this Web Page are: " +numberOfTags);
	    	
		   	//Close button		 
	    	driver.findElement(By.xpath("//*[@id='cancelBtn-content']")).click();
        	
	    	
	        //frame switch
	        driver.switchTo().frame("application-ZTCC_SEM-display"); //switching the frame by ID
			System.out.println("********We are switch to the iframe*******");
			
			 //No. of frame
			 List<WebElement> lements = driver.findElements(By.tagName("iframe"));
		     int umberOfTags = lements.size();
		     System.out.println("No. of Iframes on this Web Page are: " +umberOfTags);
		     System.out.println(driver.getTitle());
		     
		     //frame switch
			 driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='ITSFRAME1']")));
			 System.out.println("********We are switch to the iframe*******");
			 System.out.println(driver.getTitle());
			 
			 //Contract 
			 Cell cell = sh1.getRow(3).getCell(0);
			 String name = formatter.formatCellValue(cell);
			 driver.findElement(By.xpath("//*[@id='M0:46:::1:20']")).sendKeys(name); 
			  
			 //date
			 Cell sdate = sh1.getRow(3).getCell(1);
			 String sdate1 = formatter.formatCellValue(sdate);
			 driver.findElement(By.xpath("//*[@id='M0:46:::4:20']")).sendKeys(sdate1);
			 Cell edate = sh1.getRow(3).getCell(2);
			 String edate1 = formatter.formatCellValue(edate);
			  driver.findElement(By.xpath("//*[@id='M0:46:::4:36']")).sendKeys(edate1);
			
	          //enter
			  Actions action = new Actions(driver); 
		      action.sendKeys(Keys.CONTROL,Keys.TAB).build().perform();
		   	  Robot robot = new Robot();	
		   	  robot.keyPress(KeyEvent.VK_ENTER);
		   	  robot.keyRelease(KeyEvent.VK_ENTER);
		   	  Thread.sleep(10);
		        	
		       //Wait
		  	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  	      WebElement input=driver.findElement(By.xpath("//table/tbody/tr/td//*[@id='M0:37::btn[14]']"));
		  	      
			      action.doubleClick(input).build().perform();
			      driver.findElement(By.xpath("//table/tbody/tr/td//*[@id='M0:37::btn[14]']")).click();
			      Thread.sleep(10);
			      System.out.println("********waiting*******");
			      //Wait
		  	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  	    System.out.println("********waited*******");
			    //*[@id='M0:46:2::0:4-focus']  
		        	//timesheet
		       	    //frame switch
		        	driver.switchTo().frame("application-ZTCC_SEM-display"); //switching the frame by ID
		 		   	System.out.println("********We are switch to the iframe*******");	
		 		   	
		 		   	//No. of frames
		 	    	 List<WebElement> elements1 = driver.findElements(By.tagName("iframe"));
		 		  	int Tags = elements1.size();
		 	    	System.out.println("No. of Iframes on this Web Page are: " +Tags);
		 	    	
		 	    	//frame switch
		 			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='ITSFRAME1']")));
		    		 System.out.println(driver.getTitle());	
		 	   		System.out.println("********We are switch to the iframe*******");
		 	   		
		 	   		//select past accurals ....................................................................
		 	   	driver.findElement(By.xpath("//*[@id='M0:46:2::0:4-focus']")).click();
		 	   	List<WebElement> elements2 = driver.findElements(By.xpath("//table/tbody/tr/td[@class='urSTSC urST3TDSc urNoUserSelect urST5L']"));
	 		  	int Tag = elements2.size();
	 	    	System.out.println("No. of Iframes on this Web Page are: " +Tag);
		 			driver.findElement(By.xpath("//table/tbody/tr/td[@class='urSTSC urST3TDSc urNoUserSelect urST5L']")).click();
		 			driver.findElement(By.className("urSTSC urST3TDSc urNoUserSelect urST5L")).click();
	 			
		        	Thread.sleep(10);
       

	 }

	catch(Exception e){
	 
	 // Do whatever you wish to do here
	 
	 // Now throw the exception back to the system
	
    	System.out.println(e);
	
}
}
}