package com.cybertek.tests.day12_actions_uploaded_jsexecutor;

import com.utilities.BrowserUtils;
import com.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWorks {
    @Test
    public void TC16_Double_Click(){
 //  1.Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
  //  2.Switch to iframe.
        WebElement iframe= Driver.getDriver().findElement(By.xpath("//div/iframe[@id='iframeResult']"));
        BrowserUtils.sleep(3);
        Driver.getDriver().switchTo().frame(iframe);
 //  3.Double click on the text “Double-click me to change my text color.”
   WebElement changeTextColorTab= Driver.getDriver().findElement(By.xpath("//p[@id='demo']"));
       Actions action= new Actions(Driver.getDriver());
       action.doubleClick(changeTextColorTab).perform();
//  4.Assert: Text’s “style” attribute value contains “red”.
        System.out.println(changeTextColorTab.getAttribute("style"));
        String actualStyle= changeTextColorTab.getAttribute("style");
        String expectedStyle= "red";
        Assert.assertTrue(actualStyle.contains(expectedStyle));

    }
@Test
public void TC17_Drag_N_Drop(){
//    1.Go to https://demos.telerik.com/kendo-ui/dragdrop/index
    Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
//    2.Drag and drop the small circle to bigger circle.
    WebElement bigCircle= Driver.getDriver().findElement(By.id("droptarget"));
    WebElement smallCircle= Driver.getDriver().findElement(By.id("draggable"));
    Actions action = new Actions(Driver.getDriver());
  WebElement cookies= Driver.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
  action.click(cookies).perform();
    BrowserUtils.sleep(3);
   action.dragAndDrop(smallCircle,bigCircle).perform();
//    3.Assert: -Text in big circle changed to: “You did great!”
    String actualText = bigCircle.getText();
    String expectedText= "You did great!";
   Assert.assertEquals(actualText,expectedText);

}
    @Test
    public void TC18_Context_Click(){

        //  Go to https://the-internet.herokuapp.com/context_menu
       Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
        //  2.Right click to the box.
        WebElement box =Driver.getDriver().findElement(By.id("hot-spot"));
        Actions action = new Actions(Driver.getDriver());
        action.contextClick(box).perform();
        //  3.Alert will open.
        Alert alert= Driver.getDriver().switchTo().alert();
        //  4.Accept alertNo assertion needed for this practice.
        alert.accept();

    }


}
