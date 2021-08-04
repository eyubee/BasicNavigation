package com.cybertek.tests.day2_locators_getTest_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearchVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        TC #4: Google search
        driver.get("https://www.ggogle.com");
//        1- Open a chrome browser
//        2- Go to: https://google.com
//        3- Write “apple” in search box
//        4- Click google search button
//        5- Verify title: Expected: Title should start with “apple” word

    }
}
