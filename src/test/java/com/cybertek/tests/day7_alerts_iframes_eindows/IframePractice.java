package com.cybertek.tests.day7_alerts_iframes_eindows;

import com.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframePractice {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //    TC #4 : Iframe practice
//1. Create a new class called: IframePractice
//2. Create new test and make set ups
//3. Go to: http://practice.cybertekschool.com/iframe
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/iframe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
@Test
    public void iframe_test(){
        //#1 changing to ifram by index: we pass indext number
        driver.switchTo().frame("mce_0_ifr");
        //*2 locate a webelement to swich
    //find and locate <iframe> wen elemnet from the page
   // WebElement iframe= driver.findElement(By.xpath("//iframe[@title='Rich Text Area. Press ALT-0 for help.']"));
//    WebDriverFactory iframe= driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
//    //driver.switchTo().frame(iframe)
    //#3 if iframe tag has id or name attrbute, we can pass its attrbutes value as a string into
    //.switchTo().frame() method directlly
    WebElement yourContactGoesHere= driver.findElement(By.xpath("//p"));
    //4. Assert: “Your content goes here.” Text is displayed.
    Assert.assertTrue(yourContactGoesHere.isDisplayed());
    //driver.switchTo().parentFrame(); both do the same thing
    //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor
    driver.switchTo().defaultContent();
    //locating header as web element
    WebElement headerText= driver.findElement(By.xpath("//h3"));
    Assert.assertTrue(headerText.isEnabled());

}


    @AfterClass
    public void teardownClass() throws InterruptedException{
        Thread.sleep(6000);
        driver.close();
    }

}
