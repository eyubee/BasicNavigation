package com.cybertek.tests.day7_alerts_iframes_eindows;

import com.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowPractice {
    WebDriver driver;
    @BeforeClass
    public void setupClass(){
        //    TC # : Window Handle practice
//1. Create a new class called: WindowHandlePractice
//2. Create new test and make set ups
//3. Go to : http://practice.cybertekschool.com/windows

    driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/windows");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
@Test
    public void window_test(){
// 4. Assert: Title is “Practice”
    String actualTitleBeforeClick= driver.getTitle();
    String expectedTitleBeforeClick= "Practice";
    System.out.println("actual title before click"+actualTitleBeforeClick);
    Assert.assertTrue(actualTitleBeforeClick.equals(expectedTitleBeforeClick));
// 5. Click to: “Click Here” text
    WebElement clickHereLink= driver.findElement(By.linkText("Click Here"));
    clickHereLink.click();
    String mainHandle= driver.getWindowHandle();
    for(String each: driver.getWindowHandles()){
        driver.switchTo().window(each);
        System.out.println("current title while switching = " + driver.getTitle());

    }
    //printing out the window handle of the irst page opened
    //storing the first windowhandle inro a string is a usefully practice for future needs when we need to switch back to it
    System.out.println("main Handle = " + mainHandle);
    String actualTitleAfterClick= driver.getTitle();
    System.out.println("actual Title After Click = " + actualTitleAfterClick);

//6. Switch to new Window.
//7. Assert: Title is “New Window”
}
    @AfterClass
    public void teardownClass() throws InterruptedException{
        Thread.sleep(6000);
        driver.close();
    }
}
