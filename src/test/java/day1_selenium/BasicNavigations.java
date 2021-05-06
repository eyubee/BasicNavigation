package day1_selenium;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {
        /**1. setup the browser driver*/
        WebDriverManager.chromedriver().setup();
        /** 2. create instance of selenium web driver
         * this line opens empty browser*/

      WebDriver driver = new ChromeDriver();

        /** maximizing page size*/
        driver.manage().window().maximize();

        /**
        driver.manage().window().fullscreen(); words only for mac */
      /** get the page for Tesla.com*/
        driver.get("https://www.tesla.com");

       String currentUrl= driver.getCurrentUrl();   /**return  tesla.com as a string to be saved so we can call it again */

        System.out.println("Current title: "+currentUrl);
        /**going back using navigations */
        /**Thred sleep ...making the program to sleep so it will be slower */
        Thread.sleep( 3000);

        driver.navigate().back();
        /**going forward using navigations and sleep for 3 secs*/
        Thread.sleep( 3000);
        driver.navigate().forward();
/**refeshing the page using navigations */
        driver.navigate().refresh();
        Thread.sleep( 3000);

        /**going to another  url using  to() method*/
        driver.navigate().to("https://google.com");

        System.out.println("Current title: "+driver.getTitle());
        System.out.println("current title: "+ currentUrl);

        /** maximizing page size*/
        driver.manage().window().maximize();

        //this method will close all currentlly focused page or tab
        driver.close();




    }
}
