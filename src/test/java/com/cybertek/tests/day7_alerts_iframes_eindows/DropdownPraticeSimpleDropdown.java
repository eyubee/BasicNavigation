package com.cybertek.tests.day7_alerts_iframes_eindows;

import com.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class DropdownPraticeSimpleDropdown {
    WebDriver driver;
    @BeforeClass
   public void setupClass(){
        //    TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
//    1. Open Chrome browser
       driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @Test
    public void tc1_simple_dropdown_test(){
  //      3. Verify “Simple dropdown” default selected value is correct
//    Expected: “Please select an option”
        //WebElement actual= driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentlySelected= simpleDropdown.getFirstSelectedOption();
        String actualTextCurrentOption= currentlySelected.getText();
        String expectedSelectedOption= "Please select an option";
        Assert.assertTrue(actualTextCurrentOption.equals(expectedSelectedOption));
        }
        @Test
    public void tc1_state_selection_test(){
            //            4. Verify “State selection” default selected value is correct
//    Expected: “Select a State”
            Select stateSelection= new Select(driver.findElement(By.xpath("//select[@id='state']")));
            WebElement currentlyDefultState= stateSelection.getFirstSelectedOption();
            String actualDefultStateText= currentlyDefultState.getText();
            String expectedDefultStateText= "Select a State";
            Assert.assertTrue(actualDefultStateText.equals(expectedDefultStateText));
        }

@AfterClass
    public void teardownClass(){
        driver.close();
}
}


