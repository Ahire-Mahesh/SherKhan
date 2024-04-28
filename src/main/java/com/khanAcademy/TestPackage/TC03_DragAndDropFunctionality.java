package com.khanAcademy.TestPackage;


import java.io.IOException;

import org.testng.annotations.Test;

import com.khanAcademy.POMPackage.CoursePagePOM_Class;
import com.khanAcademy.UtilityPackage.UtilityClass;

public class TC03_DragAndDropFunctionality extends TestBase
{
  @Test
  public void verifyTheDragAndDropFunctionality() throws InterruptedException, IOException
  {
	  CoursePagePOM_Class cp = new CoursePagePOM_Class(driver);
	  
	  cp.clickOnCourse();System.out.println("- Clicked on Course");
	  Thread.sleep(1000);
	  cp.selectClass1();System.out.println("- Class 1 selected");
	  cp.clickOnGetStarted();System.out.println("- Clicked on Get Started");
	  cp.clickOnStart();System.out.println("- Clicked on Start");
	  Thread.sleep(5000);
	  cp.dragFromSourceAndDropInDestination();
	  System.out.println("- Draged 7 items from source and Dropped into Destination one by one");
	  UtilityClass.takeScreenShot(driver, "Draged and Dropped");
//	  cp.clickOnCheck();
	  
	  
   }
  
	
}
