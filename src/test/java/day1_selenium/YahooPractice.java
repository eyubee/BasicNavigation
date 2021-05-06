package day1_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooPractice {
    public static void main(String[] args) {
        /**TC #1: Yahoo Title Verification
         setup broweser driver*/
        WebDriverManager.chromedriver().setup();
       /** 1. OpenChromebrowser */
        WebDriver driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();

         /**2. Gotohttps://www.yahoo.com */
         driver.get("https://www.yahoo.com");

         /** 3. Verifytitle:
         Expected: Yahoo */
         String expectedTitle= "Yahoo";


    }
}
