package com.cybertek.tests.day6_testing_info_dropdowns;

import com.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC03FindElements_Apple {
    public static void main(String[] args)  {
//        TC #03: FINDELEMENTS_APPLE
//        1. Open Chrome browser
WebDriver driver = WebDriverFactory.getDriver("chrome");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        2. Go to https://www.apple.com
        driver.get("https://www.apple.com");
//        3. Click to all of the headers one by one
//        a. Mac, iPad, iPhone, Watch, TV, Music, Support
        //storing 9 9 web elements including  apple logo, and search box
      List <WebElement>  lstOfHDRS = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
for (int each=1; each< lstOfHDRS.size()-1; each++){
    System.out.println(lstOfHDRS.get(each).getText());
    lstOfHDRS.get(each).click();
    lstOfHDRS= driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
//        4. Print out the titles of the each page
    System.out.println("current page title = " + driver.getTitle());
//        5. Print out total number of links in each page
    List <WebElement> allLinks= driver.findElements(By.xpath("//body//a"));//will give us all of the links inside the body
    System.out.println("Total number of links in the current page = " + allLinks.size());

//        6. While in each page:
//        a. Print out how many link is missing text TOTAL
//        b. Print out how many link has text TOTAL
   int linksWithNoText=0;
   int linksWithText=0;
   for (WebElement eachLinks: allLinks){
       if(eachLinks.getText().isEmpty()){
           linksWithNoText++;
       }else {
           linksWithText++;
       }
   }
    System.out.println("Current page links With Text = " + linksWithText);
    System.out.println("Current page links With No Text = " + linksWithNoText);
}

        driver.close();




    }
}
