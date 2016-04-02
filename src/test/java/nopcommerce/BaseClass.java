package nopcommerce;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by avantrik1 on 11/02/2016.
 */
public class BaseClass {
      static WebDriver driver;
        @BeforeClass
        public static void startBrowser(){
            System.out.println("Starting Browser " + Enviornment.browser);
            driver = new FirefoxDriver();
            System.out.println("Entering URL " + Enviornment.homeURL);
            driver.get(Enviornment.homeURL);
            driver.manage().window().maximize();
        }
        @AfterClass
        public static void closeBrowser(){
            driver.close();
            driver.quit();
        }

}
