package com.cybertek.tests.day4CssSelectorXphath;

import com.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1ForgotPasswordWebElementVerification {
    public static void main(String[] args) throws InterruptedException {
        //        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        2. Go to http://practice.cybertekschool.com/forgot_password
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");
//        3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
//        a. “Home” link
//        b. “Forgot password” header
//        c. “E-mail” text
//        d. E-mail input box
//        e. “Retrieve password” button
//        f. “Powered by Cybertek School” text
        Thread.sleep(3000);
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement  forgotPasswordHdr= driver.findElement(By.tagName("h2"));
        WebElement emailText= driver.findElement(By.cssSelector("label[for='email']"));
        WebElement emailInputBox= driver.findElement(By.cssSelector("input[name='email']"));
        WebElement retrivePassword= driver.findElement(By.cssSelector("button[id='form_submit']"));
        WebElement poweredBy= driver.findElement(By.cssSelector("div[style='text-align: center;']"));

//        4. Verify all WebElements are displayed.
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("forgotPasswordHdr.isDisplayed() = " + forgotPasswordHdr.isDisplayed());
        System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());
        System.out.println("retrivePassword.isDisplayed() = " + retrivePassword.isDisplayed());
        System.out.println("poweredBy.isDisplayed() = " + poweredBy.isDisplayed());
    }
}
