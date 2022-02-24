package com.dsalgo.pages;
import org.testng.annotations.Test;
import com.dsalgo.utilities.*;

import org.testng.annotations.Test;

import com.dsalgo.utilities.*;
import com.dsalgo.base.BrowserInit;
import com.dsalgo.utilities.Login_Excel;



import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;

public class Login extends GetStartedPage{
	@FindBy(xpath=("//a[@href='/login']") ) WebElement signin; 

	@FindBy(name = "username" ) WebElement usernameedit; 
	@FindBy(name="password") WebElement passwordEdit; 
	@FindBy(xpath="//input[@type='submit']") WebElement login; 
	 int currentRow = 1; 
     int currentColumn = 0;
		

     public void buttonclick() {
 		driver.switchTo().defaultContent(); 

    	 signin.click();
    	 Reporter.log("Submit button is entered"); 
    	 }
	// @Test(dataProvider = "customerData") 
//	  public void GetData(String username,String password) throws IOException 
//	  { 
		 
	  //Get input parameters equal to parameters in excel 
	//  System.out.println(username + " | " + password); 
  	 // String FilePath = "/Users/nitin/eclipse workspace/Java/dsalgo/src/test/resources/Dsalgo_Auth.xlsx";
  //int currentRow = 1; 
//	int currentColumn = 0;
	//		usernameedit.sendKeys(username); 
	//		passwordEdit.sendKeys(password);
	////	usernameedit.sendKeys(XLUtil.getCellData(FilePath,"Sheet1", currentRow, currentColumn)); 
	//	passwordEdit.sendKeys(XLUtil.getCellData(FilePath, "Sheet1", currentRow, currentColumn+1));
		////login.click(); 
	//	Reporter.log("Submit button is entered");
//
	//  }
     @Test
public void GetData() throws IOException 
	  {String FilePath = "/Users/nitin/eclipse workspace/Java/dsalgo/src/test/resources/Dsalgo_Auth.xlsx";
	int currentRow = 1; 
	int currentColumn = 0;
		driver.switchTo().defaultContent(); 

		  usernameedit.sendKeys(XLUtil.getCellData(FilePath,"Sheet1", currentRow, currentColumn)); 
		passwordEdit.sendKeys(XLUtil.getCellData(FilePath, "Sheet1", currentRow, currentColumn+1));
		login.click(); 
	  }
 @BeforeTest
 public void beforeTest() {
 }

 @AfterTest
 public void afterTest() {
 }
 /*@DataProvider(name = "customerData")
 public Object[][] retrieveCustomerDataFromExcel() throws IOException {

 	 String FilePath = "/Users/nitin/eclipse workspace/Java/dsalgo/src/test/resources/Dsalgo_Auth.xlsx";
     int rowCount = XLUtil.getRowCount(FilePath, "Sheet1");
     System.out.println(rowCount);
     int columnCount = XLUtil.getCellCount(FilePath, "Sheet1", 1);
     System.out.println(columnCount);

     String customerData[][] = new String [rowCount][columnCount];
     for (int currentRow = 1; currentRow <= rowCount; currentRow++){
         for(int currentColumn = 0; currentColumn < columnCount; currentColumn++){
             customerData[currentRow-1][currentColumn] = XLUtil.getCellData(FilePath, "Sheet1", currentRow, currentColumn);
         }
     }
     return (customerData);
     }*/
 
}
