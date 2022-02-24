package com.dsalgo.testcases;

import org.testng.annotations.Test;

import com.dsalgo.base.BrowserInit;
import com.dsalgo.pages.ArrayPage;
import com.dsalgo.pages.Arraylinks;
import com.dsalgo.pages.GetStartedPage;
import com.dsalgo.pages.Login;
import com.dsalgo.pages.PracticeQuestions;
import com.dsalgo.pages.PracticeTextEditor_EvenNum;
import com.dsalgo.pages.PracticeTextEditor_Maxones;
import com.dsalgo.pages.PracticeTextEditor_Searcharray;
import com.dsalgo.pages.PracticeTextEditor_SortedArray;
import com.dsalgo.pages.TextEditor_AppofArray;
import com.dsalgo.pages.TextEditor_Arraylist;
import com.dsalgo.pages.TextEditor_BasicOps;
import com.dsalgo.pages.TextEditor_Python;
import com.dsalgo.testcases.*;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Array_PageValidation extends BrowserInit {
	
	@Test(priority=0)
  public void loginuser() throws IllegalArgumentException, InterruptedException, IOException {
		

		  Reporter.log("Page url : " +driver.getTitle()); 
		  Assert.assertEquals("Numpy Ninja", driver.getTitle());
		  Reporter.log("User is on signin  ");
		  GetStartedPage loginPO = PageFactory.initElements(driver, GetStartedPage.class); 
		  loginPO.buttonclick(); 
		  Reporter.log("User is on Signin page");
		  Login home=PageFactory.initElements(driver, Login.class); 
			 // driver.switchTo().defaultContent(); 
			  home.buttonclick();
			home.GetData();
			Reporter.log("User Signed in successfully  and now user is on Home Page");
	

  }
	@Test(priority=1)
	  public void ArrayPage() throws IllegalArgumentException, InterruptedException, IOException {
		

	
		  ArrayPage arrPage=PageFactory.initElements(driver, ArrayPage .class);
		  Reporter.log(" dropdown list in Home Page");
	      arrPage.dropdown();
			Thread.sleep(1000);

		 assertTrue(arrPage.dropdown.isEnabled());
		 assertTrue(arrPage.dropdown.isDisplayed());
			Thread.sleep(1000);
	/*		  List<WebElement> allURLs =(List<WebElement>) arrPage.dropdown;
			  String getText = allURLs.get(0).getText(); 
			     System.out.println(getText);*/
		 arrPage.array();
		  Reporter.log("User selected Arrays from dropdown list in Home Page");
		 Assert.assertTrue("Arrays", arrPage.array.getAttribute("class").contains("dropdown-item"));
		  Reporter.log("Assertion Array passed");
		  //ArrayPython();
		 // ArrayPython_TextEditor();
		 //Arraylist();
		//TextEditorArrayList_Validation();
		 // Arraylist();
		//  TextEditorArrayList_Validation();
		 // ApplicationsofArray();
		  //TextEditorApp_ofarray_Validation();
		  //ArrayBasicOps();
		//  TextEditorBasicOperation_Validation();
		//  Assert.assertEquals("Arrays", arrPage.array.getText());
		 // Reporter.log("Assertion done for dropdown is successful",true);
		 
	}
	
	@Test(priority=2)
	  public void ArrayPython() throws IllegalArgumentException, InterruptedException, IOException {
		  ArrayPage arrPage=PageFactory.initElements(driver, ArrayPage .class);

		 // Arraylinks arrlinks=PageFactory.initElements(driver, Arraylinks .class);

		  arrPage.arraypython();
		  
		  Reporter.log("User clicked Array Python link");

		//  Assert.assertTrue("Arrays in Python",arrPage.arraypython.getAttribute("class").contains("list-group-item"));//check that a link is active using selenium
		  //Reporter.log("Array Python link is clicked ",true);
		  arrPage.testlink();
		  Thread.sleep(1000);
			//Assert.assertEquals("Try here>>>", arrlinks.texteditor.getText());

			//Thread.sleep(1000);
			Reporter.log("python_text_editor link  is clicked"); 
	}
		
		 
		
	
	@Test(priority=3)
	 public void ArrayPython_TextEditor() throws IllegalArgumentException, InterruptedException, IOException {
		TextEditor_Python aarlink  = PageFactory.initElements(driver, TextEditor_Python.class);

		//TextEditorValidation textedit=new TextEditorValidation(driver);
		aarlink.TextEditorPython_Validation();
		Thread.sleep(1000);
		//Selenium with java to gp back to specific page:
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.history.go(-2)");
	}
	
	@Test(priority=6)//8
	  public void Arraylist() throws IllegalArgumentException, InterruptedException, IOException {
		  ArrayPage arrPage=PageFactory.initElements(driver, ArrayPage .class);

		 // Arraylinks arrlinks=PageFactory.initElements(driver, Arraylinks .class);

		  arrPage.arraylist();
		  
		  Reporter.log("User clicked Array list link");

		//  Assert.assertTrue("Arrays in Python",arrPage.arraypython.getAttribute("class").contains("list-group-item"));//check that a link is active using selenium
		  //Reporter.log("Array Python link is clicked ",true);
		  arrPage.testlink();
		  Thread.sleep(1000);
			//Assert.assertEquals("Try here>>>", arrlinks.texteditor.getText());

			Thread.sleep(1000);
			Reporter.log("Array_list_text_editor link  is clicked"); 
	}
		
	@Test(priority=7)//9
	 public void TextEditorArrayList_Validation() throws IllegalArgumentException, InterruptedException, IOException {
		TextEditor_Arraylist textarray=PageFactory.initElements(driver, TextEditor_Arraylist .class);

		textarray.TextEditor_Arraylist();
		  
		Thread.sleep(1000);
		//Selenium with java to gp back to specific page:
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.history.go(-2)");
	Thread.sleep(2000);

		
	}
	@Test(priority=4)//2
	  public void ArrayBasicOps() throws IllegalArgumentException, InterruptedException, IOException {
		 // driver.manage().deleteAllCookies();

		  ArrayPage arrPage=PageFactory.initElements(driver, ArrayPage .class);
		  Thread.sleep(1000);
		//  driver.getWindowHandles();
		  //driver.switchTo().defaultContent();
		//  driver.getWindowHandle();
		 // driver.manage().deleteAllCookies();
		  arrPage.basiclist();
		  Thread.sleep(1000);
		 
		arrPage.testlink();
		  Thread.sleep(1000);

	 }
		 // driver.switchTo().Window(driver.getWindowHandle().l);
		  //link = wait.until(EC.presence_of_element_located(arrPage.testlink()));
			//	  driver.execute_script("arguments[0].target='_self';", link)
	/*		//	  link.click()
		 Set<String> availableWindows = driver.getWindowHandles();
		  for (String windowHandle : availableWindows) {
		      driver.switchTo().window(windowHandle);
		      if (getTitle().contains(TITLE_TO_MATCH)){
		             driver.manage().window().maximize();
		    }          return;
		     
		
		 
		  Reporter.log("User clicked Array Basic ops link");
		  Thread.sleep(1000);
		//  Assert.assertTrue("Arrays in Python",arrPage.arraypython.getAttribute("class").contains("list-group-item"));//check that a link is active using selenium
		  //Reporter.log("Array Python link is clicked ",true);
		 
		  Thread.sleep(1000);	//Assert.assertEquals("Try here>>>", arrlinks.texteditor.getText());

			
			Reporter.log("text_editor link  is clicked"); 
	}*/
		
@Test(priority=5)//3
	 public void TextEditorBasicOperation_Validation() throws IllegalArgumentException, InterruptedException, IOException {
		TextEditor_BasicOps aarlink  = PageFactory.initElements(driver, TextEditor_BasicOps.class);

		aarlink.TextEditor_BasicOps();
		Thread.sleep(1000);
		  Reporter.log("Basci opreations all scenarios run successfully");

		//Selenium with java to gp back to specific page:
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.history.go(-2)");
		   Thread.sleep(2000);

		
	}
@Test(priority=8)
public void ApplicationsofArray() throws IllegalArgumentException, InterruptedException, IOException {
	
	//TextEditor_AppofArray aarlink  = PageFactory.initElements(driver, TextEditor_AppofArray.class);
//;
	ArrayPage arrPage=PageFactory.initElements(driver, ArrayPage .class);
	 Thread.sleep(2000);
	  //String currentWindow = driver.getWindowHandles(); 
	 arrPage.arrayapp();
	   // Set<String> handles = driver.getWindowHandles();
	      ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());

	    String currentHandle = driver.getWindowHandle();
	    for (String handle : wid) {

	     if (!handle.equals(currentHandle))
	     {
	         driver.switchTo().window(handle);
	     }
	   }

	   //go back to first tab if you want
	  driver.switchTo().window(wid.get(0));
	//  arrPage.arrayapp();
	 //WebElement element=driver.findElement(By.xpath("//a[@href='applications-of-array']"));
//element.click();
//	 if (driver.getTitle().contains("Applications of Array")){
	    	//  driver.switchTo().window(currentWindow);
	 
	// switchToWindowByTitle("Applications of Array");
	 //Set wnd = driver.getWindowHandles();
     // window handles iterate
    // Iterator i = wnd.iterator();
    /// String popwnd = (String) i.next();
	// String currentWindow = driver.getWindowHandle(); 
	// driver.switchTo().window(currentWindow);
	 
//	 arrPage.arrayapp();
	 
//	 }
// String currentWindow=element.click();
  //  String switchedWindowTitle=driver.switchTo().window(currentWindow).getTitle();
      //  driver.getTitle();

	// Set<String> availableWindows = driver.getWindowHandles();
	 // for (String windowHandle : availableWindows) {
	      //driver.switchTo().window(windowHandle);
	//      if (driver.getTitle().contains("Applications of Array")){
	    	//  driver.switchTo().window(currentWindow);
	 //   	 driver.close();
	    	  
	    	 // element.click();
	     // }
	  //    driver.switchTo().window(currentWindow);
	    //        // driver.manage().window().maximize();
	   
	//  arrPage.arrayapp();
	// WebElement element;
	// element= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='applications-of-array']")));
	// arrPage.arrayapp();
	// element.click();
	  Reporter.log("User clicked applications of array link");
	  Thread.sleep(2000);
	WebElement element1;

	 //WebDriverWait wait1 = new WebDriverWait(driver, 1000);
	//element1= wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/tryEditor']")));
	//	element1.click();
	 arrPage.testlink();
	 //
		//Assert.assertEquals("Try here>>>", arrlinks.texteditor.getText());

		Thread.sleep(1000);
		Reporter.log("text_editor link  is clicked"); 

	
///@Test(priority=9)//7
//@BeforeMethod

 //public void TextEditorApp_ofarray_Validation() throws IllegalArgumentException, InterruptedException, IOException {
	TextEditor_AppofArray aarlink  = PageFactory.initElements(driver, TextEditor_AppofArray.class);
	Thread.sleep(1000);
	aarlink.TextEditor_AppofArray();
	
	Thread.sleep(1000);
	  Reporter.log("Basci opreations all scenarios run successfully");

	//Selenium with java to gp back to specific page:
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.history.go(-2)");


}
	

	/*@Test(priority=9)//6
	public void practicequestion_searcharray() throws IllegalArgumentException, InterruptedException, IOException {
		PracticeQuestions praclink = PageFactory.initElements(driver, PracticeQuestions .class);
		Thread.sleep(2000);
		praclink.arrayphthon();
		Thread.sleep(1000);
		praclink.practicequestions();
		  Thread.sleep(1000);
	praclink.searcharray();

	Thread.sleep(1000);
	PracticeTextEditor_Searcharray searcharray = PageFactory.initElements(driver, PracticeTextEditor_Searcharray.class);
	searcharray.searchthearray();
	Thread.sleep(1000);
	driver.navigate().back();	

	}
	@Test(priority=10)//6
	public void practicequestion_maxone() throws IllegalArgumentException, InterruptedException, IOException {
		PracticeQuestions praclink = PageFactory.initElements(driver, PracticeQuestions .class);
		praclink.maxcon();
		Thread.sleep(1000);
		PracticeTextEditor_Maxones maxlink = PageFactory.initElements(driver,PracticeTextEditor_Maxones.class);
		maxlink.maxone();
		Thread.sleep(1000);
		driver.navigate().back();	
		
		
	}
		
	@Test(priority=11)//6
	public void practicequestion_evennum() throws IllegalArgumentException, InterruptedException, IOException {
		PracticeQuestions praclink = PageFactory.initElements(driver, PracticeQuestions .class);
		praclink.evennumber();
		Thread.sleep(1000);
		PracticeTextEditor_EvenNum evennum = PageFactory.initElements(driver,PracticeTextEditor_EvenNum .class);
		evennum.evennumber();
		Thread.sleep(1000);
		driver.navigate().back();	
		
		
	}
	@Test(priority=12)
	public void practicequestion_sorted() throws IllegalArgumentException, InterruptedException, IOException {
		PracticeQuestions praclink = PageFactory.initElements(driver, PracticeQuestions .class);
		praclink.sortedarray();
		Thread.sleep(1000);
		PracticeTextEditor_SortedArray maxlink = PageFactory.initElements(driver,PracticeTextEditor_SortedArray.class);
		maxlink.sortedarray();
		Thread.sleep(1000);
		//driver.navigate().back();	
		
		
	}
	
	@BeforeTest
	public void beforeTest() {

	
	}

	@AfterTest
	public void afterTest() {
		
	}*/
/*public boolean switchToWindowByTitle(String title){
String currentWindow = driver.getWindowHandle(); 
Set<String> availableWindows = driver.getWindowHandles(); 

     for (String windowId : availableWindows) {
          String switchedWindowTitle=driver.switchTo().window(windowId).getTitle();
          if ((switchedWindowTitle.equals("Applications of Array"))||(switchedWindowTitle.contains("Array"))){ 
              return true; 
          } else { 
            driver.switchTo().window(currentWindow); 
          } 
     }
 } 
 return false;
}*/
}
