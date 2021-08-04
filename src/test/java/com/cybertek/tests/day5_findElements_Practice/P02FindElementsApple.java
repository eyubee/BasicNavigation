package com.cybertek.tests.day5_findElements_Practice;

import com.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P02FindElementsApple {
    public static void main(String[] args) {
//        TC #02: FINDELEMENTS_APPLE
//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        2. Go to https://www.apple.com
        driver.get("https://www.apple.com");
        driver.manage().window().maximize();
//        3. Click to iPhone
        WebElement iphone= driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));
        iphone.click();
//        4. Print out the texts of all links
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

      for( WebElement eachLink: listOfLinks){
          System.out.println("list of links = " + eachLink.getText());
      }
//        5. Print out how many link is missing text
        //        6. Print out how many link has text
        int countLinksWithOut=0;
        int countLinksWith=0;
        int totalCOunt=0;

        for(WebElement eachCount: listOfLinks){
            if(eachCount.getText().isEmpty()){
                countLinksWithOut++;

            }else{
                countLinksWith++;

            }

        }
//        7. Print out how many total link
        System.out.println("links with text COunt = " + countLinksWith);
        System.out.println("links without text count  = " + countLinksWithOut);
        totalCOunt=listOfLinks.size();
        System.out.println("total COunt = " + totalCOunt);
    }
}
