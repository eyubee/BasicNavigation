package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLoginTitleVerfication {
    public static void main(String[] args) throws InterruptedException {
//        TC #2: Facebook incorrect login title verification
//        1. Open Chrome browser
        //setup browser driver
        WebDriverManager.chromedriver().setup();
        //create driver instance and open browser
        WebDriver driver= new ChromeDriver();
        //use the driver object created to use selenium methods
        //maximize browser
        driver.manage().window().maximize();
//        2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
//        3. Enter incorrect username
        WebElement inputUserNmae= driver.findElement(By.id("email"));/**locating the web element using id locator and storing it in webelement type */
        inputUserNmae.sendKeys("something123456@gmail.com");
//        4. Enter incorrect password
        WebElement inputPassword= driver.findElement(By.id("pass"));
        inputPassword.sendKeys("something wrong password"+ Keys.ENTER);
//        5. Verify title changed to:
//        Expected: “Log into Facebook”
        String expectedTitle= "Log into Facebook";
        System.out.println("expectedTitle= "+expectedTitle);
        //sleep for 5 sec so it can run
        Thread.sleep(5000);
        String actualTitle= driver.getTitle();
        System.out.println("actualTitle= "+actualTitle);

        if (actualTitle.equals(expectedTitle)){
            System.out.println("title verification: PASSED ");
        }else {
            System.out.println("title verification: FAILED");
        }
    }
}
