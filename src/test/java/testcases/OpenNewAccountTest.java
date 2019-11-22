package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.LoginPage;
import com.pages.OpenNewAccountPage;
import com.util.UtilManager;

public class OpenNewAccountTest extends TestBase
{
	WebDriver driver;
	LoginPage loginpage;
	OpenNewAccountPage openaccountpage;
	UtilManager um;
	
	
	@BeforeMethod
	public void setup()
	{
		initilization();
		loginpage=new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		openaccountpage=new OpenNewAccountPage();
		um= new UtilManager();
		
		
	}
	
	
	@Test
	public void tc_1_validate_open_new_account()
	{
	//	um.Takescreenshot(driver, "D:\\git_workspace\\Paratest1\\src\\main\\java\\com\\report\\srcshot1.png");
		openaccountpage.clickon_open_new_account();
		
		
	}
	
	

}
