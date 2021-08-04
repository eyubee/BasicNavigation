package com.cybertek.tests.day2_locators_getTest_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankAttributeVerification {
    public static void main(String[] args) {
//        TC #2: Zero Bank link text verification
//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
//        2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html ");
//        3. Verify link text from top left:
//        Expected: “Zero Bank”
        String expectedLinkText= "Zero Bank";
        //locate the link web element and store it
        WebElement zeroBankLink= driver.findElement(By.className("brand"));
        String actualLinkText= zeroBankLink.getText();
        if(actualLinkText.equalsIgnoreCase(expectedLinkText)){
            System.out.println("link text verification: PASSED");
        } else{
            System.out.println("link text verifiction: FAILED");
        }
//      4. Verify link href attribute value contains:
//        Expected: “index.html”
        String expectedLinkAttrValue= "index.html";
        String actualLinkAttrValue = zeroBankLink.getAttribute("href");
        if(actualLinkAttrValue.contains(expectedLinkAttrValue)){
            System.out.println("hRef attrbute value verified: PASSED");
        }else {
            System.out.println("hRef attrbute value not verified: FAILED ");
        }
    }
}
