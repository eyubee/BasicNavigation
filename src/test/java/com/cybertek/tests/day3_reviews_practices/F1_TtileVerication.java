package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_TtileVerication {
    public static void main(String[] args) throws InterruptedException {
        //TC #1 Facebook title verfication
        //1. opem chrom browser
        //setup browser driver
        WebDriverManager.chromedriver().setup();
        //create driver instance and open browser
        WebDriver driver= new ChromeDriver();
        //use the driver object created to use selenium methods
        //maximize browser
        driver.manage().window().maximize();
        //2 go to https://www.facebook.com
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        String actualTitle= driver.getTitle();
        //3 verify title:
        //expected "Facebook-Log in or sign up"
        String expectedTitle= "Facebook - Log In or Sign Up";
        if(actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("title verfication: PASSED");
        }else{
            System.out.println("title verification: FAILED ");
        }


    }
}
