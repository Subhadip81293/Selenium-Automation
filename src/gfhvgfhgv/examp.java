package gfhvgfhgv;

import java.io.IOException;
import java.util.List;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.DesiredCapabilities;






 

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 

public class examp {
public static void main(String[] args) throws IOException{
	
	
	    DesiredCapabilities capabilities = DesiredCapabilities.chrome(); 
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(capabilities);
	    driver.get("https://www.softwaretestingclass.com/");
	
	 

	//Finding iframe

	List<WebElement> elements = driver.findElements(By.tagName("iframe"));
	int numberOfTags = elements.size();
	System.out.println("No. of Iframes on this Web Page are: " +numberOfTags);

	

}
}
