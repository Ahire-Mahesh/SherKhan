package com.khanAcademy.UtilityPackage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{

	public static void takeScreenShot(WebDriver driver, String name) throws IOException
	{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH-mm-ss");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destin = new File("./ScreenShots/"+name+sdf.format(d)+".jpg");
		FileHandler.copy(source, destin);	
	}
	
}
