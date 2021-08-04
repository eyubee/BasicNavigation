package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LibraryUtils {
    WebDriver driver;
    public static void liginToLibary(WebDriver driver){
        WebElement inputUserName= driver.findElement(By.xpath("//input[@id='inputEmail']"));
        inputUserName.sendKeys("student11@library");
        WebElement inputPassword= driver.findElement(By.xpath("//input[@id='inputPassword']"));
        inputPassword.sendKeys("tScBPCUr");
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']"));
        loginButton.click();
    }
}
