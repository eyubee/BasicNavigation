package com.cybertek.tests.office_hr_hws.homework2;

import com.utilities.BrowserUtils;
import com.utilities.Driver;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;

public class Homework2Object {
    @Test
    public void zero_bank_test(){
//        1. The user navigates to the login page: http://zero.webappsecurity.com/login.html
        Driver.getDriver().get("http://zero.webappsecurity.com/login.html");
//        2. The user logs in with the user "username" and the password "password"
        ZeroBankPage zeroBank= new ZeroBankPage();
        zeroBank.pageUserName.sendKeys("username");
        zeroBank.pagePassword.sendKeys("password");
        zeroBank.signInButton.click();
        zeroBank.advanceButton.click();
        zeroBank.proceedLink.click();
//        3. The user navigates to Account Activity page
zeroBank.accountActivity.click();
//        4. Then The page should have the title "Zero - Account Activity"
        String expectedTitle= "Zero - Account Activity";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "titles aren't the same");
//        5. Then Account drop down should have the following options :
//        (Savings, Checking, Savings, Loan, Credit Card, Brokerage)
//        6. Brokerage option should have "No results.
        Select dropsrownSelect= new Select(zeroBank.accountDropdown);
        dropsrownSelect.selectByVisibleText("Brokerage");

        String expectedValue= "No results.";
        String actualValue= zeroBank.brokerageResult.getText();
        Assert.assertEquals(actualValue,expectedValue);
        List <WebElement> allElements = dropsrownSelect.getOptions();
       for(WebElement each: allElements){
           System.out.println(each.getText());
       }
    }
}
