package testcases;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.base.TestBase;
import com.pages.LoginPage;

public class LoginPageTest extends TestBase
{
	LoginPage loginpage;
	public LoginPageTest()
	{
		super();	
		loginpage=new LoginPage();
	}
	
	@BeforeMethod
	public void setup()
	{
		initilization();
		loginpage=new LoginPage();
		
	}
	
	@Test
	public void ValidatePageTile(){
	String loginpagetitel=loginpage.validateloginPageTitle();
	Assert.assertEquals(loginpagetitel, "ParaBank | Welcome | Online Banking");
	
	}
	
	
	@Test
	public void validate_login_credential() throws Exception
	{
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		 
		
      ExtentHtmlReporter reporter= new ExtentHtmlReporter("D:\\SachinAutomation\\Paratest1\\Reports\\extrep1.html");
      
      ExtentReports ext= new ExtentReports();
      
      ext.attachReporter(reporter);
      
      ExtentTest  logger= ext.createTest(" validate_login_credential");
      
      logger.assignCategory("Regression");
      logger.assignAuthor("sachin");
      //take screenshot
      logger.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
      
      
      //log events
      
      logger.log(Status.INFO, "login to parabank");
      logger.log(Status.PASS, "LOGIN TO PARABANK SUCCESFULLY");
      logger.log(Status.WARNING, "******");
      
      
      
      
      
      
      
      
      
      
      
      ext.flush();
      
      
     }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
		

}
