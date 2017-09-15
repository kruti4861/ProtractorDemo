/**
 * 
 */
package com.amazonSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Kruti
 *This class will store all the locators and methods for search
 */
public class Searchipad2Cover {
	WebDriver driver;
	//creating parameterized constructor to initialize WebDriver
	public Searchipad2Cover(WebDriver driver){
		this.driver=driver;
	}
	//Finding id as locator for search Box
	@FindBy(id="twotabsearchtextbox") 
	WebElement searchBox;
	//Finding xpath as locator for search button
	@FindBy(xpath=".//*[@id='nav-search']/form/div[2]/div/input") WebElement searchButton;
	
	public void typeSearch(String str){
		searchBox.sendKeys(str);
		searchButton.click();
	}
	
}
