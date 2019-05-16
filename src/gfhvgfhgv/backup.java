package gfhvgfhgv;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.jna.platform.FileUtils;

public class backup {
	
	static public void robofunc(String s) throws AWTException{
		Robot r = new Robot();
		//r.mouseMove(263,415);
		r.delay(2000);
		char[] s1=s.toUpperCase().toCharArray();
		for(char c:s1){
			if(c=='A')
				{r.keyPress(KeyEvent.VK_A);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_A);}
			else if(c=='B')
				{r.keyPress(KeyEvent.VK_B);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_B);}
			else if(c=='C')
				{r.keyPress(KeyEvent.VK_C);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_C);}
			else if(c=='D')
				{r.keyPress(KeyEvent.VK_D);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_D);}
			else if(c=='E')
				{r.keyPress(KeyEvent.VK_E);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_E);}
			else if(c=='F')
				{r.keyPress(KeyEvent.VK_F);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_F);}
			else if(c=='G')
				{r.keyPress(KeyEvent.VK_G);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_G);}
			else if(c=='H')
				{r.keyPress(KeyEvent.VK_H);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_H);}
			else if(c=='I')
				{r.keyPress(KeyEvent.VK_I);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_I);}
			else if(c=='J')
				{r.keyPress(KeyEvent.VK_J);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_J);}
			else if(c=='K')
				{r.keyPress(KeyEvent.VK_K);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_K);}
			else if(c=='L')
				{r.keyPress(KeyEvent.VK_L);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_L);}
			else if(c=='M')
				{r.keyPress(KeyEvent.VK_M);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_M);}
			else if(c=='N')
				{r.keyPress(KeyEvent.VK_N);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_N);}
			else if(c=='O')
				{r.keyPress(KeyEvent.VK_O);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_O);}
			else if(c=='P')
				{r.keyPress(KeyEvent.VK_P);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_P);}
			else if(c=='Q')
				{r.keyPress(KeyEvent.VK_Q);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_Q);}
			else if(c=='R')
				{r.keyPress(KeyEvent.VK_R);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_R);}
			else if(c=='S')
				{r.keyPress(KeyEvent.VK_S);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_S);}
			else if(c=='T')
				{r.keyPress(KeyEvent.VK_T);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_T);}
			else if(c=='U')
				{r.keyPress(KeyEvent.VK_U);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_U);}
			else if(c=='V')
				{r.keyPress(KeyEvent.VK_V);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_V);}
			else if(c=='W')
				{r.keyPress(KeyEvent.VK_W);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_W);}
			else if(c=='X')
				{r.keyPress(KeyEvent.VK_X);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_X);}
			else if(c=='Y')
				{r.keyPress(KeyEvent.VK_Y);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_Y);}
			else if(c=='Z')
				{r.keyPress(KeyEvent.VK_Z);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_Z);}
			else if(c=='0')
				{r.keyPress(KeyEvent.VK_0);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_0);}
			else if(c=='1')
				{r.keyPress(KeyEvent.VK_1);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_1);}
			else if(c=='2')
				{r.keyPress(KeyEvent.VK_2);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_2);}
			else if(c=='3')
				{r.keyPress(KeyEvent.VK_3);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_3);}
			else if(c=='4')
				{r.keyPress(KeyEvent.VK_4);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_4);}
			else if(c=='5')
				{r.keyPress(KeyEvent.VK_5);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_5);}
			else if(c=='6')
				{r.keyPress(KeyEvent.VK_6);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_6);}
			else if(c=='7')
				{r.keyPress(KeyEvent.VK_7);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_7);}
			else if(c=='8')
				{r.keyPress(KeyEvent.VK_8);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_8);}
			else if(c=='9')
				{r.keyPress(KeyEvent.VK_9);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_9);
				}
			else if(c==' '){
				r.keyPress(KeyEvent.VK_SPACE);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_SPACE);
			}
			else if(c=='/'){
				r.keyPress(KeyEvent.VK_SLASH);
				r.delay(1000);
				r.keyRelease(KeyEvent.VK_SLASH);
			}
				
		}
	}
	public static void pressTab(int num) throws AWTException{
		Robot r = new Robot();
		while(num>0){
		r.keyPress(KeyEvent.VK_TAB);
		r.delay(1000);
		r.keyRelease(KeyEvent.VK_TAB);
		num--;
		}
	}
	public static void pressEnter(int num) throws AWTException{
		Robot r = new Robot();
		while(num>0){
		r.keyPress(KeyEvent.VK_ENTER);
		r.delay(1000);
		r.keyRelease(KeyEvent.VK_ENTER);
		num--;
		}
	}
	public static void main(String[] args) throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\10644602\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://lntinfotech.crm5.dynamics.com/");
		driver.manage().window().maximize();
		String emailid="";
		driver.findElement(By.id("i0116")).sendKeys(emailid);
		driver.findElement(By.id("idSIButton9")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get(driver.getCurrentUrl());
		//driver.manage().window().maximize();
            String password = "";
    		driver.findElement(By.id("passwordInput")).sendKeys(password);
    		driver.findElement(By.id("submitButton")).click();
    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElement(By.id("idBtn_Back")).click();
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	driver.findElement(By.xpath("//*[@id='TabSFA']")).click();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	driver.findElement(By.xpath("//*[@id='nav_oppts']/span[2]")).click();
    	
    	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    	
    	
    	try{
    		driver.findElement(By.xpath("//*[@id='opportunity|NoRelationship|HomePageGrid|Mscrm.HomepageGrid.opportunity.NewRecord']/span")).click();
    	}
    	catch(Exception e){
    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		WebElement element = driver.findElement(By.xpath("//*[@id='opportunity|NoRelationship|HomePageGrid|Mscrm.HomepageGrid.opportunity.NewRecord']/span"));
        	Actions action = new Actions(driver);
        	action.moveToElement(element).click().perform();
    		driver.findElement(By.xpath("//*[@id='opportunity|NoRelationship|HomePageGrid|Mscrm.HomepageGrid.opportunity.NewRecord']/span")).click();
    	}
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	
    	/*WebElement element = driver.findElement(By.xpath("//*[@id='parentaccountid']/div[1]"));

        Actions action = new Actions(driver);
       //*[@id='parentaccountid_d']
        action.moveToElement(element).perform();
        action.click();*/
  /*  	Actions actions = new Actions(driver);
    	WebElement menu = driver.findElement(By.xpath("//*[@id='Account_label']"));
    	actions.moveToElement(menu);

    	WebElement subMenu = driver.findElement(By.xpath("//*[@id='parentaccountid_ledit']"));
    	actions.moveToElement(subMenu);
    	actions.click().build().perform();
    	//*[@id="parentaccountid_ledit"]
*/
        //action.click();
      
        //action.perform();
    	/*try{
    	String Account="Ingram Micro Inc";
    	//driver.findElement(By.xpath("//*[@id='parentaccountid_ledit']")).sendKeys(Account);
    	//driver.findElement(By.xpath("//*[@id='header_ownerid_lookupSearch']")).click();
    	//*[@id='header_ownerid_lookupSearch']
    	Actions action = new Actions(driver);
    	action.moveToElement(driver.findElement(By.xpath("//*[@id='lnt_opportunityname_cl']"))).build().perform();
    	//*[@id='lnt_opportunityname_cl']
    	}
    	catch(Exception e){System.out.println(e);}
    	try{
    	String Date="Das";
    	Actions action = new Actions(driver);
    	action.moveToElement(driver.findElement(By.xpath("//*[@id='lnt_opportunityname_d']"))).build().perform();
    	//*[@id="lnt_opportunityname"]
    	
    	//driver.findElement(By.xpath("//*[@id='lnt_opportunityname_i']")).sendKeys(Date);
    	}
    	catch(Exception e){System.out.println(e);}*/
    	try{
    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    		//WebDriverWait wait = new WebDriverWait(driver,20);
    		//wait.until(ExpectedConditions.elementToBeClickable(lastElementToLoad));
    		//String Account="Ingram Micro Inc";
    		Robot r = new Robot();
    		//r.mouseMove(263,415);
    		r.delay(2000);
    		//r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    		//r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    		try{
    			String Account="Ingram Micro Inc";
    			robofunc(Account);
    			r.delay(2000);
    			
    			pressEnter(1);
    			r.delay(2000);
    			pressEnter(1);
    			
        		pressTab(1);
        		
        		pressEnter(1);
        		
        		String Opportuinity="New Opportunity";
        		robofunc(Opportuinity);
        		r.delay(2000);
        		
        		//pressEnter(1);
    			
        		pressTab(1);
        		
        		r.keyPress(KeyEvent.VK_DOWN);
        		r.delay(1000);
        		
        		
        		
        		
        		r.keyRelease(KeyEvent.VK_DOWN);
        		
        		pressEnter(2);
        		
        		pressTab(1);
        		
        		pressEnter(1);	
        		
        		String OpportunityValue="1200";
        		robofunc(OpportunityValue);
        		r.delay(2000);
        		
        		pressEnter(1);
        		
        		pressTab(3);
        		
        		//pRACTICE uNIT
        		String Practice_Unit="ADM";
        		robofunc(Practice_Unit);
        		
        		pressEnter(1);
        		r.delay(2000);
        		pressEnter(1);
        		
        		pressTab(1);
        		
        		String Start_Date="5/12/2019";
        		robofunc(Start_Date);
        		
        		pressTab(2);
        		
        		String Service_Offering="ADMS";
    			robofunc(Service_Offering);
    			
    			pressEnter(1);
    			r.delay(2000);
    			pressEnter(1);
        		
    			pressTab(4);
        		
    			pressEnter(1);
    			
        		String Close_Date="5/15/2019";
        		robofunc(Close_Date);
        		
        		pressTab(2);
        		
        		r.keyPress(KeyEvent.VK_DOWN);
        		r.delay(1000);
        		r.keyRelease(KeyEvent.VK_DOWN);
        		
        		pressEnter(1);
        		
        		pressTab(3);
        		
        		String End_Date="5/28/2019";
        		robofunc(End_Date);
        		
        		pressTab(3);
        		
        		
    			/*r.keyPress(KeyEvent.VK_I);
    			r.keyPress(KeyEvent.VK_N);
    			r.keyPress(KeyEvent.VK_G);
    			r.keyPress(KeyEvent.VK_R);
    			r.keyPress(KeyEvent.VK_A);
    			r.keyPress(KeyEvent.VK_M);
    			r.keyPress(KeyEvent.VK_SPACE);
    			
    			r.keyPress(KeyEvent.VK_M);
    			r.keyPress(KeyEvent.VK_I);
    			r.keyPress(KeyEvent.VK_C);
    			r.keyPress(KeyEvent.VK_R);
    			r.keyPress(KeyEvent.VK_O);
    			r.keyPress(KeyEvent.VK_SPACE);
    			
    			r.keyPress(KeyEvent.VK_I);
    			r.keyPress(KeyEvent.VK_N);
    			r.keyPress(KeyEvent.VK_C);
    			
    			//r.delay(1000);
    			
    			r.keyRelease(KeyEvent.VK_I);
    			r.keyRelease(KeyEvent.VK_N);
    			r.keyRelease(KeyEvent.VK_G);
    			r.keyRelease(KeyEvent.VK_R);
    			r.keyRelease(KeyEvent.VK_A);
    			r.keyRelease(KeyEvent.VK_M);
    			r.keyRelease(KeyEvent.VK_SPACE);
    			
    			r.keyRelease(KeyEvent.VK_M);
    			r.keyRelease(KeyEvent.VK_I);
    			r.keyRelease(KeyEvent.VK_C);
    			r.keyRelease(KeyEvent.VK_R);
    			r.keyRelease(KeyEvent.VK_O);
    			r.keyRelease(KeyEvent.VK_SPACE);
    			
    			r.keyRelease(KeyEvent.VK_I);
    			r.keyRelease(KeyEvent.VK_N);
    			r.keyRelease(KeyEvent.VK_C);
    			r.delay(200);
    			
    			r.keyPress(KeyEvent.VK_ENTER);
        		r.delay(2000);
        		r.keyPress(KeyEvent.VK_ENTER);
    			
        		r.keyPress(KeyEvent.VK_TAB);
        		r.delay(1000);
        		r.keyRelease(KeyEvent.VK_TAB);
        		
        		r.keyPress(KeyEvent.VK_ENTER);
        		r.delay(1000);
        		r.keyRelease(KeyEvent.VK_ENTER);
        		//*[@id="lnt_opportunityname_i"]
        		
    			String o_name="New Opportunity";
    			driver.findElement(By.xpath("//*[@id='lnt_opportunityname_i']")).sendKeys(o_name);*/
    		}
    		
    		finally{
    		
    		}
    		//r.delay(1500);
    		
    		//r.keyPress(KeyEvent.VK_ENTER);
    		
    	}
    	catch(Exception e){
    		System.out.println("Error 3"+" "+ e);
    	}
    	/*try{
    		String Account="Ingram Micro Inc";
        	driver.findElement(By.xpath("//*[@id='lnt_opportunityname_i']")).sendKeys(Account);
    	}
    	catch(Exception e){
    		System.out.println("Error 4"
    				+ ""+" "+ e);
    	}*/
		System.out.println("Success");
		//passwordInput
	//Excell code
		  /* File src=new File("C:\\Users\\10644602\\Desktop\\fp.xlsx");
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
        
        //milestone
        driver.findElement(By.xpath("//*[@id='__tile14']/div[3]")).click();
        //Wait
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        
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
        	
    	
          //Switching iframe
    	  driver.switchTo().frame("application-ZVF01N-display"); //switching the frame by ID
		  System.out.println("********We are switch to the iframe*******");		
		  
		  //Finding iframe
		  List<WebElement> elements1 = driver.findElements(By.tagName("iframe"));
		  int numberOfTags1 = elements1.size();
		  System.out.println("No. of Iframes on this Web Page are: " +numberOfTags1);
		  System.out.println(driver.getTitle());
		  
		  //Switching iframe
		  driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='ITSFRAME1']")));
		  System.out.println("********We are switch to the iframe*******");
		  System.out.println(driver.getTitle());
			  
		  //Contract value
		  Cell iNumber = sh1.getRow(3).getCell(0);
		  String contract = formatter.formatCellValue(iNumber);
		  driver.findElement(By.xpath("//*[@id='M0:46:::1:17']")).sendKeys(contract);
		  
		  //Enter Action
	      Actions action = new Actions(driver); 
	      action.sendKeys(Keys.CONTROL,Keys.TAB).build().perform();
	      Robot robot = new Robot();
	      robot.keyPress(KeyEvent.VK_ENTER);
	      robot.keyRelease(KeyEvent.VK_ENTER);
	      
	      //Wait
          driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	      
	      
	      //item
	      driver.findElement(By.xpath("//*[@id='M0:46:::2:17']")).click();
	      //driver.findElement(By.xpath("//*[@id='M0:46:::2:17']")).click();	      
	       driver.findElement(By.xpath("//*[@id='M0:46:::2:17']")).sendKeys("10");
	      driver.findElement(By.xpath("//*[@id='M0:46:::2:17']")).sendKeys("10");
	      
	      //Enter Action
	      robot.keyPress(KeyEvent.VK_ENTER);
	      robot.keyRelease(KeyEvent.VK_ENTER);
	      driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	    //Wait
          driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	      WebElement milestoneSearch=driver.findElement(By.xpath("//*[@id='M0:46:::3:17']"));
	  	  action.doubleClick(milestoneSearch).build().perform();
	  	      
	  	  //WebElement input=driver.findElement(By.xpath(" //*[@id='ls-inputfieldhelpbutton']"));
	  	  //action.doubleClick(input).build().perform();
	      //milestone	      
	      
	      driver.findElement(By.xpath("//*[@id='ls-inputfieldhelpbutton']")).click();
	      System.out.println("1");
	      driver.findElement(By.xpath("//*[@id='M0:46:::3:17']")).click();
	      driver.findElement(By.xpath("//*[@id='ls-inputfieldhelpbutton']")).click();
	      System.out.println("1");
	      driver.findElement(By.xpath("//*[@id='M0:46:::3:17']")).click();
	      driver.findElement(By.xpath("//*[@id='ls-inputfieldhelpbutton']")).click();
	      System.out.println("1");
	      driver.findElement(By.xpath("//*[@id='M0:46:::3:17']")).click();
	      driver.findElement(By.xpath("//*[@id='ls-inputfieldhelpbutton']")).click();
	      System.out.println("1");
	      
	      driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='URLSPW-0']")));
		  System.out.println("********We are switch to the iframe*******");
	    
		  //Milestone
	      Cell month = sh1.getRow(3).getCell(1);
		  String month1 = formatter.formatCellValue(month);		  
		  WebElement monthSelect=driver.findElement(By.xpath("//*[@id='cnt1_17_3']/div"));
	  	  action.doubleClick(monthSelect).build().perform();
	     	action.doubleClick(monthSelect).build().perform();
	     	
	     	//create
	      WebElement create=driver.findElement(By.xpath("//*[@id='Cua2ApplicationToolbar']/table/tbody/tr/td/div/*[@id='M0:37::btn[25]-r']/div"));
		  action.doubleClick(create).build().perform();
	      action.doubleClick(create).build().perform();
	     
        }
        catch(Exception e){
       	 
       	
           	System.out.println(e);
        }*/
    	
	}
	/*public static void captureScreenShot(WebDriver ldriver){
		// Take screenshot and store as a file format             
		 File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);           
		try {
		// now copy the  screenshot to desired location using copyFile method
		 
		FileUtils.copyFile(src, new File("D://selenium//"
				+ ""+System.currentTimeMillis()+".png"));                              } catch (IOException e)
		 
		{
		  System.out.println(e.getMessage()) ;
		 }
		  }
		 */
}

