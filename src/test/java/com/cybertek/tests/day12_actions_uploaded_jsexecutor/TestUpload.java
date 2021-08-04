package com.cybertek.tests.day12_actions_uploaded_jsexecutor;

import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestUpload {
    @Test
    public void TC14_test_upload() throws InterruptedException {
//    1.Go to http://practice.cybertekschool.com/upload
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
//    2.Find some small file from your computer, and get the path of it.
        String path = "/Users/eyuamde/Desktop/HTML_CLASS/sunny_Sky.jpg";
//    3.Upload the file.
        WebElement chooseFile =  Driver.getDriver().findElement(By.xpath("//input[@id= 'file-upload']"));
        chooseFile.sendKeys(path);
        WebElement uploadButton = Driver.getDriver().findElement(By.xpath("//input[@class='button']"));
        uploadButton.click();

      Thread.sleep(3000);
      //.sendKeys(" /Users/eyuamde/Desktop/HTML_CLASS/sunny_Sky.jpg"+ Keys.ENTER)

//    4.Assert: -Fileuploaded text is displayed on the page
        String expectedText= "File Uploaded!";

        String acctualText=Driver.getDriver().findElement(By.xpath("//h3[.='File Uploaded!']")).getText();
//        Assert.assertTrue(expectedText.equals(acctualText)); one way to do it

        /**Second way to do it */
        WebElement massageDisplay= Driver.getDriver().findElement(By.xpath("//h3[.='File Uploaded!']"));
        Assert.assertTrue(massageDisplay.isDisplayed());
    }

@Test
    public void TC15_Hover_Test() throws InterruptedException {
//    1.Go to http://practice.cybertekschool.com/hovers
    Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
//    2.Hover over to first image
    Actions action = new Actions(Driver.getDriver());
    WebElement image1 = Driver.getDriver().findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
    WebElement image2 = Driver.getDriver().findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
    WebElement image3= Driver.getDriver().findElement(By.xpath("(//img[@alt='User Avatar'])[3]"));
    action.moveToElement(image1).perform();
    Thread.sleep(3000);

//    3.Assert: a.“name: user1” is displayed
    WebElement user1= Driver.getDriver().findElement(By.xpath("//a[@href='/users/1']"));
    WebElement user2= Driver.getDriver().findElement(By.xpath("//a[@href='/users/2']"));
    WebElement user3= Driver.getDriver().findElement(By.xpath("//a[@href='/users/3']"));
    Assert.assertTrue(user1.isDisplayed(),"user isn't displayed. FAIL!!");
//    4.Hover over to second image
//    5.Assert: a.“name: user2” is displayed
    action.moveToElement(image2).perform();
    Assert.assertTrue(user2.isDisplayed(), "user isn't displayed. FAIL!!");

//    6.Hover over to third image
//    7.Confirm: a.“name: user3” is displayed
    action.moveToElement(image3).perform();
    Assert.assertTrue(user3.isDisplayed(), "user isn't displayed. FAIL!!");
}
@Test
    public void scrolling_test() throws InterruptedException {
        //go to http://practice.cybertekschool.com/
        Driver.getDriver().get("http://practice.cybertekschool.com/");
        //scrol down to "Powered by Cybertek School"
    Actions actions= new Actions(Driver.getDriver());
    //locate poweredBy
    WebElement poweredBy= Driver.getDriver().findElement(By.linkText("Cybertek School"));

    //Scroll using actions object
    Thread.sleep(3000);
    actions.moveToElement(poweredBy).perform();
    //scrolling up using keys.Page_UP button
    actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();
    Thread.sleep(3000);
    actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();


}
}
