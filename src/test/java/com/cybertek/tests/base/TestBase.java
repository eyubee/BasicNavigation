package com.cybertek.tests.base;

import com.utilities.ConfigurationReader;
import com.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
   public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
    String browser= ConfigurationReader.getProperty("browser");
    driver= WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
}
@AfterMethod
public void tearDownMethod(){
    driver.close();
    }
}