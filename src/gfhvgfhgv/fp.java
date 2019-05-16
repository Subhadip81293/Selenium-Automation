package gfhvgfhgv;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
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

class Value {
	String Account;
	String Opportunity;
	String OpportunityValue;
	String Practice_Unit;
	String Start_Date;
	String Service_Offering;
	String Close_Date;
	String End_Date;
	String Username;
	String Password;
	Value(){
		Account="Ingram Micro Inc";
		Opportunity="New Opportunity";
		OpportunityValue="1200";
		Practice_Unit="ADM";
		Start_Date="5/12/2019";
		Service_Offering="ADMS";
		Close_Date="5/15/2019";
		End_Date="5/28/2019";
	}
	Value(int i) throws IOException{
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
		Username=formatter.formatCellValue(sh1.getRow(i).getCell(8));
		Password=formatter.formatCellValue(sh1.getRow(i).getCell(9));
	}
	Value(String[] ar){
		Account = ar[0];
		Opportunity = ar[1];
		OpportunityValue = ar[2];
		Practice_Unit = ar[3];
		Start_Date = ar[4];
		Service_Offering = ar[5];
		Close_Date = ar[6];
		End_Date = ar[7];
	}

	
	
}
	public class fp{
		static public String[] getData(){
			System.out.println("Enter the details");
			Scanner sc = new Scanner(System.in);
			String[] ar = new String[8];
			for(int i=0;i<8;i++){
				ar[i]=sc.nextLine();
			}
			return ar;
			
		}
		static public boolean checkDate(String s1,String s2){
			System.out.println("Checking dates "+s1+" and "+s2);
			String[] ar1 = s1.split("/");
			String[] ar2 = s2.split("/");
			if(ar2[2].compareTo(ar1[2])<0)
				return false;
			if(ar2[0].compareTo(ar1[0])<0)
				return false;
			if(ar2[1].compareTo(ar1[1])<=0)
				return false;
			
			return true;	
		}
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
		Scanner sc = new Scanner(System.in);
		
		/*Value v = new Value();
		
		System.out.println("Do you want to enter data?");
		int val=sc.nextInt();
		if(val==1)
		{
			String[] ar = getData();
			Value v1 = new Value(ar);
			v=v1;
		}
		*/
		File src=new File("C:\\Users\\10644602\\Desktop\\init.xlsx");
		FileInputStream fis=new FileInputStream(src);		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1= wb.getSheetAt(0);
		Iterator rows = sh1.rowIterator();
		Value v= new Value(1);
		int i=1;
		//Value[] e1 = new Value[sh1.getPhysicalNumberOfRows()-1];
		while(i<sh1.getPhysicalNumberOfRows()){
			//System.out.println(i);
			
				Value v1 = new Value(i);
				v=v1;
			
			//i++;
		//ms}
		if(checkDate(v.Start_Date, v.Close_Date)&&checkDate(v.Close_Date, v.End_Date)){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\10644602\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://lntinfotech.crm5.dynamics.com/");
		driver.manage().window().maximize();
		//String emailid="";
		//driver.findElement(By.id("i0116")).sendKeys(emailid);
		driver.findElement(By.id("i0116")).sendKeys(v.Username);
		driver.findElement(By.id("idSIButton9")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get(driver.getCurrentUrl());
		//driver.manage().window().maximize();
            	//String password = "";
    		driver.findElement(By.id("passwordInput")).sendKeys(v.Password);
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
    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

    	try{
    		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    		Robot r = new Robot();

    		r.delay(2000);

    		try{
    			//Value v=new Value();
    			//String Account="Ingram Micro Inc";
    			robofunc(v.Account);
    			r.delay(2000);
    			
    			pressEnter(1);
    			r.delay(2000);
    			pressEnter(1);
    			
        		pressTab(1);
        		
        		pressEnter(1);
        		        		
        		robofunc(v.Opportunity);
        		r.delay(2000);
    			
        		pressTab(1);
        		
        		r.keyPress(KeyEvent.VK_DOWN);
        		r.delay(1000);
        				
        		r.keyRelease(KeyEvent.VK_DOWN);
        		
        		pressEnter(2);
        		
        		pressTab(1);
        		
        		pressEnter(1);	
        		
        		
        		robofunc(v.OpportunityValue);
        		r.delay(2000);
        		
        		pressEnter(1);
        		
        		pressTab(3);
        		
        		//pRACTICE uNIT
        		
        		robofunc(v.Practice_Unit);
        		
        		pressEnter(1);
        		r.delay(2000);
        		pressEnter(1);
        		
        		pressTab(1);
        		
        		
        		robofunc(v.Start_Date);
        		
        		pressTab(2);
        		
        		
    			robofunc(v.Service_Offering);
    			
    			pressEnter(1);
    			r.delay(2000);
    			pressEnter(1);
        		
    			pressTab(4);
        		
    			pressEnter(1);
    			
        		
        		robofunc(v.Close_Date);
        		
        		pressTab(2);
        		
        		r.keyPress(KeyEvent.VK_DOWN);
        		r.delay(1000);
        		r.keyRelease(KeyEvent.VK_DOWN);
        		
        		pressEnter(1);
        		
        		r.delay(2000);
        		//pressTab(1);
        		robofunc(v.Service_Offering);
        		pressEnter(1);
    			r.delay(2000);
    			pressEnter(1);
        		
        		pressTab(8);
        		
        		pressEnter(1);
        		
        		robofunc(v.End_Date);
        		
        		pressTab(2);

    		}
    		
    		finally{
    		
    		}

    	}
    	catch(Exception e){
    		System.out.println("Error 3"+" "+ e);
    	}

		System.out.println("Success");
    	
	}
		else{
			System.out.println("Wrong Date!! ");
		}
	
		i++;
	}
	}

}

