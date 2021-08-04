package com.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    //new method creation
    //method name getDriver
    //static method
    //accepts string arg: browsetType
    public static WebDriver getDriver(String  browsetType){


        //   - This arg will determine what type of browser is opened
//   - if "chrome" passed --> it will open chrome browser
//   - if "firefox" passed --> it will open firefox browser


        if(browsetType.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            //WebDriver driver= new ChromeDriver(); can do that

            //System.out.println("web browser type is Chrome: PASSES");
            // RETURN TYPE: "WebDriver"
            //return driver; return with first step
            return new ChromeDriver();
        }else if (browsetType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
           // WebDriver driver= new FirefoxDriver();  one way
           // System.out.println("web browser type is Chrome: PASSED");
            // RETURN TYPE: "WebDriver"
            //return driver; one way
            return new FirefoxDriver();
        }




      return null;
    }

}
