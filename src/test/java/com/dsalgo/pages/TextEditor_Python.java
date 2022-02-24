package com.dsalgo.pages;

import org.testng.annotations.Test;

import com.dsalgo.testcases.Array_PageValidation;

import org.testng.annotations.BeforeClass;

import javax.swing.text.Document;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TextEditor_Python extends Arraylinks{
	WebDriver driver;

	//@FindBy(xpath=("//*[@tabindex='0']") )
	//public WebElement texttab; 
	//@FindBy(xpath=("//button[@type='button']"))public WebElement runbutton;

	
	//public void runbutton() throws InterruptedException {
		
	//	runbutton.click();
	//	Thread.sleep(3000);
	//	Reporter.log("Run button is clicked"); 
	
		
 // }
//

//@Test
	// initialize the driver using initElements inside the constructor
	public TextEditor_Python(WebDriver driver) {
	//	PageFactory.initElements(driver, this);
	  this.driver=driver;
	    }
	//@Test(priority=0)
  public void TextEditorPython_Validation() throws InterruptedException {

		//TextEditor_Python aarlink  = PageFactory.initElements(driver, TextEditor_Python.class);


		Arraylinks  aarlink = PageFactory.initElements(driver, Arraylinks.class);

	  //public void TextEditor() throws InterruptedException {	

		Thread.sleep(1000);
	aarlink.texttab.sendKeys("cars = ['Ford', 'Volvo', 'BMW']\nprint(cars)\nx = len(cars)\nprint(x)");
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
			Thread.sleep(2000);
			
			Reporter.log("Alert OK button is selected using the Accept method successsfully");
			Reporter.log("Array in phython code is here"); 
		//********* Passing AlfaNumeric value in TextArea***********
			aarlink.texttab.sendKeys("cars123");
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
		// new
		// WebDriverWa.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@tabindex='0']"))).click();
		// ((JavascriptExecutor)driver).executeScript("window.focus()");
		
		/*
		   for(int i=0; i<string_length ;i++) {
		   ac.sendKeys(Keys.BACK_SPACE)or(Keys.DELETE); } ac.sendKeys(Keys.COMMAND)
		   .sendKeys("a") .keyUp(Keys.CONTROL)
		 */
		// ac.sendKeys(Keys.chord(Keys.CONTROL, "a"));

		//Used action class to put focus back on textarea
		/*Actions acts3 = new Actions(driver);
		acts3.moveToElement(texttab).click().perform();
		////To Select the full Text////
		acts3.keyDown(Keys.COMMAND).build().perform();
		Thread.sleep(1000);
		acts3.sendKeys(Keys.BACK_SPACE).build().perform();//To delete the selected Text
		Thread.sleep(1000);*/
		
		

		//********* Passing null value in TextArea***********
		aarlink.texttab.sendKeys(" ");
		Thread.sleep(1000);
		aarlink.runbutton();
		Reporter.log("Run Button clicked ");
		Thread.sleep(1000);
		Reporter.log("no Alert OK button clicked as we are passing null value ");

	
		
		
		//*************Passing Non-Python Code**************** 
		//Actions act = new Actions(driver);
		act.moveToElement(aarlink.texttab).click().perform();
		aarlink.texttab.sendKeys("#include <iostream>\n" + "\n" + "int main() {\n"
				+ "    std::cout << \"Hello World!\";\n" + "    return 0;\n" + "}");

		Thread.sleep(1000);
		Reporter.log("Code is written in the editor form");

		aarlink.runbutton();
		Reporter.log("Run Button clicked ");
		Thread.sleep(1000);

//driver.switchTo().
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(1000);
		alert2.accept(); // To select OK button
		Thread.sleep(2000);
		Reporter.log("Alert OK button is selected using the Accept method successsfully");
		Actions act3= new Actions(driver);
		act3.moveToElement(aarlink.texttab).click().perform();
		////To Select the full Text////
		acts.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).build().perform();
		Thread.sleep(1000);
		act3.sendKeys(Keys.BACK_SPACE).build().perform();//To delete the selected Text
		Thread.sleep(1000);
		//TextEditorArrayList_Validation() ;
		// new
		// new
		// WebDriverWa.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@tabi
		// ac.sendKeys(Keys.BACK_SPACE);
		// Arraylinks aarlink=PageFactory.initElements(driver, Arraylinks .class);
		// Thread.sleep(2000);
		// driver.switchTo().defaultContent();
//driver.findElement(By.xpath("//*[@tabindex='0']")).clear();

// aarlink.texttab.clear();
		
//aarlink.texttab.sendKeys(Keys.BACK_SPACE);

		// Calling the dismiss method
		// AlertsexercisewithDismiss();
	}

	/*@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "/Users/nitin/Downloads/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
		driver.manage().window().maximize();
		// Thread.sleep(2000);

	}

	@AfterTest
	public void afterTest() {
		//driver.close();
		Reporter.log("User successfully logged out");
	}*/

}
