package com.cybertek.tests.day13_actions_pom_design;

import com.cybertek.pages.LibraryLoginPage;
import com.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageObjectModelPractices {
    @Test
    public void negative_login_to_Library_test(){
        //1. go to the library page
        Driver.getDriver().get("https://library2.cybertekschool.com/login.html");
        //creat object of the class
        // when we create the object, constructor will automatically initialize driver and object of the library as well
        //meaning we will be able to use the methods through the object class
        LibraryLoginPage loginPage= new LibraryLoginPage();
        //2- enter incorrect email
        loginPage.inputEmail.sendKeys("ab@gmail.com");
        //3. enter incorrect password
        loginPage.inputPassword.sendKeys("aksdj");
        //4. click ro sign in button
        loginPage.signInButton.click();
        //4. verify error message is displayed
        String firstErrorActual= loginPage.wrongEmailOrPasswordError.getText();
        String expectedFirstError= "Sorry, Wrong Email or Password";
        Assert.assertEquals(firstErrorActual,expectedFirstError);
    }
}
