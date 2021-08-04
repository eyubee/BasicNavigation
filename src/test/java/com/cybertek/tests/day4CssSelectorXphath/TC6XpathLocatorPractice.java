package com.cybertek.tests.day4CssSelectorXphath;

import com.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC6XpathLocatorPractice {
    public static void main(String[] args) {
//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
//        2. Go to http://practice.cybertekschool.com/multiple_buttons
        driver.get("http://practice.cybertekschool.com/multiple_buttons ");
//        3. Click on Button 1
        WebElement button1= driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();
        WebElement resultText= driver.findElement(By.xpath("//p[@id='result']"));
//        4. Verify text displayed is as expected:
//        Expected: “Clicked on button one!”
//        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        String expectedText= "Clicked on button one!";
        String actualText= resultText.getText();
        if(actualText.equalsIgnoreCase(expectedText)){
            System.out.println("displayed Text verification: PASSES");
        }else {
            System.out.println("displayed Text verification: FAILED");
        }


    }
}
