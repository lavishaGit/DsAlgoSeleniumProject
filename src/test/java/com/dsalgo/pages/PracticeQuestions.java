package com.dsalgo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeQuestions {
	
	WebDriver driver;
	public PracticeQuestions(WebDriver driver) {
	
		  this.driver=driver;
		    }
	@FindBy(xpath=("//a[@href='/array/practice']"))public WebElement practicequestions;

	@FindBy(xpath=("//a[@href='/question/1']") )public WebElement searcharray; 
	@FindBy(xpath=("//a[@href='/question/2']") )public WebElement maxcon; 
	@FindBy(xpath=("//a[@href='/question/3']") )public WebElement evennumber; 
	@FindBy(xpath=("//a[@href='/question/4']") )public WebElement sortedarray; 
	@FindBy(xpath=("//a[@href='arrays-in-python']") ) public  WebElement arraypython;


	public void arrayphthon() throws InterruptedException {
		Thread.sleep(1000);
		arraypython.click();
		Thread.sleep(1000);
		Reporter.log("practicequestions link is clicked"); 
		
		}
	public void practicequestions() throws InterruptedException {
		practicequestions.click();
		Thread.sleep(1000);
		Reporter.log("practicequestions link is clicked"); 
		
		}
	public void searcharray() throws InterruptedException {
			searcharray.click();
		Thread.sleep(1000);
		Reporter.log("searcharray link is clicked"); 
		
		
		}
	
	public void maxcon() throws InterruptedException {
		maxcon.click();
		Thread.sleep(1000);
		Reporter.log("Max Consecutive Ones link is clicked"); 
		
		}
	public void evennumber() throws InterruptedException {
		evennumber.click();
		Thread.sleep(1000);
		Reporter.log("Find Numbers with Even Number of Digits link is clicked"); 
		
		}

public void sortedarray() throws InterruptedException {
	sortedarray.click();
	Thread.sleep(1000);
	Reporter.log("Squares of  a Sorted Array link is clicked"); 
	
	}






	
	
  @Test
  public void f() {
  }
}
