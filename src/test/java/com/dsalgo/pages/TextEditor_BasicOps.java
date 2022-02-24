package com.dsalgo.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TextEditor_BasicOps extends Arraylinks{
	WebDriver driver;
	public TextEditor_BasicOps(WebDriver driver) {
		//	PageFactory.initElements(driver, this);
		  this.driver=driver;
		    }
	 @Test
	  public void TextEditor_BasicOps() throws InterruptedException {
		 	Arraylinks  aarlink = PageFactory.initElements(driver, Arraylinks.class);
	//TextEditor_Arraylist aaraylist  = PageFactory.initElements(driver, TextEditor_Arraylist.class);

			Thread.sleep(1000);

			Reporter.log("Doing Validation for sending Array list code in text editor ");
			//Actions act1= new Actions(driver);
			//act1.moveToElement(aarlink.texttab).click().perform();

			aarlink.texttab.sendKeys("fruits = ['apple', 'banana', 'cherry']\nfruits.insert(1, 'orange')\nprint(fruits)");
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
				aarlink.texttab.sendKeys("Basic operations of array 2344");
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
			act3.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).build().perform();
			Thread.sleep(1000);
			act3.sendKeys(Keys.BACK_SPACE).build().perform();//To delete the selected Text
			Thread.sleep(3000);
			
		}
	 

	  
  
}
