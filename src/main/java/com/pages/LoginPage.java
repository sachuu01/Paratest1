package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginPage extends TestBase
{
	// page factory / object repository
	
	@FindBy(name="username")
	WebElement txtusername;
	@FindBy(name="password")
	WebElement txtpassword;
	@FindBy(xpath="//*[@value='Log In']")
	WebElement btnlogin;
	@FindBy(xpath="//img[contains(@class,'logo')]")
	WebElement parabanklogo;
	
	// initilizing pageobjects
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	//actions
	public void login(String username,String password)
	{
		txtusername.sendKeys(username);
		txtpassword.sendKeys(password);
		btnlogin.click();
	}
	
	public String validateloginPageTitle()
	{
	      return driver.getTitle();
		
		
	}
	
	public boolean validate_Parabanklogo()
	{
		return parabanklogo.isDisplayed();
		
	}

}
