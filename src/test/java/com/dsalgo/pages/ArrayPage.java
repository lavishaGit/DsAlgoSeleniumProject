package com.dsalgo.pages;

import org.testng.annotations.Test;

import com.dsalgo.base.BrowserInit;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ArrayPage{
	WebDriver driver;
	
	
	@FindBy(xpath=("//a[@href='#']") )public  WebElement dropdown; 
	@FindBy(xpath=("//a[@href='/array']") ) public WebElement array;
	@FindBy(xpath=("//a[@href='arrays-in-python']") ) public  WebElement arraypython;
	@FindBy(xpath=("//a[@href='arrays-using-list']"))  public WebElement arraylist;
	@FindBy(xpath=("//a[@href='applications-of-array']")) public WebElement arrayapp;
	@FindBy(xpath=("//a[@href='basic-operations-in-lists']")) public  WebElement basiclist;
	@FindBy(xpath=("//a[@href='/tryEditor']"))public WebElement texteditor;
	@FindBy(xpath=("//a[@href='/array/practice']"))public WebElement practicequestions;

	//public void f() {
	//JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("window.scrollBy(0,2000)");}
	public void dropdown() throws InterruptedException {
		//  driver.switchTo().defaultContent(); 

		dropdown.click();
		Thread.sleep(1000);
		Reporter.log("DropDown link is clicked"); 
		
		}
	
	public void array() throws InterruptedException {
		
		array.click();
		Thread.sleep(1000);
		Reporter.log("Array link is clicked"); 
		Thread.sleep(1000);
	/*	((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", array);*/
		Thread.sleep(1000);
		}
	
	public void arraypython() throws InterruptedException {
		
		arraypython.click();
		Thread.sleep(1000);
		Reporter.log("arraypython link is clicked"); 
		
		}
	public void arraylist() throws InterruptedException {
		arraylist.click();
		Thread.sleep(1000);
		Reporter.log("arraylist link is clicked"); 
		
		}
	public void arrayapp() throws InterruptedException {
		arrayapp.click();
		Thread.sleep(1000);
		Reporter.log("array_applink is clicked"); 
		
		}
	
	
public void basiclist() throws InterruptedException {
		
	basiclist.click();
		Thread.sleep(1000);
		Reporter.log("Array basic operation link is clicked"); 
		}
public void testlink() throws InterruptedException {
	texteditor.click();
	Thread.sleep(1000);
	Reporter.log("textlinllink is clicked"); }

	
}
