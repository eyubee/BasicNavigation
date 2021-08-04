package com.cybertek.tests.office_hr_hws.homework1;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homework1Page {
    public Homework1Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "//a[@class='newUser green']")
    public WebElement homePageJoinButton;
    @FindBy(id= "title")
    public WebElement regisTitle;
    @FindBy(id= "forename")
    public WebElement firstName;
    @FindBy(xpath = "//input[@name='map(lastName)']")
    public WebElement surName;
    @FindBy(name= "map(terms)")
    public WebElement tickBox;
    @FindBy(id= "form")
    public WebElement regisJoinNow;
    @FindBy(xpath = "//label[@for='dob']")
    public WebElement DOBError;
}
