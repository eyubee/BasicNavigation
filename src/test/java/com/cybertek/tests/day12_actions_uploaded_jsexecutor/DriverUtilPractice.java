package com.cybertek.tests.day12_actions_uploaded_jsexecutor;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverUtilPractice {
    @Test
    public void simple_google_search_test(){
        //1. go to google
        // Driver.getDriver() ...driver creates driver instance and ready it to be used
        Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));
        //2. search for a value
        WebElement searchBox=  Driver.getDriver().findElement(By.name("q"));
//   One way to do it
//        String searchValue= "there is no spoon";
//        //send the searchValue and press enter
//        searchBox.sendKeys(searchValue+ Keys.ENTER);
        String searchValue= ConfigurationReader.getProperty("searchValue");
        searchBox.sendKeys(searchValue+ Keys.ENTER);

        //3. verify  value is contained the tile
        String actualTitle= Driver.getDriver().getTitle();
        String expectedInTitle= searchValue;
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
        //this will terminate the session and assign driver to null
        Driver.closeDriver();
        Driver.getDriver().get("https://etsy.com");
        Driver.closeDriver();
    }
}
