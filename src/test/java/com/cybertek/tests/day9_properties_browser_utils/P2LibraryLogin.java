package com.cybertek.tests.day9_properties_browser_utils;

import com.utilities.BrowserUtils;
import com.utilities.LibraryUtils;
import com.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P2LibraryLogin {
WebDriver driver;
    @BeforeClass
    public void setup(){
        //Task #1: Library software link verification
        //1. Open browser
        //2. Go to website: http://library2.cybertekschool.com/login.html
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://library2.cybertekschool.com/login.html");
    }
    @Test
    public void login_link_test(){
        //Task#1: library software link verification
        //loginMethod calling ligin library app
        LibraryUtils.liginToLibary(driver);

    }
    @Test
    public void login_link_count_test(){
        //3. Enter username: “”

        WebElement inputUserName= driver.findElement(By.xpath("//input[@id='inputEmail']"));
        inputUserName.sendKeys("student11@library");
        //4. Enter password: “”

      WebElement inputPassword= driver.findElement(By.xpath("//input[@id='inputPassword']"));
      inputPassword.sendKeys("tScBPCUr");
        //5. Click to Login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']"));
        loginButton.click();
        //6. Print out count of all the links on landing page
        BrowserUtils.sleep(2);
        List<WebElement> allLinks= driver.findElements(By.xpath("//body//a"));
        System.out.println("total links on the page is "+allLinks.size());
        //7. Print out each link text on this page
        BrowserUtils.sleep(2);
        for(WebElement each: allLinks) {
            System.out.println(each.getText());

        }
    }
}
