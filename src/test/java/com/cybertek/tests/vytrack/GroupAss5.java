package com.cybertek.tests.vytrack;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class GroupAss5 {
  public  GroupAss5(){
      PageFactory.initElements(Driver.getDriver(), this);
  }
  @FindBy(id = "prependedInput")
      //username = //input[@placeholder='Username or Email']
      public WebElement inputUserName;
@FindBy(id = "prependedInput2")
    //input[@id='prependedInput2']
    public WebElement inputPassword;
@FindBy(id = "_submit")
    public WebElement loginButton;
@FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleetDropDown;
@FindBy (linkText = "Vehicles")
    public WebElement fleetVehicles;
@FindBy(xpath = "//a[@title='Reset']")
    public WebElement resetButton;
@FindBy (xpath = "//span[.='Driver']")
    public WebElement driverFilter;
}
