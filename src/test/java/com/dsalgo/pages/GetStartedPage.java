package com.dsalgo.pages;

import org.testng.annotations.Test;

import com.dsalgo.base.BrowserInit;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class GetStartedPage extends BrowserInit {
  
	
	@FindBy(xpath = "//button[contains(text(),'Get Started')]" ) WebElement getstarted; //"//button[@class='btn']" 
	
	 
	  public void buttonclick() throws IllegalArgumentException, InterruptedException{
		  
	  
	 driver.switchTo().defaultContent(); 

     getstarted.click();
 
    Reporter.log("User navigated to the Home page\");\n"
     		+ ""); 
 //driver.switchTo().defaultContent();
}
	  public void PageTitle() throws IllegalArgumentException, InterruptedException{
		  
		  
			//driver.switchTo().defaultContent(); 

	 getstarted.isDisplayed();	//Assert.assertEquals("Numpy Ninja", str);
	 
     Reporter.log("Assertion for pageTitle"); 
	 
	 //driver.switchTo().defaultContent();
	}
	  
	  

}