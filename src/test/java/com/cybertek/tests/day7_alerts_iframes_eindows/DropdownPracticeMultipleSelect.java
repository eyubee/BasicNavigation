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

import java.util.List;

public class DropdownPracticeMultipleSelect {
    WebDriver driver;
    @BeforeClass
public void setupClass() throws InterruptedException {
//TC #4: Selecting value from multiple select dropdown
//        1. Open Chrome browser
//        2. Go to http://practice.cybertekschool.com/dropdown
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");


    }
    @Test
    public void multipleSelection() throws InterruptedException {
        //        3. Select all the options from multiple select dropdown.
        Select  seimpleDropdown= new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
//        Select yearOfBirth = new Select(driver.findElement(By.xpath("//select[@id='year']")));
//        Select stateSelection= new Select(driver.findElement(By.xpath("//select[@id='state']")));
   Select progrLanguages= new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
//        Select website= new Select(driver.findElement(By.xpath("//a[@href='https://www.yahoo.com/']")));

        List<WebElement> simpleDropdownOptions= seimpleDropdown.getOptions();
        List <WebElement> programLanguageOptions= progrLanguages.getOptions();
        for(WebElement each: simpleDropdownOptions){
            Thread.sleep(500);
            each.click();

//        4. Print out all selected values.
            System.out.println("simple dropdown slection options = "+each.getText());
            //verfiy each option is selected
            Assert.assertTrue(each.isSelected(),"option"+ each.getText()+"isn't selected!");
        }
        for(WebElement eachProgram: programLanguageOptions){
            Thread.sleep(300);
            eachProgram.click();
            Assert.assertTrue(eachProgram.isSelected());
        }
progrLanguages.deselectAll();
        for(WebElement eachProgram: programLanguageOptions){
            Assert.assertFalse(eachProgram.isSelected());
        }

//        5. Deselect all values.
//        seimpleDropdown.deselectAll();
//
//        for (WebElement each : simpleDropdownOptions){
//           Assert.assertFalse(each.isSelected(),"isn't selected"+ each.getText()+"is still selected");
//        }


    }
    @Test
    public void TC5() throws InterruptedException{
//        Action action= new Action();
//        TC #5: Selecting value from non-select dropdown
//        1. Open Chrome browser
//        2. Go to http://practice.cybertekschool.com/dropdown
//        3. Click to non-select dropdown
WebElement nonSelectDropdowns= driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        Thread.sleep(3000);
 nonSelectDropdowns.click();
////        4. Select Facebook from dropdown
//
  WebElement facebookLink= driver.findElement(By.xpath("//a[@href='https://www.facebook.com/']"));
 facebookLink.click();

//        5. Verify title is “Facebook - Log In or Sign Up”
        String actualTitle= driver.getTitle();
        String excpectedTitle= "Facebook - Log In or Sign Up";
        Assert.assertTrue(actualTitle.equals(excpectedTitle));
       WebElement test=  driver.findElement(By.id("username"));

    }
    @AfterClass
    public void teardownClass() throws InterruptedException{
        Thread.sleep(6000);
        driver.close();
    }
}
