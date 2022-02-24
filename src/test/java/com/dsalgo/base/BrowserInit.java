package com.dsalgo.base;

import org.testng.annotations.Test;

import com.dsalgo.utilities.Login_Excel;

import org.testng.annotations.BeforeClass;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class BrowserInit  {
	public static WebDriver driver=null; 
//	static Properties props;
	//@BeforeTest
	//@Parameters("browser")
		//public static WebDriver startApplication(WebDriver driver,String browsername,String url) 
		public void startApplication(String browser) throws InterruptedException 

	{ 
			//String browsername=props.;
	//System.out.println("url: " + url); 

	if(browser.equalsIgnoreCase("Chrome")) 
	{ 
	System.setProperty("webdriver.chrome.driver", "/Users/nitin/Downloads/Drivers/chromedriver"); 
	driver= new ChromeDriver();
	} 
	else if(browser.equalsIgnoreCase("Safari")) 
	{ 
		
		SafariOptions options = new SafariOptions();
		
		this.driver=new SafariDriver(options);}
		else if(browser.equalsIgnoreCase("Edge"))
		{ 
			System.setProperty("webdriver.edge.driver", "/Users/nitin/Downloads/Drivers/msedgedriver"); 

			 driver = new EdgeDriver();

	//System.setProperty("webdriver.gecko.driver",  "/Users/nitin/Downloads/Drivers/geckodriver"); 
	//driver=new FirefoxDriver();
	}
	//Launch url 
	driver.get("https://dsportalapp.herokuapp.com"); 

	//To maximize the browser 
	driver.manage().window().maximize(); 
	//Reporter.log("Page is scrolled by pixel"); 

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
 Thread.sleep(2000); 

driver.manage().deleteAllCookies();//delete all cookies of current domain
	///return driver;

	} 
	//To Close the Browser 
	public static void quitBrowser(WebDriver driver) 
	{ 
	//driver.close(); 
	//driver.quit(); 
	}
	
	 
		  @BeforeClass
		  public void beforeClass() throws InterruptedException { 
			startApplication("Edge"); 
	  Reporter.log("Welcome to Home page"); 
	  } 

	  @AfterClass 
	  public void afterClass() 
	  { 
	 // quitBrowser(driver);
	  }
}
