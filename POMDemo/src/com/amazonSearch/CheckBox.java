/**
 * 
 */
package com.amazonSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Kruti
 *
 */
public class CheckBox {


	WebDriver driver;
	//creating parameterized constructor to initialize WebDriver
	public CheckBox(WebDriver driver){
		this.driver=driver;
	}
	//Finding name as locator for check Box
	@FindBy(name="s-ref-checkbox-8080061011") 
	WebElement CheckBox;
	//Finding Element for Refine Search.Entering value in input Box
	@FindBy(xpath=".//*[@id='low-price']") 
	WebElement InputBox1;//Min Value input Box

	@FindBy(xpath=".//*[@id='high-price']") 
	WebElement InputBox2;//Max Value input Box
	//Finding Element to click on Go button
	@FindBy(xpath="//*input[@value='Go']") 
	WebElement GoButton;

	//Creating Reusable Method for the click on check box and Just to Click on button
	public void clickCheckBox(){
		CheckBox.click();
	}
	//Creating parameterized Reusable Method for Entering Min and Max values in Input Box for Refine Search
	public void RefineSearch(String i, String j){
		InputBox1.sendKeys(i);
		InputBox2.sendKeys(j);
		InputBox2.submit();
	}
	
}

