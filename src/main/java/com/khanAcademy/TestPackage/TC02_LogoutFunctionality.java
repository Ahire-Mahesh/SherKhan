package com.khanAcademy.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.khanAcademy.POMPackage.HomePagePOM_Class;

public class TC02_LogoutFunctionality extends TestBase
{
  @Test
  public void verifyTheLogoutFunctionality() throws InterruptedException
  {
	  HomePagePOM_Class logout = new HomePagePOM_Class(driver);
	  logout.clickOnUserName();System.out.println("- Clicked on User Name");
	  logout.clickOnLogOut();System.out.println("- Clicked on Logout");
	  Thread.sleep(3000);
	  
	  //Validation :-
	  String ExpectedText = "Login\n"
	  		+ "Good to see you again!\n"
	  		+ "By logging into Khan Academy, you agree to our Terms of use and Privacy Policy.";
	  
	  String ActualText = logout.getTextOfLoginPahe();
	  
	  Assert.assertEquals(ActualText, ExpectedText);
  }
}
