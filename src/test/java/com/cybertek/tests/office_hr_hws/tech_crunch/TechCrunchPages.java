package com.cybertek.tests.office_hr_hws.tech_crunch;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TechCrunchPages {
    public TechCrunchPages(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
@FindBy (xpath = "//div[@class='river river--homepage ']//h2//a[@href]")
    public WebElement selectedNews;
}
