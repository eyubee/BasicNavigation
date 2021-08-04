package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_HeaderVerfication {
    public static void main(String[] args) throws InterruptedException {
//        TC #3: Facebook header verification
//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com ");
//        3. Verify header text is as expected:
//        Expected: “Connect with friends and the world around you on Facebook.”

       // WebElement actualHeader= driver.findElement(By.tagName("h2"));
        WebElement headr= driver.findElement(By.className("_8eso"));
        String actualHeader= headr.getText();
        Thread.sleep(3000);
        String expectedHeader= "Connect with friends and the world around you on Facebook.";
        if(actualHeader.equals(expectedHeader)){
            System.out.println("header verification: PASSED");
        }else {
            System.out.println("header verification: FAILED");
        }
    }
}
