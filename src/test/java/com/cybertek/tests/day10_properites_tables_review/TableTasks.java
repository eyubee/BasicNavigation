package com.cybertek.tests.day10_properites_tables_review;

import com.cybertek.tests.base.TestBase;
import com.utilities.ConfigurationReader;
import com.utilities.TableUtils;
import com.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TableTasks extends TestBase {
   // WebDriver driver;
//    @BeforeMethod
//    public void setupMethod(){
//        String browser= ConfigurationReader.getProperty("browser");
//        driver= WebDriverFactory.getDriver(browser);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//    }
        //this line is returns string chrome

        //this line returns the url as string
        //Open browser and go to: http://practice.cybertekschool.com/tables#edit

        /** driver.get(ConfigurationReader.getProperty("dataTablesUrl")); the same thing as the url string*/

//	•	Locate first table and verify Tim has due amount of “$50”
//
//        Note: Create locator for Tim that will be dynamic and doesn’t care in which row Tim is.

    @Test
    public void task3_return_tims_due_amount(){
        String url= ConfigurationReader.getProperty("dataTablesUrl");
        driver.get(url);
//        driver.get(ConfigurationReader.getProperty("dataTablesUrl")); another way to do it
        ////table[@id='table1']//td[.='Tim']...this locator locates tim's cell regardless of where he is

        //method 1. //table[@id='table1']//td[.='Tim']/../td[4] to find the balance
        //method2. //table[@id='table1']//td[.='Tim']/following-sibling::td[2]
        WebElement timsDueAmountCell= driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/../td[4]"));
        System.out.println("timesdueamount ="+timsDueAmountCell);
        String actualTimeResult= timsDueAmountCell.getText();
        String excpectedTimResult= "$50.00";
        Assert.assertEquals(actualTimeResult,excpectedTimResult,"Tim's cell isn't returning the expected value");


    }
    @Test
    public void task4_verfiy_order_method(){
        String url= ConfigurationReader.getProperty("dataTablesUrl");
        driver.get(url);
        TableUtils.verfyOrder(driver,"random");
    }

}


