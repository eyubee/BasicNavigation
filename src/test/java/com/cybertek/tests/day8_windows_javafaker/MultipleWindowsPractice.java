package com.cybertek.tests.day8_windows_javafaker;

import com.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MultipleWindowsPractice {
    WebDriver driver;
    @BeforeMethod
    public void setupClass(){
        //        TC-6 : Window Handle practice
//        1. Createnewtestandmakesetups
//        2. Goto:https://www.amazon.com
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");


//        Lines to be pasted:
//        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');"); ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');"); ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
//        These lines will simple open new tabs using something called JavaScriptExecut and get those pages. We will learn JavaScriptExecutor later as well.

    }
    @Test (priority = 1)
    public void multiple_windows_test(){
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        //        3. Copypastethelinesfrombelowintoyourclass
//        4. Create a logic to switch to the tab where Etsy.comisopen
//        5. Assert:Titlecontains“Etsy”
        for(String eachWindows: driver.getWindowHandles()){
            driver.switchTo().window(eachWindows);
            System.out.println("title in current page "+driver.getTitle());
           if(driver.getTitle().contains("etsy")){
               Assert.assertTrue(driver.getTitle().contains("etsy"));
               break;

           }
        }
    }
}
