package com.cybertek.tests.day9_properties_browser_utils;

import com.github.javafaker.Faker;
import com.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBear {

    WebDriver driver;
  @BeforeMethod
  public void setup(){
      //1.Open browser
      driver= WebDriverFactory.getDriver("chrome");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS );

  }
@Test
    public void TC1SmartBear(){
// 2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    // 3.Enter username: “Tester”
// 4.Enter password: “test”
// 5.Click to Login button
    WebElement uesrName= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
    uesrName.sendKeys("Tester");
    WebElement passWord= driver.findElement(By.xpath("//input[@type='password']"));
    passWord.sendKeys("test");
    WebElement loginButton= driver.findElement(By.xpath("//input[@class='button']"));
    loginButton.click();
    // 6.Print out count of all the links on landing page
    List<WebElement> allLinks= driver.findElements(By.xpath("//body//a"));
    System.out.println("counts of all links = " + allLinks.size());
// 7.Print out each link text on this page
    for(WebElement each: allLinks){
        System.out.println(each.getText());
    }
}
@Test
    public void TC2SmartBear() throws InterruptedException {
//    2. Go to website:
//    http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
//    3. Enter username: “Tester”
//    4. Enter password: “test”
//    5. Click on Login button
    WebElement uesrName= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
    uesrName.sendKeys("Tester");
    WebElement passWord= driver.findElement(By.xpath("//input[@type='password']"));
    passWord.sendKeys("test");
    WebElement loginButton= driver.findElement(By.xpath("//input[@class='button']"));
    loginButton.click();
//    6. Click on Order
    WebElement orderTab= driver.findElement(By.xpath("//a[@href='Process.aspx']"));
    orderTab.click();
//    7. Select familyAlbum from product, set quantity to 2
Select select= new Select(driver.findElement(By.xpath("//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']")));
select.selectByValue("FamilyAlbum");

//    8. Click to “Calculate” button
    WebElement calculateButton= driver.findElement(By.xpath("//input[@value='Calculate']"));
    Thread.sleep(1000);
    calculateButton.click();
//    9. Fill address Info with JavaFaker
//• Generate: name, street, city, state, zip code
    Faker fake= new Faker();
    WebElement custName= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtName']"));
    custName.sendKeys(fake.name().fullName());
    WebElement streetAddress= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox2']"));
    streetAddress.sendKeys(fake.address().streetAddress());
WebElement city= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox3']"));
city.sendKeys(fake.address().city());
 WebElement state= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox4']"));
 state.sendKeys(fake.address().state());
 WebElement zipCode= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox5']"));
 zipCode.sendKeys(fake.address().zipCode());

//    10. Click on “visa” radio button
    WebElement visaRadio= driver.findElement(By.xpath("//input[@value='Visa']"));
    visaRadio.click();
//    11. Generate card number using JavaFaker
    WebElement cradNumber= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox6']"));
    cradNumber.sendKeys(fake.finance().creditCard());
//    12. Click on “Process”
    WebElement processButton= driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']"));
    processButton.click();
//    13.Verify success message “New order has been successfully added.”
}



@Test
    public void TC3SmartBear(){
    //1.Open browser and login to Smartbear software
    driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    WebElement uesrName= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
    uesrName.sendKeys("Tester");
    WebElement passWord= driver.findElement(By.xpath("//input[@type='password']"));
    passWord.sendKeys("test");
    WebElement loginButton= driver.findElement(By.xpath("//input[@class='button']"));
    loginButton.click();
    //2.Click on View all orders
    WebElement allOrders= driver.findElement(By.xpath("//a[@href='Default.aspx']"));
    allOrders.click();
    //3.Verify Susan McLaren has order on date “01/05/2010”
    WebElement susanMc= driver.findElement(By.xpath("//table[@class='SampleTable']//tr[6]/td[2]"));
    WebElement date= driver.findElement(By.xpath("//table[@class='SampleTable']//tr/td[.='01/05/2010']"));
    String actualName=susanMc.getText();
    String expectedName= "Susan McLaren";
    String actualDate= date.getText();
    String expectedDate= "01/05/2010";
   Assert.assertEquals(actualDate,expectedDate,"expected date not found");
   Assert.assertEquals(actualName,expectedName,"expected name not found");



}
@Test
    public void TC4SmartBear() throws InterruptedException {
    //1.Open browser and login to Smartbear software
    driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    WebElement uesrName= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
    uesrName.sendKeys("Tester");
    WebElement passWord= driver.findElement(By.xpath("//input[@type='password']"));
    passWord.sendKeys("test");
    WebElement loginButton= driver.findElement(By.xpath("//input[@class='button']"));
    loginButton.click();
    //2.Click on View all orders
    WebElement allOrders= driver.findElement(By.xpath("//a[@href='Default.aspx']"));
    Thread.sleep(3000);
    allOrders.click();
    SmartBearUtils.verifyOrder(driver,"Mark Smith");

}
@Test
    public void TC5SmartBear() throws InterruptedException {
    driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    WebElement uesrName= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
    uesrName.sendKeys("Tester");
    WebElement passWord= driver.findElement(By.xpath("//input[@type='password']"));
    passWord.sendKeys("test");
    WebElement loginButton= driver.findElement(By.xpath("//input[@class='button']"));
    loginButton.click();
    WebElement allOrders= driver.findElement(By.xpath("//a[@href='Default.aspx']"));
    Thread.sleep(3000);
    allOrders.click();
    SmartBearUtils.printNamesAndCities(driver);


}
@AfterMethod
    public void tearDownClose(){
      driver.close();
}
}
