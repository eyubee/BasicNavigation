package com.cybertek.tests.office_hr_hws.homework1;

import com.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework1Object {
    @Test
    public void join_money_market_test(){
        //      1. Navigate to: https://moneygaming.qa.gameaccount.com/
Driver.getDriver().get("https://moneygaming.qa.gameaccount.com/");
//       2. Click the JOIN NOW button to open the registration page
Homework1Page test= new Homework1Page();
test.homePageJoinButton.click();
//       3. Select a title value from the dropdown
        Select titleSelect= new Select (test.regisTitle);
        titleSelect.selectByValue("Miss");
//       4. Enter your first name and surename in the form
        test.firstName.sendKeys("ksdhjkadshjahs");
        test.surName.sendKeys("jhjkshdjahsdjh");
//       5. Check the tickbox with text 'I accept the Terms and Conditions and certify that I am over the age of 18.'
        test.tickBox.click();
//       6. Submit the form by clicking the JOIN NOW button
        test.regisJoinNow.click();
//       7. Validate that a validation message with text ‘ This field is required’ appears under the date of
//    birth box
        String expectedError= "This field is required";
        String actualError= test.DOBError.getText();
        Assert.assertEquals(actualError,expectedError,"error not the same");

    }

}
