/**
 * 
 */
package com.Amazon.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.amazonSearch.CheckBox;
import com.amazonSearch.Searchipad2Cover;

import helper.browserFactory;

/**
 * @author Kruti
 *
 */
public class AmazonSearch {
	@Test
	public void SearchItem()
	{
		//Initializing the WebDriver and calling the method from browserFactory 
		WebDriver driver = browserFactory.startBrowser("firefox","https://www.amazon.com/" );
		//Creating page object using page factory
		Searchipad2Cover Search = PageFactory.initElements(driver,Searchipad2Cover.class);
		//Call the Method
		Search.typeSearch("ipad air 2 case");
		//Creating page object using page factory for CheckBox
		CheckBox Check = PageFactory.initElements(driver, CheckBox.class);
		//Call the Method
		Check.clickCheckBox();//Calling Click on plastic check box
		Check.RefineSearch("20","100");// Refining search between 20 to 100

	}


}
