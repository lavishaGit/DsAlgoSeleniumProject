package com.dsalgo.testcases;

import org.testng.annotations.Test;

import com.dsalgo.base.BrowserInit;
import com.dsalgo.pages.ArrayPage;
import com.dsalgo.pages.GetStartedPage;
import com.dsalgo.pages.PracticeQuestions;
import com.dsalgo.pages.PracticeTextEditor_EvenNum;
import com.dsalgo.pages.PracticeTextEditor_Maxones;
import com.dsalgo.pages.PracticeTextEditor_Searcharray;
import com.dsalgo.pages.PracticeTextEditor_SortedArray;
import com.dsalgo.pages.TextEditor_AppofArray;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Array_Page  {
	//ArrayPage arrpage=new ArrayPage();
	WebDriver driver;
	//public TextEditor_AppofArray(WebDriver driver) {
		//	PageFactory.initElements(driver, this);
	///	  this.driver=driver;
	//	    }
  @Test
  public void Asserts() throws IllegalArgumentException, InterruptedException {
	  PracticeQuestions praclink = PageFactory.initElements(driver, PracticeQuestions .class);
	  praclink.practicequestions();
	  Thread.sleep(1000);
praclink.searcharray();

Thread.sleep(1000);
PracticeTextEditor_Searcharray searcharray = PageFactory.initElements(driver, PracticeTextEditor_Searcharray.class);
searcharray.searchthearray();
Thread.sleep(1000);
driver.navigate().back();
//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("window.history.go(-1)");
  }
  @Test(priority=0)//6
	public void practicequestion_searcharray() throws IllegalArgumentException, InterruptedException, IOException {
		PracticeQuestions praclink = PageFactory.initElements(driver, PracticeQuestions .class);
		Thread.sleep(2000);
		//praclink.arrayphthon();
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
  @Test(priority=0)//6
	public void practicequestion_maxone() throws IllegalArgumentException, InterruptedException, IOException {
		PracticeQuestions praclink = PageFactory.initElements(driver, PracticeQuestions .class);
		praclink.maxcon();
		Thread.sleep(1000);
		PracticeTextEditor_Maxones maxlink = PageFactory.initElements(driver,PracticeTextEditor_Maxones.class);
		maxlink.maxone();
		Thread.sleep(1000);
		driver.navigate().back();	
		
		
	}
		
	@Test(priority=1)//6
	public void practicequestion_evennum() throws IllegalArgumentException, InterruptedException, IOException {
		PracticeQuestions praclink = PageFactory.initElements(driver, PracticeQuestions .class);
		praclink.evennumber();
		Thread.sleep(1000);
		PracticeTextEditor_EvenNum evennum = PageFactory.initElements(driver,PracticeTextEditor_EvenNum .class);
		evennum.evennumber();
		Thread.sleep(1000);
		driver.navigate().back();	
		
		
	}
	@Test(priority=2)
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
		System.setProperty("webdriver.chrome.driver", "/Users/nitin/Downloads/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com/array/arrays-in-python/");
		driver.manage().window().maximize();
		// Thread.sleep(2000);

	}

	@AfterTest
	public void afterTest() {
		//driver.close();
		Reporter.log("User successfully logged out");
	}

}
