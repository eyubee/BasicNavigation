package com.cybertek.tests.day1_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cybertek_Tool_verfication {
    public static void main(String[] args) {
//        TC #2: Cybertek practice tool verifications
//      //setup driver
        WebDriverManager.chromedriver().setup();
        //1. OpenChromebrowser
        WebDriver driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //System.
//        2. Gotohttps://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com/");
//        3. VerifyURLcontains
        // Expected: cybertekschool
        String expectedURL=" cybertekschool";
        String actualURL= driver.getCurrentUrl();
        if (actualURL.contains(expectedURL)){
            System.out.println("URL verfied");
        }else {
            System.out.println("URL not verfied");
        }
//        4. Verifytitle:
        String excpectedTitle="Practice";
        String foundTile=driver.getTitle();
        if(excpectedTitle.equalsIgnoreCase(foundTile)){
            System.out.println("title verified");
        }else{
            System.out.println("title not verified");
        }

    }
}
