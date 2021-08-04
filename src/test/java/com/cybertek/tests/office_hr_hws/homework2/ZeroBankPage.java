package com.cybertek.tests.office_hr_hws.homework2;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZeroBankPage {
   public  ZeroBankPage(){
       PageFactory.initElements(Driver.getDriver(), this);
    }
@FindBy(id = "user_login")
    public WebElement pageUserName;

   @FindBy(id= "user_password")
    public WebElement pagePassword;

   @FindBy (xpath = "//input[@class='btn btn-primary']")
    public WebElement signInButton;

   @FindBy(id= "details-button")
    public WebElement advanceButton;

   @FindBy(id= "proceed-link")
    public WebElement proceedLink;

   @FindBy(linkText = "Account Activity")
    public WebElement accountActivity;

@FindBy(xpath = "(//a[.='Savings'])[1]")
    public WebElement saving1;

@FindBy(xpath = "(//a[.='Savings'])[2]")
    public WebElement saving2;

    @FindBy(xpath = "//a[.='Brokerage']")
    public WebElement brokerage;

    @FindBy(xpath = "//a[.='Checking']")
    public WebElement checking;

    @FindBy(xpath = "//a[.='Credit Card']")
    public WebElement creditCard;

    @FindBy(xpath = "//div [@class='well']")
    public WebElement brokerageResult;

    @FindBy(id = "account_summary_tab")
    public WebElement accountSummaryPage;
    @FindBy(id= "aa_accountId")
    public WebElement accountDropdown;

}
