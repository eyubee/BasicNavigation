package com.cybertek.tests.day7_alerts_iframes_eindows;

import com.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertPractices {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //        TC #1: Information alert practice
//        1. Open browser
//        2. Go to website: http://practice.cybertekschool.com/javascript_alerts
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
@Test
        public void JS_Alart (){

    //locating the button for the alart
            WebElement informationAlartButton= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
    //        3. Click to “Click for JS Alert” button
    informationAlartButton.click();
    //switch drivers's fucus to alart, so we can handle it
    Alert alert= driver.switchTo().alert();
//        4. Click to OK button from the alert
    alert.accept();
//        5. Verify “You successfuly clicked an alert” text is displayed.
    WebElement resultText= driver.findElement(By.xpath("//p[@id='result']"));
    Assert.assertTrue(resultText.isDisplayed(),"Result text isn't displayed on the page");
        }

    @AfterClass
    public void teardownClass() throws InterruptedException{
        Thread.sleep(6000);
        driver.close();
    }
}
