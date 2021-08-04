package com.cybertek.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {
    //1. create constructor and initialize driver and object of the class
    //this key word is pointing to the instance of the object of the class
    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="inputEmail")
    public WebElement inputEmail;

    @FindBy(id= "inputPassword")
    public WebElement inputPassword;

    @FindBy (xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
    public WebElement signInButton;
    //for when user enetrs invalid email type
    @FindBy (id= "inputEmail-error")
    public WebElement invaliedEmailFormateError;

    //appears when user enters invalid email or password
    @FindBy (id = "inputEmail-error")
    public WebElement emailFormatError;

    @FindBy(xpath = "//div[@role= 'alert']")
    public WebElement wrongEmailOrPasswordError;



}
