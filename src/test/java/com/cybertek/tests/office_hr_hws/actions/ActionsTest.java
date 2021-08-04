package com.cybertek.tests.office_hr_hws.actions;

import com.github.javafaker.Faker;
import com.utilities.BrowserUtils;
import com.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ActionsTest {
    @Test
    public void actionsTest(){
//        You have to implement the following Web automated checks over our (Adifas) DEMO ONLINE SHOP: https://www.demoblaze.com/index.html
        Driver.getDriver().get("https://www.demoblaze.com/index.html");
//• Customer navigation through product categories: Phones, Laptops and Monitors
//• Navigate to "Laptop" → "Sony vaio i5" and click on "Add to cart". Accept pop up confirmation.
        ActionsPage obj= new ActionsPage();
        obj.laptops.click();
        BrowserUtils.sleep(2);
        obj.sonyVaioI5.click();
        obj.addToCart.click();
        BrowserUtils.sleep(2);
        Alert alert=  Driver.getDriver().switchTo().alert();
        alert.accept();

//• Navigate to "Phones" → "Samsung galaxy s6" and click on "Add to cart". Accept pop up confirmation.

        BrowserUtils.sleep(2);
        obj.HomePage.click();
        BrowserUtils.sleep(2);
        obj.phones.click();
        BrowserUtils.sleep(2);
        obj.galaxy6.click();
        BrowserUtils.sleep(2);
        obj.addToCart.click();
        BrowserUtils.sleep(2);
        alert.accept();
//• Navigate to "Monitors" → "Apple monitor 24" and click on "Add to cart". Accept pop up confirmation.
        obj.HomePage.click();
        obj.monitors.click();
        obj.appleMonitor24.click();
        BrowserUtils.sleep(2);
        obj.addToCart.click();
        BrowserUtils.sleep(2);
        alert.accept();

//• Navigate to "Cart" → Delete "Apple monitor 24" from cart.
        BrowserUtils.sleep(2);
        obj.shoppingCart.click();
        obj.deletingAppleMonitor.click();
//• Click on "Place order".
BrowserUtils.sleep(2);
obj.placeOrder.click();
//• Fill in all web form fields.
        Faker fake= new Faker();
        obj.name.sendKeys(fake.name().firstName());
        obj.country.sendKeys(fake.country().name());
        obj.city.sendKeys(fake.address().city());
        obj.card.sendKeys(fake.finance().creditCard());
        obj.month.sendKeys("10");
        obj.year.sendKeys("2021");
//• Click on "Purchase"
        obj.purchase.click();
//• Capture and log purchase Id and Amount.

        String[] confirmationArray = obj.purchaseComformation.getText().split("\n");
       String orderID= confirmationArray[0];
       String orderAmount= confirmationArray[1];
        System.out.println(orderID);
        System.out.println(orderAmount);


 //Assert purchase amount equals expected.
        String expectedID= "Id: 3791821";
        String expectedAmount= "Amount: 1150 USD";
        //Assert.assertEquals(orderID,expectedID);
        Assert.assertEquals(orderAmount,expectedAmount);

//• Click on "Ok"
        obj.okButton.click();
    }
}
