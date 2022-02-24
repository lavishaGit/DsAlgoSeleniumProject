package com.dsalgo.pages;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SignInPage {
	
	@FindBy(xpath=("//a[@href='/login']") ) WebElement signin; 

	  public void buttonclick() {
signin.click();
Reporter.log("Submit button is entered"); 
}
}
