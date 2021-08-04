package com.cybertek.tests.day5_findElements_Practice;

import com.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P0MerriamWebster {
    public static void main(String[] args) {
        //    1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

//2. Go to https://www.merriam-webster.com/
        driver.get("https://www.merriam-webster.com/ ");
// 3. Print out the texts of all links
// 4. Print out how many link is missing text
        List<WebElement> ListOfLinks = driver.findElements(By.xpath("//body//a"));
        int missingLinkNum = 0;
        int withLinkNum = 0;
        for(WebElement eachLink: ListOfLinks){
            System.out.println("Link List = " + eachLink.getText());
            if(eachLink.getText().isEmpty() ){
                missingLinkNum++;
            }

        }
        System.out.println("links without text= " + missingLinkNum);

//5. Print out how many link has text
        for(WebElement eachLinksWithout : ListOfLinks){
            if(!eachLinksWithout.getText().isEmpty()){
                withLinkNum++;
            }
        }
        System.out.println("links with text= " + withLinkNum);
//6. Print out how many total link
        System.out.println("total links number = " + ListOfLinks.size());

    }

}
