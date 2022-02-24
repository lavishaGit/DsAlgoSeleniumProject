package com.dsalgo.pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TextEditor_AppofArray extends Arraylinks {
	WebDriver driver;
	public TextEditor_AppofArray(WebDriver driver) {
		//	PageFactory.initElements(driver, this);
		  this.driver=driver;
		    }
  @Test
  public void TextEditor_AppofArray() throws InterruptedException {
	 	Arraylinks  aarlink = PageFactory.initElements(driver, Arraylinks.class);
//TextEditor_Arraylist aaraylist  = PageFactory.initElements(driver, TextEditor_Arraylist.class);

		Thread.sleep(1000);

		Reporter.log("Doing Validation for sending Array list code in text editor ");
		//Actions act1= new Actions(driver);
		//act1.moveToElement(aarlink.texttab).click().perform();

		texttab.sendKeys("num1 = 1.5\nnum2 = 6.3\nprint('The sum of {0} and {1} is {2}'.format(num1, num2, sum))");
			Thread.sleep(1000);
			aarlink.runbutton();
			Reporter.log("Run Button clicked ");
			Thread.sleep(2000);
			Actions acts = new Actions(driver);
			acts.moveToElement(aarlink.texttab).click().perform();
			////To Select the full Text////
			acts.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).build().perform();
			Thread.sleep(1000);
			acts.sendKeys(Keys.BACK_SPACE).build().perform();//To delete the selected Text
			Thread.sleep(3000);
			
			Reporter.log("Alert OK button is selected using the Accept method successsfully");
			Reporter.log("Array in phython code is here"); 
			
		//********* Passing AlfaNumeric value in TextArea***********
			
			Reporter.log("Doing Validation for AlfaNumeric value  in text editor ");
			aarlink.texttab.sendKeys("applications of array adding 2 numbers");
		Thread.sleep(1000);
		aarlink.runbutton();
		Reporter.log("Run Button clicked ",2);
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		Reporter.log("Inside the Alerts with Accept method");
		Thread.sleep(1000);
		alert.accept(); // To select OK button
		Thread.sleep(2000);
		Reporter.log("Alert OK button is selected using the Accept method successsfully");
		Actions act = new Actions(driver);
		act.moveToElement(aarlink.texttab).click().perform();
		////To Select the full Text////
		act.keyDown(Keys.COMMAND).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.BACK_SPACE).build().perform();//To delete the selected Text
		Thread.sleep(1000);
		

		//********* Passing null value in TextArea***********
		Reporter.log("Doing Validation for Null  in text editor ");
		//Actions act2 = new Actions(driver);
	//act.moveToElement(aarlink.texttab).click().perform();
		aarlink.texttab.sendKeys(" ");
		Thread.sleep(1000);
		aarlink.runbutton();
		Reporter.log("Run Button clicked ");
		Thread.sleep(1000);
		Reporter.log("no Alert OK button clicked as we are passing null value ");

		//   Actions ac1 = new Actions(driver);
		  
		//   ac1.moveToElement(aarlink.texttab).click().perform();
		//   ac1.keyDown(Keys.COMMAND).build().perform(); Thread.sleep(1000);
		//   ac1.sendKeys(Keys.BACK_SPACE) .build() .perform(); Thread.sleep(1000);
		
		
		
		//*************Passing Non-Python Code**************** 
		
		Reporter.log("Doing Validation for Non-Python Code  in text editor ");
		Thread.sleep(1000);

		//Actions ac1 = new Actions(driver);
		act.moveToElement(aarlink.texttab).click().perform();
		aarlink.texttab.sendKeys("#include <iostream>\n" + "\n" + "int main() {\n"
				+ "    std::cout << \"Hello World!\";\n" + "    return 0;\n" + "}");

		Thread.sleep(1000);
		Reporter.log("Code is written in the editor form");
		aarlink.runbutton();
		Reporter.log("Run Button clicked ");
		Thread.sleep(1000);

		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(1000);
		alert2.accept(); // To select OK button
		Thread.sleep(2000);
		Reporter.log("Alert OK button is selected using the Accept method successsfully");
		Actions act3= new Actions(driver);
		act3.moveToElement(aarlink.texttab).click().perform();
		////To Select the full Text////
		act3.keyDown(Keys.COMMAND).build().perform();
		Thread.sleep(1000);
		act3.sendKeys(Keys.BACK_SPACE).build().perform();//To delete the selected Text
		Thread.sleep(3000);
		
	}
  public void ApplicationsofArray() throws IllegalArgumentException, InterruptedException, IOException {
	 ArrayPage arrPage=PageFactory.initElements(driver, ArrayPage .class);
	  Thread.sleep(2000);
	 arrPage.arrayapp();
	 //WebElement element;
	  //WebDriverWait wait = new WebDriverWait(driver, 3000);
	// element= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='applications-of-array']")));
	//  arrPage.arrayapp();
	// element.click();
	  Reporter.log("User clicked applications of array link");
	  Thread.sleep(2000);
	//WebElement element1;

	 //WebDriverWait wait1 = new WebDriverWait(driver, 3000);
	//element1=element= wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/tryEditor']")));
	//	element1.click();
	 arrPage.testlink();
	 //
		//Assert.assertEquals("Try here>>>", arrlinks.texteditor.getText());

		Thread.sleep(1000);
		Reporter.log("text_editor link  is clicked"); 
}
	

 public void TextEditorApp_ofarray_Validation() throws IllegalArgumentException, InterruptedException, IOException {
	TextEditor_AppofArray aarlink  = PageFactory.initElements(driver, TextEditor_AppofArray.class);

	aarlink.TextEditor_AppofArray();
	Thread.sleep(1000);
	  Reporter.log("Basci opreations all scenarios run successfully");

	//Selenium with java to gp back to specific page:
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.history.go(-2)");


	
}



}