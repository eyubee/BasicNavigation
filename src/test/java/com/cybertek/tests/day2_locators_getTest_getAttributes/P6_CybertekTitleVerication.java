package com.cybertek.tests.day2_locators_getTest_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_CybertekTitleVerication {
    public static void main(String[] args) throws InterruptedException {
        //        1. OpenChromebrowser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
//        2. Gotohttp://practice.cybertekschool.com/inputs
       driver.get("http://practice.cybertekschool.com/inputs");
//        3. Click“Home”button
        //1 locate the web element using class attrb valeue
        //2 click
        //add wait
        Thread.sleep(3000);
       driver.findElement(By.className("nav-link")).click();
//        4. Verifytitleasexpected:
//        Expected: Practice
        String expectedTitile= "Practice";
        String actualTitile= driver.getTitle();
        if(actualTitile.equals(expectedTitile)){
            System.out.println("Titile verified: PASS");
        } else{
            System.out.println("Titile not verified: FAIL");
        }
    }
}
