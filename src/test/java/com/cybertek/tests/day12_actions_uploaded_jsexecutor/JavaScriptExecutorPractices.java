package com.cybertek.tests.day12_actions_uploaded_jsexecutor;

import com.utilities.BrowserUtils;
import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutorPractices {
    @Test
    public void scroll_using_jsexecutor_test1(){
        //get the page: http://practice.cybertekschool.com/infinite_scroll
        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");
        //down casting our driver type to javascriptexecutor so we can reach methods in this interface

        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        //using js we reach executescript method so we are allowed to pass javascript functions
        //this methods is capable of accepting javascript functions ad apply that into our selenium code
        for(int i=0; i < 10; i++){
            BrowserUtils.sleep(2);
            //scroll down 750 pixels
            js.executeScript("window.scrollBy(0,750)");
        }
        // scoll up 750 pixled
        js.executeScript("window.scrollBy(0,-750)");

    }
    @Test
    public void scroll_using_jsExcutor_test2(){
        //go to this page  http://practice.cybertekschool.com/large
        Driver.getDriver().get("http://practice.cybertekschool.com/large");
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        //task move down till power by then up till we get to home ..locating the powered by element
        WebElement cyberteckSchoolLink= Driver.getDriver().findElement(By.linkText("Cybertek School"));
        WebElement homelLink= Driver.getDriver().findElement(By.linkText("Home"));
        //use js.executor with different scrolling javascript funcations
        //scrol down to cybertekschool link
        js.executeScript("arguments[0].scrollIntoView(true)", cyberteckSchoolLink);
        //scroll up to home link
        BrowserUtils.sleep(2);
js.executeScript("arguments[0].scrollIntoView(true)", homelLink);
    }
}
