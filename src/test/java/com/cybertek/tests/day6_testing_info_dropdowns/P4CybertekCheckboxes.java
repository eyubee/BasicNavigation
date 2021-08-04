package com.cybertek.tests.day6_testing_info_dropdowns;

import com.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P4CybertekCheckboxes {
    public static void main(String[] args) {
//    1. Go to http://practice.cybertekschool.com/checkboxes
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/checkboxes");
        WebElement checkbox1= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

//    2. Confirm checkbox #1 is NOT selected by default
        if(!checkbox1.isSelected()){
            System.out.println("checkbox1 not selected. Verification Passed");
        }else{
      System.out.println("checkbox1 not selected. Verification faled");
}
 //    3. Confirm checkbox #2 is SELECTED by default.
        if(checkbox2.isSelected()){
            System.out.println("checkbox2 is selected. Verification Passed");
        }else{
            System.out.println("checkbox2 not selected. Verification faled");
        }
//    4. Click checkbox #1 to select it.
        checkbox1.click();
//    5. Click checkbox #2 to deselect it
        checkbox2.click();
//    6. Confirm checkbox #1 is SELECTED.
        if(checkbox1.isSelected()){
            System.out.println("checkbox1 is selected. Verification Passed");
        }else{
            System.out.println("checkbox1 not selected. verification failed");
        }
//    7. Confirm checkbox #2 is NOT selected.
      if (!checkbox2.isSelected()){
            System.out.println("checkbox2 is unselected. Verification passed");
        }else {
          System.out.println("checkbox2 is selected. Verification failed");

      }


    }

}
