package com.cybertek.tests.office_hr_hws.php_mySQL;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PHPmySQLPages {
    PHPmySQLPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//strong[.='4. Login']")
    WebElement header;

    @FindBy(xpath = "//b[.='**No login attempted**']")
    WebElement statusMessage;

    @FindBy(xpath = "//p[contains(.,'login details you added')]")
    WebElement infoMessage;

    @FindBy(xpath = "//input[@name='username']")
    WebElement ueserName;

    @FindBy(xpath = "//input[@type='password']")
    WebElement passWord;

    @FindBy(xpath = "//input[@type='button']")
    WebElement testLogin;

@FindBy(xpath = "//b[.='**Failed Login**']")
    WebElement failedLoginMessag;



    @FindBy(xpath = "//b[.='**Successful Login**']")
    WebElement successLoginMessage;

}
