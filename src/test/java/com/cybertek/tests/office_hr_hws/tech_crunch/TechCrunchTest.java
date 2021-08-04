package com.cybertek.tests.office_hr_hws.tech_crunch;

import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TechCrunchTest {
    @Test
   public void tech_Crunch_test(){
//        1- Go to https://techcrunch.com/
//        2- For “The Latest News” list, verify followings;



        TechCrunchPages techCrunchObj= new TechCrunchPages();
        //        a. each news has an author
Driver.getDriver().get("https://techcrunch.com/");
        List<WebElement> listOfAuthors= Driver.getDriver().findElements(By.xpath("//div[@class='river river--homepage ']//article//a[@aria-label]"));
        List<WebElement> listOfPictures= Driver.getDriver().findElements(By.xpath("//div[@class='river river--homepage ']//img[@ sizes ]"));

for (WebElement each:listOfAuthors ){
    System.out.println(each.getText());
    Assert.assertTrue(each.isDisplayed());
}
//        b. each news has an image
for(WebElement eachImg: listOfPictures){
    Assert.assertTrue(eachImg.isDisplayed());
}
        System.out.println(listOfAuthors.size());
        System.out.println(listOfPictures.size());
        //        3- Click one of news from “The Latest News” list to reach the full content and verify followings;
//        a. the browser title is the same with the news title
        techCrunchObj.selectedNews.click();

        String expectedTitle =Driver.getDriver().findElement(By.xpath("//h1")).getText();
        String actualTitle= Driver.getDriver().getTitle();
      //  Assert.assertEquals(actualTitle,expectedTitle,"title is wrong");
        //        b. the links within the news content
List<WebElement> listOfLinks= Driver.getDriver().findElements(By.xpath("//body//a"));
for (WebElement eachLink: listOfLinks){
    System.out.println("List of links in one news= "+eachLink.getAttribute("href"));
}
    }

    @AfterMethod
    public void close_Page(){
        Driver.closeDriver();
    }
}
