package com.cybertek.tests.day5_findElements_Practice;

import com.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P0FindElements_Practice {
    public static void main(String[] args) {
//        TC #0: FINDELEMENTS
//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password ");
        //to wait for 10 secs
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        3. Print out the texts of all links
        List<WebElement> listOfLinks=  driver.findElements(By.xpath("//body//a"));
//        4. Print out how many total link
       for (WebElement each: listOfLinks){

           //iter to get short cut for each loop
           //fori to get for loop
           System.out.println(each.getText());
           System.out.println(each.getAttribute("href"));///to get list of links
       }
       int numberOFLinks= listOfLinks.size();
        System.out.println("number of links = "+numberOFLinks);
    }
}
