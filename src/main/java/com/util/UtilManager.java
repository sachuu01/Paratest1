package com.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.util.intefaces.IUManager;

public class UtilManager implements IUManager 
{
	
	public void setelementtext(WebElement _element, String text) 
	{
		_element.sendKeys(text);
	
		
	}
	public void clickelement(WebElement _element) {
	
		_element.click();
	}
	
	
	public String getelementtext(WebElement _element) {
	
		 String temp=_element.getText();
		return temp;
	}

	public String Takescreenshot(WebDriver driver,String filepath) {
		
		
		TakesScreenshot srcshot=(TakesScreenshot) driver;
	    File srcfile=srcshot.getScreenshotAs(OutputType.FILE);
	    File destfile= new File(filepath);
	    try {
			FileUtils.copyFile(srcfile, destfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	   
		
		
		
	}

}
