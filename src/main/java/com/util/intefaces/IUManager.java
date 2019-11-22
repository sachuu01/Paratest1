package com.util.intefaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface IUManager 
{
	
	public void setelementtext(WebElement _element, String text);
	public void clickelement(WebElement _element);
	public String Takescreenshot(WebDriver driver, String string);
	public String getelementtext(WebElement _element);
	
	

}
