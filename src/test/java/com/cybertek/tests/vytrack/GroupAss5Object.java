package com.cybertek.tests.vytrack;

import com.utilities.BrowserUtils;
import com.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupAss5Object {
@Test
    public void VytrackAssigm5Tests(){
    Driver.getDriver().get("https://app.vytrack.com/user/login");
    GroupAss5 assigm5Test= new GroupAss5();
    BrowserUtils.sleep(3);
    assigm5Test.inputUserName.sendKeys("user27");
    assigm5Test.inputPassword.sendKeys("UserUser123");
    assigm5Test.loginButton.click();
    BrowserUtils.sleep(3);
    assigm5Test.fleetDropDown.click();
    BrowserUtils.sleep(3);
    assigm5Test.fleetVehicles.click();
    BrowserUtils.sleep(3);
    assigm5Test.driverFilter.click();
    BrowserUtils.sleep(2);
    assigm5Test.resetButton.click();
    Assert.assertTrue(assigm5Test.driverFilter.isEnabled());
}
}
