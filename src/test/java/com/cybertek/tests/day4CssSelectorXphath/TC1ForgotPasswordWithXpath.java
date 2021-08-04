package com.cybertek.tests.day4CssSelectorXphath;

import com.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1ForgotPasswordWithXpath {
    public static void main(String[] args) {
//        1. Open Chrome browser
        WebDriver drive= WebDriverFactory.getDriver("chrome");
//        2. Go to http://practice.cybertekschool.com/forgot_password
        drive.get("http://practice.cybertekschool.com/forgot_password");
//        3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
    //    a. “Home” link
//        b. “Forgot password” header
//        c. “E-mail” text
//        d. E-mail input box
//        e. “Retrieve password” button
//        f. “Powered by Cybertek School” text
        WebElement homeLink= drive.findElement(By.xpath("//a[@class='nav-link']"));
        WebElement forgotPassword= drive.findElement(By.xpath("//h2['Forgot Password']"));
        WebElement emailTest= drive.findElement(By.xpath("//label[@for='email']"));
        WebElement emailInputbox= drive.findElement(By.xpath("//input[@type='text']"));
        WebElement retrivePasswordButton= drive.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));
        WebElement powerByText = drive.findElement(By.xpath("//div[@style='text-align: center;']"));
//        4. Verify all WebElements are displayed.
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("forgotPassword.isDisplayed() = " + forgotPassword.isDisplayed());
        System.out.println("emailTest.isDisplayed() = " + emailTest.isDisplayed());
        System.out.println("emailInputbox.isDisplayed() = " + emailInputbox.isDisplayed());
        System.out.println("retrivePasswordButton.isDisplayed() = " + retrivePasswordButton.isDisplayed());
        System.out.println("powerByText.isDisplayed() = " + powerByText.isDisplayed());
    }
}
