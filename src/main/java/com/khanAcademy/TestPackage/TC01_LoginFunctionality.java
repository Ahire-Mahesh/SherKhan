package com.khanAcademy.TestPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.khanAcademy.POMPackage.HomePagePOM_Class;
import com.khanAcademy.UtilityPackage.UtilityClass;

public class TC01_LoginFunctionality extends TestBase
{
    @Test
	public void verifyTheLoginFunctionality() throws IOException
	{ 
	  //Validation 
       UtilityClass.takeScreenShot(driver, "HomePage");	
	   HomePagePOM_Class homePage = new HomePagePOM_Class(driver);	
	   String ExpectedText = "Welcome, Mahesh"; 
	   String ActualText = homePage.getTextForSignInValidation();   
	   Assert.assertEquals(ActualText, ExpectedText);  
	}
	
}
