package com.cybertek.tests.office_hr_hws.php_mySQL;

import com.github.javafaker.Faker;
import com.utilities.Driver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PHPmySQLTests {
    @Test
  public void mySqlTest(){
//    1. Go to http://thedemosite.co.uk/login.php page, check the page whether opened or not
        Driver.getDriver().get("http://thedemosite.co.uk/login.php");
        PHPmySQLPages myTest= new PHPmySQLPages();
//    2. Check the following elements on login page;
//    a. Tab Title = 'Login example page to test the PHP MySQL online system'
        String actualTitle= Driver.getDriver().getTitle();
        String expectedTitle= "Login example page to test the PHP MySQL online system";
       Assert.assertEquals(actualTitle,expectedTitle);
//    b. Header = '4. Login'
       String actualHdr=  myTest.header.getText();
       String expectedHdr= "4. Login";
       Assert.assertEquals(actualHdr,expectedHdr);
//    c. Status Message = No login attempted
        String actualStatusMessage= myTest.statusMessage.getText();
        String expectedStatusMessage= "**No login attempted**";
        Assert.assertEquals(actualStatusMessage,expectedStatusMessage,"status message");
//    d. Info Message = 'Enter your login details you added on the previous page and test the login. The success or failure will be shown above.'
        String expectedInfroMessage= "Enter your login details you added on the previous page and test the login.\nThe success or failure will be shown above.";
        String actualInfoMessage= myTest.infoMessage.getText();
        Assert.assertEquals(actualInfoMessage,expectedInfroMessage,"expected info message ");
//    e. Username field
//    f. Password password field
//    g. Test Login button
//3. Perform a successful login and check the status message change
//myTest.ueserName.sendKeys("vikram");
//myTest.passWord.sendKeys("Biswas");
//myTest.testLogin.click();
//String expectedSuccessfullMessage="**Successful Login**";
//String actualSuccessfulMessage= myTest.successLoginMessage.getText();
//Assert.assertEquals(actualSuccessfulMessage,expectedSuccessfullMessage);

//4. Perform a failed login and check the status message change
        myTest.ueserName.sendKeys("jndnasd");
        myTest.passWord.sendKeys("723782eabjsn");
        myTest.testLogin.click();
        String expectedFailMessage= "**Failed Login**";
        String actualFailMessage= myTest.failedLoginMessag.getText();
        Assert.assertEquals(actualFailMessage,expectedFailMessage,"failed message");

    }

}
