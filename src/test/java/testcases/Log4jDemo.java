package testcases;

import java.sql.Driver;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jDemo {
	WebDriver driver;
	

	
	
	@Test
	public void logintoapplication(){
		
		 System.setProperty("webdriver.chrome.driver","D:\\sachin\\chromedriver.exe" );
		 driver= new ChromeDriver();
	     driver.get("http://parabank.parasoft.com");
	    
         Logger log = Logger.getLogger("Log4jDemo");
	     PropertyConfigurator.configure("D:\\SachinAutomation\\Paratest1\\log4jfiles\\log4j.properties");
	     
	      WebElement  uname=driver.findElement(By.xpath("//*[@name='username']"));
	      uname.sendKeys("john");
          log.info("***User enter correct username****");
	     log.debug("txtuname debug");
	      
		  WebElement	pwd=driver.findElement(By.xpath("//*[@name='password']"));
		  pwd.sendKeys("demo");
		  log.info("***User enter coorect password***");
		  log.debug(pwd);
		  
		  
		  WebElement	login= driver.findElement(By.xpath("//*[@value='Log In']"));
			login.click();
	      log.info("****User login succesfully****");
	     
	     
	     
	     driver.close();
	     
     
 
       
     
     
	
	}
	
}
