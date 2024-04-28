package com.khanAcademy.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM_Class 
{
  private WebDriver driver;
  
  
 //WebElements
  
//LoginBtn
  @FindBy(xpath="//a[@id='login-or-signup']")
  private WebElement login;
  public void clickOnLogin()
  {
	  login.click();  
  }

//UserName TextBox
  @FindBy(xpath="//*[@id=\"uid-login-form-0-wb-id-identifier-field\"]")
  private WebElement UserName;
  public void enterUserName()
  {
	  UserName.sendKeys("ahiremahesh797@gmail.com"); 
  }

//Password TextBox
  @FindBy(xpath="//*[@id=\"uid-labeled-text-field-1-wb-id-field\"]")
  private WebElement Password;
  public void enterPassword()
  {
	  Password.sendKeys("Mahesh@kpb21"); 
  }
  
//LoginBtn 
  @FindBy(xpath="//*[@id=\"app-shell-root\"]/div/main/div[2]/div/div[3]/section[2]/div/div/form/button")
  private WebElement Login;
  public void clickOnLoginBtn()
  {
	  Login.click(); 
  }
//button[@data-test-id='log-in-submit-button']
  
//Constructor  
 public LoginPagePOM_Class(WebDriver driver)
 {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
 }
 
}
