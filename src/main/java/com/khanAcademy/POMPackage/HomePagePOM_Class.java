package com.khanAcademy.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOM_Class 
{
  private WebDriver driver;
  
  
// WebElements 
  
//GetText LoginValidation
  @FindBy(xpath="//h2[@class='_azwfqqs']")
  private WebElement LoginText;
  public String getTextForSignInValidation()
  {
	 String ActualText = LoginText.getText();
	 return ActualText;	 
  }
  
  
//User Name 
  @FindBy(xpath="//button[@aria-label='Mahesh']")
  private WebElement UserName;
  public void clickOnUserName()
  {
	  UserName.click(); 
  }
  
//Logout
  @FindBy(xpath="//span[text()='Log out']")
  private WebElement LogOut;
  public void clickOnLogOut()
  {
	  LogOut.click();  
  }
  
//GetText of Login page for logout validation
  @FindBy(xpath="//section[@class='_11tqpu9b']")
  private WebElement LoginPage;
  public String getTextOfLoginPahe()
  {
	String ActualText = LoginPage.getText(); 
	return ActualText;
  }
  
  
  
//Constructor 
 public HomePagePOM_Class(WebDriver driver)
 {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
 }  
    
	
}
