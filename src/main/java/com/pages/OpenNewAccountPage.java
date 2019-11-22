package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.util.UtilManager;

public class OpenNewAccountPage extends TestBase
{
	
	UtilManager um= new UtilManager();
	
	
	@FindBy(linkText="Open New Account")
	WebElement lnk_opennewaccount;
	
	public OpenNewAccountPage()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickon_open_new_account()
	{
		um.clickelement(lnk_opennewaccount);
	}
	
	

}
