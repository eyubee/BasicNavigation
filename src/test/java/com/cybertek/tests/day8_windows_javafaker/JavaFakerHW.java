package com.cybertek.tests.day8_windows_javafaker;

import com.github.javafaker.Faker;
import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaFakerHW {
    @Test
    public void TC6_JavaFaker(){
        //  1.Open browser
        //  2.Go to website: http://practice.cybertekschool.com/registration_form
        Driver.getDriver().get("http://practice.cybertekschool.com/registration_form");
        Faker fake= new Faker();
        //  3.Enter first name
        WebElement firstName= Driver.getDriver().findElement(By.xpath("//input[@placeholder='first name']"));
        firstName.sendKeys(fake.name().firstName());
        //  4.Enter last name
        WebElement lastName= Driver.getDriver().findElement(By.xpath("//input[@placeholder='last name']"));
        lastName.sendKeys(fake.name().lastName());
        //  5.Enter username
        WebElement userName= Driver.getDriver().findElement(By.xpath("//input[@placeholder='username']"));
        userName.sendKeys(fake.name().username().replace(".",""));
        //  6.Enter email address
        WebElement emailAddress= Driver.getDriver().findElement(By.xpath("//input[@placeholder='email@email.com']"));
        emailAddress.sendKeys(fake.internet().emailAddress());
        //  7.Enter password
        WebElement password= Driver.getDriver().findElement(By.xpath("//input[@data-bv-field='password']"));
        password.sendKeys(fake.internet().password());
        //  8.Enter phone number
        WebElement phoneNumber= Driver.getDriver().findElement(By.xpath("//input[@placeholder='571-000-0000']"));
        phoneNumber.sendKeys(fake.phoneNumber().cellPhone().replace("(","").replace("(","-"));

        //  9.Select a gender from radio buttons
        WebElement gender= Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        gender.click();
        //  10.Enter date of birth
        WebElement dateOfBirth= Driver.getDriver().findElement(By.xpath("//input[@placeholder='MM/DD/YYYY']"));
        dateOfBirth.sendKeys("03/20/1980");
        //  11.Select Department/Office
        WebElement departmentOrOffice= Driver.getDriver().findElement(By.xpath("//select[@name='department']"));
        Select departmentSelector= new Select(departmentOrOffice);
        departmentSelector.selectByValue("DE");
        //  12.Select Job Title
        WebElement jobTitile= Driver.getDriver().findElement(By.xpath("//select[@name='job_title']"));
        Select jobTitleSelector  = new Select(jobTitile);
        jobTitleSelector.selectByVisibleText("SDET");
        //  13.Select programming language from checkboxes
        WebElement selectProgrammingLanguage= Driver.getDriver().findElement(By.xpath("//div//label[@for='inlineCheckbox2']"));
        selectProgrammingLanguage.click();
        //  14.Clickto sign up button
        WebElement signUpButton= Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        signUpButton.click();
        //  15.Verify success message “You’ve successfully completed registration.”is displayed.
        WebElement successMessage= Driver.getDriver().findElement(By.xpath("//p"));
        String successMessageTextActual= successMessage.getText();
        String expectedText= "You've successfully completed registration!";
        Assert.assertEquals(successMessageTextActual,expectedText);
    }
}

