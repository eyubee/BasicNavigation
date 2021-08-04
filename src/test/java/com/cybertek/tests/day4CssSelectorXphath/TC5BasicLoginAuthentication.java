package com.cybertek.tests.day4CssSelectorXphath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5BasicLoginAuthentication {
    public static void main(String[] args) {
//        TC #5: Basic login authentication 1- Open a chrome browser
//        2- Go to:
//        http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
//        3- Verify title equals:
//        Expected: Web Orders Login
        String expectedTitle= "Web Orders Login";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("title verification: PASSED");
        }else{
            System.out.println("title verification: FAILED");
        }
//        4- Enter username: Tester 5- Enter password: test
        WebElement userName= driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        WebElement passWord= driver.findElement(By.id("ctl00_MainContent_password"));
        passWord.sendKeys("test");
//        6- Click “Sign In” button
        WebElement signInButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        signInButton.click();
//        7- Verify title equals:
//        Expected: Web Orders
        String expectedAfterLoginTitle= "Web Orders";
      String actualAfterLoginTitle= driver.getTitle();
      if(actualAfterLoginTitle.equals(expectedAfterLoginTitle)){
          System.out.println("Homepage Title verification: PASSED");
      }else {
          System.out.println("Homepage Title verification: FAILED");
      }

    }
}
