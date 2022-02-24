package com.dsalgo.utilities;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

//import com.automation.utilities.BrowserFactory;
import com.dsalgo.utilities.*;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Login_Excel {
  
	  @Test(dataProvider = "customerData") 
	  public void GetData(String username, String password) 
	  { 
	  //Get input parameters equal to parameters in excel 
	  System.out.println(username + " | " + password); 
	  }
  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }
  @DataProvider(name = "customerData")
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
      }    

  
}
