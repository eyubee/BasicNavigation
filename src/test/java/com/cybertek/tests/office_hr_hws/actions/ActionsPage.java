package com.cybertek.tests.office_hr_hws.actions;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActionsPage {
    public ActionsPage (){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[.='Phones']")
    public WebElement phones;

    @FindBy(xpath = "//a[.='Laptops']")
    public WebElement laptops;

    @FindBy(xpath = "//a[.='Monitors']")
    public WebElement monitors;

    @FindBy(xpath = "//a[.='Sony vaio i5']")
    public WebElement sonyVaioI5;

    @FindBy(xpath = "//a[.='Add to cart']")
    public WebElement addToCart;

    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    public WebElement HomePage;

    @FindBy(xpath = "//a[.='Samsung galaxy s6']")
    public WebElement galaxy6;


    @FindBy(xpath = "//a[.='Apple monitor 24']")
    public WebElement appleMonitor24;


    @FindBy(xpath = "//a[.='Cart']")
    public WebElement shoppingCart;


    @FindBy(xpath = " //div[@class='table-responsive']//td[.='Apple monitor 24']/..//a[.='Delete']")
    public WebElement deletingAppleMonitor;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    public WebElement placeOrder;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "card")
    public WebElement card;

    @FindBy(id = "month")
    public WebElement month;

    @FindBy(id = "year")
    public WebElement year;

    @FindBy(xpath = "//button[.='Purchase']")
    public WebElement purchase;

    @FindBy(xpath = "//p[@class='lead text-muted ']")
    public WebElement purchaseComformation;

    @FindBy(xpath = "//button[.='OK']")
    public WebElement okButton;



}
