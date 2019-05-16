package gfhvgfhgv;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.DesiredCapabilities;

public class milestone {
	
	public static void main(String[] args) {
		
		 DesiredCapabilities capabilities = DesiredCapabilities.chrome(); 
		 
	        ChromeOptions options = new ChromeOptions();
	        
	        options.addArguments("--incognito");
	        
	        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	        
	        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	        
	        WebDriver driver = new ChromeDriver(capabilities);
	        
	        driver.get("https://iconnect.lntinfotech.com/sap/bc/ui5_ui5/ui2/ushell/shells/abap/FioriLaunchpad.html#ZTCC_SEM-display");
	              
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	     
	        driver.findElement(By.id("__tile14-title-inner")).click(); 
	        
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	        
	        System.out.println(driver.getTitle());   
        
}
	
}
