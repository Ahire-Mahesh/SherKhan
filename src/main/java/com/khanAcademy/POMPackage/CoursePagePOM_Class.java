package com.khanAcademy.POMPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePagePOM_Class 
{
  private WebDriver driver;
  private Actions act;
  
//WebElements 
  
//CourseBtn
  @FindBy(xpath="//div[@class='_1c8t70d']")
  private WebElement Course;
  public void clickOnCourse()
  {
	  Course.click();  
  }
  
//Class1
  @FindBy(xpath="//a[@aria-label='Class 1']")
  private WebElement Class1;
  public void selectClass1()
  {
	  Class1.click();
  }
  
//GetStarted
  @FindBy(xpath="//a[@class='_1rhl3qm4']")
  private WebElement GetStarted;
  public void clickOnGetStarted()
  {
	  GetStarted.click();  
  }
 
//Start
  @FindBy(xpath="//a[@class='_1lrvdlvw']")
  private WebElement Start;
  public void clickOnStart()
  {
	  Start.click(); 
  }
 
//Drag and Drop
  @FindBy(xpath="//div[@class='card stack']")
  private WebElement Source;
  @FindBy(xpath="//div[@class='perseus-clearfix draggable-box']")
  private WebElement Destination;
  public void dragFromSourceAndDropInDestination() throws InterruptedException
  {
	 for(int i=0; i<=7; i++) 
	 {
	   if(i<=6)
	   {
	    act.dragAndDrop(Source, Destination).perform();
	    Thread.sleep(1000);
	   }
	   else
	   {
	  for(int j=0; j<=13; j++)
	  {
		  WebElement rev=driver.findElement(By.xpath("(//div[@style='width: 50px;'])[1]"));	  
		  act.dragAndDrop(rev, Source).perform();
		  Thread.sleep(1000);  
	  }
	 }
	 }
  }
  
//Check
  @FindBy(xpath="//span[@class='_1alfwn7n']")
  private WebElement Check;
  public void clickOnCheck()
  {
	  Check.click();  
  }

  
//Constructor
  
  public CoursePagePOM_Class(WebDriver driver)
  {
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
	  
	  act = new Actions(driver);
  }
  
}
