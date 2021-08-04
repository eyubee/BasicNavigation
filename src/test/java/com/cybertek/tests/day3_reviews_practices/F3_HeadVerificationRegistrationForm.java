package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_HeadVerificationRegistrationForm {
    public static void main(String[] args) throws InterruptedException {
//        TC #4: Facebook header verification
//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
//        3. Verify “Create a page” link href value contains text:
//        Expected: “registration_form”
        String expectedlink= "registration_form";
        WebElement link= driver.findElement(By.linkText("Create a Page"));
        Thread.sleep(3000);
        String actualLink= link.getAttribute("href");
        if(actualLink.contains(expectedlink)){
            System.out.println("link verification: PASSED");
        }else{
            System.out.println("link verification: FAILD");
        }
    }
}
