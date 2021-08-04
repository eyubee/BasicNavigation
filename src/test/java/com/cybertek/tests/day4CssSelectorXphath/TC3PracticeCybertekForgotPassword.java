package com.cybertek.tests.day4CssSelectorXphath;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3PracticeCybertekForgotPassword {
    public static void main(String[] args) {
        //        TC #3: PracticeCybertek/ForgotPassword URL verification
//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
//        2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
//        3. Enter any email into input box
       WebElement emailInput= driver.findElement(By.className("label"));
        emailInput.sendKeys("something123@gmail.com");
//        4. Click on Retrieve password
//        5. Verify URL contains:
//        Expected: “email_sent”
//        6. Verify textbox displayed the content as expected.
//                Expected: “Your e-mail’s been sent!”
    }

}
