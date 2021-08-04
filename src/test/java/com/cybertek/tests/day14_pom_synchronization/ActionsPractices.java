package com.cybertek.tests.day14_pom_synchronization;

import com.cybertek.pages.TelerikPage;
import com.utilities.BrowserUtils;
import com.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractices {
    @Test
    public void TC17_drag_and_drop_test(){
        //    1.Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        //    2.Drag and drop the small circle to bigger circle.
        TelerikPage telerikPage= new TelerikPage();
        Actions action = new Actions(Driver.getDriver());
        telerikPage.cookies.click();
        BrowserUtils.sleep(3);
        //1st way to do it
        //action.dragAndDrop(telerikPage.smallCircle, telerikPage.bigCircle).perform();
        //2nd way
        action.moveToElement(telerikPage.smallCircle).clickAndHold(telerikPage.smallCircle).moveToElement(telerikPage.bigCircle).release().perform();
        //    3.Assert: -Text in big circle changed to: “You did great!”
        String actualText = telerikPage.bigCircle.getText();
        String expectedText= "You did great!";
        Assert.assertEquals(actualText,expectedText);
    }
}
