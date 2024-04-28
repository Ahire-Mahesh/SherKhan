package com.khanAcademy.TestPackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.khanAcademy.POMPackage.HomePagePOM_Class;
import com.khanAcademy.POMPackage.LoginPagePOM_Class;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
  WebDriver driver;
  ChromeOptions options;

  Logger log = Logger.getLogger("17_KhanAcademy");
  
  
//  @Parameters("BrowserName")
  @BeforeMethod
  public void setUp() throws InterruptedException
  {
	  WebDriverManager.chromedriver().setup();
	  
//	if(BrowserName.endsWith("chrome"))
//	{	  
	  driver = new ChromeDriver();	
//	}
//	else
//	{
//	  driver = new FirefoxDriver();	
//	}
		
	
	PropertyConfigurator.configure("log4j.properties");
 
	
//	//disable browser notifications  
//	options = new ChromeOptions();
//	options.addArguments("--disable-notifications");
//   // Launch the browser
//	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//    driver = new ChromeDriver(options);
//    driver.manage().window().maximize();
//    System.out.println("- Browser is Open and Maximized"); 
//	}
//	else
//	{
//	System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
//    driver = new FirefoxDriver();
//	driver.manage().window().maximize();
//    System.out.println("- Browser is Open and Maximized"); 	
//    }
//	
//	// Implicit waits
	
	
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);   	 
	driver.get("https://www.khanacademy.org/");log.info("- URL is Open");
	
	LoginPagePOM_Class login = new LoginPagePOM_Class(driver);
	login.clickOnLogin();log.info("- Clicke on Login");
	login.enterUserName();log.info("- User Name entered");
	login.enterPassword();log.info("- Password entered");
	login.clickOnLoginBtn();log.info("- Clicked on Log In \n- Went on Home Page");
	Thread.sleep(5000);
    
  }
 
 @AfterMethod 
 public void logOut()
 {
//   HomePagePOM_Class logout = new HomePagePOM_Class(driver);
//   logout.clickOnUserName();System.out.println("- Clicked on User Name");
//   logout.clickOnLogOut();System.out.println("- Clicked on Logout");	
  
   driver.quit();log.info("- Browser Closeed \n ");
  
 }
 
}
 

