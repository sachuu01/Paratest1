package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.util.Testutil;

public class TestBase 
{
	 public static WebDriver driver;
	 public static Properties prop;
	
	
	
	public TestBase() 
	{
		prop=new Properties();
		try {
			FileInputStream fis= new FileInputStream("D:\\SachinAutomation\\Paratest1\\src\\main\\java\\com\\config\\para.properties");
			prop.load(fis);
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	public static void initilization()
	{
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			  System.setProperty("webdriver.chrome.driver","D:\\sachin\\chromedriver.exe" );
				driver= new ChromeDriver();
		}
		else if (browsername.equals("ff"))
		{
			  System.setProperty("webdriver.chrome.driver","D:\\sachin\\geckodriver.exe" );
				driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testutil.Page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutil.implicit_wait_timout, TimeUnit.SECONDS);
		  
		driver.get("http://parabank.parasoft.com");
		
	} 

}
