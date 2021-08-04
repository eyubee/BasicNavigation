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

public class DropdownPracticeDateSelection {
    WebDriver driver;
    @BeforeClass
    public void setupClass(){
        //        TC #3: Selecting date on dropdown and verifying
//        1. Open Chrome browser
//        2. Go to http://practice.cybertekschool.com/dropdown
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void selecting_Date() throws InterruptedException {
//        Select “December 1 , 1922” and verify it is selected.
//         Select year using  : visible text
//         Select month using  : value attribute
//         Select day using   : index number
        Select yearSelector= new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthSelector= new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select daySelected= new Select(driver.findElement(By.xpath("//select[@id='day']")));
Thread.sleep(1000);

        yearSelector.selectByVisibleText("1922");
  String currentSelectedYearText= yearSelector.getFirstSelectedOption().getText();
  String expectedYearText="1922";
Assert.assertEquals(currentSelectedYearText,expectedYearText);
        Thread.sleep(1000);
            monthSelector.selectByValue("11");
            String crrrentSelectedMonth= monthSelector.getFirstSelectedOption().getText();
            String expectedMonth= "December";
            Assert.assertEquals(crrrentSelectedMonth,expectedMonth);
        Thread.sleep(1000);
            daySelected.selectByIndex(0);
            String currentDay= daySelected.getFirstSelectedOption().getText();
            String expectedDay= "1";
            Assert.assertEquals(currentDay, expectedDay);
        Thread.sleep(1000);
    }
    @AfterClass
    public void teardownClass() throws InterruptedException{
        Thread.sleep(6000);
        driver.close();
    }
}
