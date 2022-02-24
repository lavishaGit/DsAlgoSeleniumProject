package com.dsalgo.pages;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Arraylinks 

{
	
	WebDriver driver;	
	//@FindBy(xpath=("//a[@href='/tryEditor']"))public WebElement texteditor;
	@FindBy(xpath=("//*[@tabindex='0']") )
	public WebElement texttab; 
	@FindBy(xpath=("//button[@type='button']"))public WebElement runbutton;
	public void runbutton() throws InterruptedException {
		
			runbutton.click();
			Thread.sleep(3000);
			Reporter.log("Run button is clicked"); 
	
	
		
		}
	/*public void texttab() throws InterruptedException {
		
		Thread.sleep(1000);
	 texttab.sendKeys("cars = ['Ford', 'Volvo', 'BMW']\nprint(cars)\nx = len(cars)\nprint(x)");
		Thread.sleep(1000);
		Reporter.log("Array in phython code is here"); 
	}
	public void texttab1() throws InterruptedException {
		Thread.sleep(1000);
		texttab.sendKeys("a = ['apple', 'banana', 'cherry']\nb = ['Ford', 'BMW', 'Volvo']\na.append(b)\nprint(a)");
		Thread.sleep(1000);
		Reporter.log("Array list code is here"); 
	}
	
	public void texttab2() throws InterruptedException {
		Thread.sleep(1000);
		texttab.sendKeys("fruits = ['apple', 'banana', 'cherry']\nfruits.insert(1, 'orange')");
		Thread.sleep(1000);
		Reporter.log("Basic operations list code is here"); 
	}
	public void texttab3() throws InterruptedException {
		Thread.sleep(1000);
		texttab.sendKeys("num1 = 1.5\nnum2 = 6.3\nprint('The sum of {0} and {1} is {2}'.format(num1, num2, sum))");
		Reporter.log("Sending Input in Text Editor of Array Python "); 
		
  }
	
	
	

	*/
}


