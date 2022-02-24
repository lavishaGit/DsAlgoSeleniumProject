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

public  class PracticeTextEditor_Maxones {
	//PracticeTextEditor login = new PracticeTextEditor();

	WebDriver driver;

	public PracticeTextEditor_Maxones (WebDriver driver) {
		
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
			public void maxone() throws InterruptedException {
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

				//act.moveToElement(runbutton).click().perform();
			//	codeMirror.sendKeys(Keys.RETURN);
			//	Thread.sleep(1000);
			//	codeMirror.submit();
			//	Thread.sleep(1000);
			//	act.keyDown(Keys.COMMAND).build().perform();
			//	act.sendKeys(Keys.BACK_SPACE).build().perform();
				Thread.sleep(1000);
				//codeLine.click();
				//Thread.sleep(2000);
				//aarlink.texttab.sendKeys("#include <iostream>\n" + "\n" + "int main() {\n"
					//	+ "    std::cout << \"Hello World!\";\n" + "    return 0;\n" + "}");
				txtbx.sendKeys("\n"
						+ "class Solution(object):\n"
						+ "def findMaxConsecutiveOnes(self, nums):\n"
						+ "\"\"\"\n"
						+ ":type nums: List[int]\n"
						+ ":rtype: int\n"
						+ " \"\"\"\n"
						+ "result, local_max = 0, 0\n"
						+ "for n in nums:\n"
						+ "local_max = (local_max + 1 if n else 0)\n"
						+ "result = max(result, local_max)\n"
						+ "return result\n"
						+ "print(result)");
						
						
				Thread.sleep(2000);
			//	codeMirror.click();
			
			
			//codeMirror.sendKeys(Keys.ENTER);
				
				//**************click on hidden element in Selenium WebDriver****************
				
				WebElement element= driver.findElement(By.xpath("//button[@type='button'][@onclick='runit()']"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();",element);
				Reporter.log("Run Button clicked ");
				//act.moveToElement(runbutton).click(runbutton).build().perform();
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
					
					Alert alert = driver.switchTo().alert();
					Reporter.log("Inside the Alerts with Accept method");
					Thread.sleep(1000);
					alert.accept(); // To select OK button
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