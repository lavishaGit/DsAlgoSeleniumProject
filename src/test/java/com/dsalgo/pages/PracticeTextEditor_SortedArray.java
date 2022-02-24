package com.dsalgo.pages;

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
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public  class PracticeTextEditor_SortedArray {
	//PracticeTextEditor login = new PracticeTextEditor();

	WebDriver driver;
	public PracticeTextEditor_SortedArray(WebDriver driver) {
		
		  this.driver=driver;
		    }
	@FindBy(xpath=("div[@class='CodeMirror-sizer']"))WebElement texttab1;
//	@FindBy(xpath=("//*[@tabindex='0']") )
	//public WebElement texttab1; 
	//@FindBy(xpath=("//pre[@class='CodeMirror-line']"))public WebElement texttab1;
//	@FindBy(css ="textarea")WebElement texttab1;
	//@FindBy(xpath=("//div[@class='CodeMirror cm-s-default']"))WebElement texttab; 
	//@FindBy(name="code") WebElement texttab1; 	
	@FindBy(xpath="//button[@type='button'][@onclick='runit()']") WebElement runbutton; 	
	@FindBy(xpath=("//input[@value='Submit']")) WebElement submit; 	
	//public PracticeTextEditor(WebDriver driver) {
	//	PageFactory.initElements(driver, this);
	//  this.driver=driver;
	//  }
	public void texttab() throws InterruptedException {
		texttab1.click();
		Thread.sleep(1000);
		Reporter.log("text area link is clicked"); 
		
		}public void runbutton() throws InterruptedException {
			Thread.sleep(1000);
			runbutton.click();
			Thread.sleep(1000);
			Reporter.log("run button  is clicked"); 
			
			}public void submit() throws InterruptedException {
				submit.click();
				Thread.sleep(1000);
				Reporter.log("Submit button is clicked"); 
				
				}
			@Test
			public void sortedarray() throws InterruptedException {
				//PracticeTextEditor txtedit=new PracticeTextEditor();
				/* getting codemirror element */
				WebElement codeMirror = driver.findElement(By.className("CodeMirror"));

				/* getting the first line of code inside codemirror and clicking it to bring it in focus */
				WebElement codeLine = codeMirror.findElements(By.className("CodeMirror-line")).get(0);
				codeLine.click();

				/* sending keystokes to textarea once codemirror is in focus */
				WebElement txtbx = codeMirror.findElement(By.cssSelector("textarea"));
				//WebElement txtbx1 = codeMirror.findElement(By.cssSelector("textarea"));

				Actions act = new Actions(driver);
			//	act.moveToElement(texttab1).click().perform();
				////To Select the full Text////
				act.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).build().perform();
				Thread.sleep(1000);
				act.sendKeys(Keys.BACK_SPACE).build().perform();//To delete the selected Text
			//	Thread.sleep(4000);
				//txtbx.sendKeys(code);
				Thread.sleep(1000);
				//txtbx.sendKeys("asaf");
				//Thread.sleep(1000);
				
			//runbutton();
				//codeMirror.click();

				
				Thread.sleep(1000);
				
				txtbx.sendKeys("class Solution(object):\n"
					  +"def checkPossibility(self, nums):\n"
						     +"if len(nums) <=2:\n"
						        +"return True\n"
						      +"ans = False\n"
						      +"for i in range(len(nums)-1):\n"
						        +"if nums[i] > nums[i+1]:\n"
						            +"if ans:\n"
						              +"return False\n"
						          +"else:\n"
						              +"ans = True\n"
						            +"if i>0:\n"
						               +"if nums[i-1] > nums[i+1]: nums[i+1] = nums[i]\n"
						      +"return True\n"
						+"ob1 = Solution()\n"
						+"print(ob1.checkPossibility([4,2,3,5]))\n");
						
				Thread.sleep(2000);
		
				//**************click on hidden element in Selenium WebDriver****************
				
				WebElement element= driver.findElement(By.xpath("//button[@type='button'][@onclick='runit()']"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();",element);
				Reporter.log("Run Button clicked ");
				Thread.sleep(2000);

				Alert alert = driver.switchTo().alert();
				Reporter.log("Inside the Alerts with Accept method");
				Thread.sleep(1000);
				alert.accept(); // To select OK button
				Thread.sleep(2000);
				codeMirror.submit();
				Reporter.log("Submit Button clicked ");
				
			//runbutton.click();//not working giving error elent is intersabble
				
				Thread.sleep(2000);
				//Actions act = new Actions(driver);
				//act.moveToElement(texttab1).click().perform();
				////To Select the full Text////
				act.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).build().perform();
				Thread.sleep(1000);
				act.sendKeys(Keys.BACK_SPACE).build().perform();//To delete the selected Text
				Thread.sleep(2000);
				
				//****************passing invalid code*************************
				Reporter.log("text area link is clicked"); 
				txtbx.sendKeys("= ['Stranger Things', 'S Education', 'Game of Thrones']\n"
					
						+ "    print(\"Nope, 'Dark' not found in the list\")\n"
						+ "");
						
				//WebElement element= driver.findElement(By.xpath("//button[@type='button'][@onclick='runit()']"));
				//JavascriptExecutor executor = (JavascriptExecutor) driver;
					executor.executeScript("arguments[0].click();",element);
					Reporter.log("Run Button clicked ");
					//act.moveToElement(runbutton).click(runbutton).build().perform();
					Thread.sleep(2000);
					
					Alert alert1 = driver.switchTo().alert();
					Reporter.log("Inside the Alerts with Accept method");
					Thread.sleep(1000);
					alert1.accept(); // To select OK button
					Thread.sleep(2000);
					Reporter.log("Alert OK button is selected using the Accept method successsfully");
					codeMirror.submit();
					Reporter.log("Submit Button clicked ");
				
			}	
			@BeforeTest
			public void beforeTest() {
				System.setProperty("webdriver.chrome.driver", "/Users/nitin/Downloads/Drivers/chromedriver");
				driver = new ChromeDriver();
				driver.get("https://dsportalapp.herokuapp.com/question/2");
				driver.manage().window().maximize();
				// Thread.sleep(2000);

			}

			@AfterTest
			public void afterTest() {
				//driver.close();
				Reporter.log("User successfully logged out");
			}

				}