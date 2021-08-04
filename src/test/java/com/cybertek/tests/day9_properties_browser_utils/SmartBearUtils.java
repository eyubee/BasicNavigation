package com.cybertek.tests.day9_properties_browser_utils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class SmartBearUtils {
    public static void loginToSmartBear(WebDriver driver){
        WebElement uesrName= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        uesrName.sendKeys("Tester");
        WebElement passWord= driver.findElement(By.xpath("//input[@type='password']"));
        passWord.sendKeys("test");
        WebElement loginButton= driver.findElement(By.xpath("//input[@class='button']"));
        loginButton.click();

    }
    //        • Create a method named verifyOrder in SmartBearUtils class.
//• Method takes WebDriver object and String(name).
    public static void verifyOrder(WebDriver driver, String name){
//• Method should verify if given name exists in orders.

//• This method should simply accepts a name(String), and assert whether
//        given name is in the list or not.
//• Create a new TestNG test to test if the method is working as expected.
        List<WebElement> existingNamesInOrder= driver.findElements(By.xpath("//table[@class='SampleTable']//td[2]"));
        for(WebElement eachName: existingNamesInOrder){
            String eachNameText= eachName.getText();
            if(eachNameText.equals(name)){
                Assert.assertTrue(eachNameText.equals(name),"name isn't found in the list of order");
                return;
            }


        }


    }
    public static void printNamesAndCities(WebDriver driver){
//        • Create a method named printNamesAndCities in SmartBearUtils class.
//• Method takes WebDriver object.
//• This method should simply print all the names in the List of All Orders.
      List<WebElement> existingNamesInOrder= driver.findElements(By.xpath("//table[@class='SampleTable']//td[2]"));
      // String listOfName="";
      ArrayList<String> listOfName= new ArrayList<>();
        WebElement citiy= driver.findElement(By.xpath("//table[@class='SampleTable']//td[2]/following-sibling:: td[5]"));
        WebElement name = driver.findElement(By.xpath("//table[@class='SampleTable']//td[2]"));
        for (WebElement each: existingNamesInOrder){
            listOfName.add(each.getText());
            listOfName.add(citiy.getText());

        }
        for(int i=3; i < listOfName.size(); i +=2){
            String stateRemove= listOfName.get(i);
            listOfName.removeIf(state -> state.equals(stateRemove));
        }

        System.out.println(listOfName.toString());

    }

}
