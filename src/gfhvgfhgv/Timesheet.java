package gfhvgfhgv;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.print.Printable;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;
 
public class Timesheet {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException{
		
	    //Incognito
	    DesiredCapabilities capabilities = DesiredCapabilities.chrome(); 
        ChromeOptions options = new ChromeOptions(); 
        options.addArguments("--incognito");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(capabilities);
        
        
   
        //LTI
        driver.get("https://iconnect.lntinfotech.com/sap/bc/ui5_ui5/ui2/ushell/shells/abap/FioriLaunchpad.html#ZTCC_SEM-display");
        driver.manage().window().maximize();
        
        //Wait
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        
        //UserName
        driver.findElement(By.id("i0116")).sendKeys("Madhan.Solaimuthu@lntinfotech.com");
        driver.findElement(By.id("idSIButton9")).click(); 
       
        //Password
        driver.findElement(By.id("passwordInput")).sendKeys("Jan_mks2019");
        driver.findElement(By.id("submitButton")).click();
        driver.findElement(By.id("idSIButton9")).click();
        Thread.sleep(10);
              
        
        Actions action = new Actions(driver); 
        action.sendKeys(Keys.ENTER).build().perform();
         //Timesheet
        driver.findElement(By.id("__tile11-title-inner")).click();
        
        System.out.print("home page"+driver.getTitle());
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        action.sendKeys(Keys.ENTER).build().perform();
        Robot robot=new Robot();
        Thread.sleep(10);
    	robot.keyPress(KeyEvent.VK_CONTROL);
    	String spgTitle= driver.getTitle();
    	robot.keyPress(KeyEvent.VK_TAB);
    	robot.keyRelease(KeyEvent.VK_TAB);
    	robot.keyPress(KeyEvent.VK_TAB);
    	robot.keyRelease(KeyEvent.VK_TAB);
    	robot.keyRelease(KeyEvent.VK_CONTROL);
       /* Actions action = new Actions(driver); 
        action.sendKeys(Keys.CONTROL,Keys.TAB).build().perform();*/
        //action.sendKeys(Keys.CONTROL+"w").build().perform();
       // driver.findElement(By.xpath("//*[@id='cancelBtn']")).click();
        
        	driver.findElement(By.xpath("//*[@id='cancelBtn']")).click();
        	Thread.sleep(10);
        	System.out.println("seconmd page"+driver.getTitle());
        List<WebElement> elements = driver.findElements(By.tagName("iframe"));
    	int numberOfTags = elements.size();
    	System.out.println("No. of Iframes on this Web Page are: " +numberOfTags);
    	
    	
    	//driver.switchTo().defaultContent();
		System.out.println("********We are switch to the iframe*******");
		
		driver.findElement(By.xpath("//*[@id='M0:46:::1:20']")).sendKeys("2019");
        driver.findElement(By.xpath("//*[@id='cancelBtn']")).click();
      
        
        
      //*[@id="cancelBtn-content"]
        
        	
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //action.moveToElement(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
        //action.sendKeys(Contr)
        
        //driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//*[@id='cancelBtn-content']")).click();
        driver.findElement(By.xpath("//*[@id='cancelBtn']")).click();
        System.out.print(driver.getTitle());
      //*[@id='cancelBtn-content']
        //try
        
        	//*[@id="M0:46:::1:20"]
        	 
        	try{
        	 //driver.switchTo().defaultContent();
        	System.out.println(driver.getTitle());
	    	 String title=driver.findElement(By.xpath("//*[@id='lblPersonas_152233274112043-text']")).getText();
	    	 System.out.println(title);
	    	 List<WebElement> lstdivs=driver.findElements(By.tagName("div"));
        	 System.out.println("div tags"+lstdivs.size());
        	 driver.switchTo().defaultContent();
        	 System.out.println(driver.getTitle());
        	 List<WebElement> listIFrames=driver.findElements(By.tagName("iframe"));
        	 System.out.println("iFrame tags"+listIFrames.size());
        	 List<WebElement> ListFrames=driver.findElements(By.tagName("frame"));
        	 System.out.println("ListFrames tags"+ListFrames.size());
        	 
        	 driver.close();
	    	 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[1]")));
	    	 driver.switchTo().frame(driver.findElement(By.xpath("//form[@id='ITSFREEFORM']/following::iframe[1]")));
        	 System.out.println("frame selected 0");
        	//driver.findElement(By.xpath("//*[@id='M0:46:::1:20-r']")).sendKeys("xxyy");
        	 try{
        		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='ITSFRAME1']")));
        		 System.out.println("frame selected");
        	 }
        	  
    		 catch(Exception e){
        	 
        		 e.printStackTrace();
        		 System.out.println("failed");
        	 }
        	 
        	 //driver.findElement(By.xpath("//iframe[@id='application-ZTCC_SEM-display']")).click();
        	 driver.findElement(By.xpath("//*[@id='M0:46']")).sendKeys("xxyy");
             //driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='M0:46']")));
        	 System.out.println("We are switch to the iframe*******");
             driver.findElement(By.xpath("//*[@id='M0:46:::1:20']")).sendKeys("2019");
        	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      
             driver.findElement(By.xpath("//*[@id='cancelBtn-content']")).click();

              driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='ITSFRAME1]")));
         	 System.out.println("********We are switch to the iframe*******");
       ////*[@id="cancelBtn-content"]
        

       
      //Excell code
		   File src=new File("C:\\Users\\10644602\\Desktop\\Test.xlsx");
		   FileInputStream fis=new FileInputStream(src);		
		   XSSFWorkbook wb=new XSSFWorkbook(fis);
		   XSSFSheet sh1= wb.getSheetAt(0);
		   String Contract;
		   Contract=sh1.getRow(0).getCell(0).getStringCellValue();      
           driver.get("https://ltis4pasprod.lntinfotech.com:8100/sap/bc/gui/sap/its/webgui?~transaction=ZTSC&amp;~nosplash=1&amp"); 
           System.out.println(driver.getTitle());   
           driver.findElement(By.id("cancelBtn-content")).click();
        

       }

catch(Exception e){
      //throw(e);

}
}
}
