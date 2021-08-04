package com.cybertek.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoad1Page {
    public DynamicLoad1Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//button[.='Start']")
    public WebElement startButton;

    @FindBy( id= "loading")
    public WebElement loadingBar;

    @FindBy (id = "username")
    public WebElement username;

    @FindBy(id = "pwd")
    public WebElement pagePassword;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy( id = "flash")
    public WebElement errorMessage;

}
