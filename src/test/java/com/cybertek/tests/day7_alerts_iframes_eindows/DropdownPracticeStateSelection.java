package com.cybertek.tests.day7_alerts_iframes_eindows;

import com.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPracticeStateSelection {
    WebDriver driver;
    @BeforeClass
   public void setupClass(){

//TC #2: Selecting state from State dropdown and verifying result 1. Open Chrome browser
//        2. Go to http://practice.cybertekschool.com/dropdown
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @Test
    public void state_selected() throws InterruptedException {
        //locating state dropdown
        Select stateSelected = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //        3. Select Illinois
       stateSelected.selectByVisibleText("Illinois");
       Thread.sleep(4000);
//        4. Select Virginia
         stateSelected.selectByValue("VA");
        Thread.sleep(4000);
//        5. Select California
        //        6. Verify final selected option is California.
//        Use all Select options. (visible text, value, index)
        stateSelected.selectByIndex(5);
        String expectedOption= "California";
        String actualSelectedText= stateSelected.getFirstSelectedOption().getText();

       //Assert.assertTrue(actualSelectedText.equals(expectedOption));
        Assert.assertEquals(actualSelectedText,expectedOption,"only prints when the test fails");


    }
    @AfterClass
    public void teardownClass() throws InterruptedException{
        Thread.sleep(6000);
        driver.close();
    }
}

