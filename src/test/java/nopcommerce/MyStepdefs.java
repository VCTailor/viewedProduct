package nopcommerce;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by avantrik1 on 11/02/2016.
 */
public class MyStepdefs {
    static WebDriver driver = BaseClass.driver;
    @Given("^Customer on a products page$")
    public void Customer_on_a_products_page() throws Throwable {
        driver.findElement(By.linkText("Desktops")).click();

    }
    @When("^select a product for view$")
    public void select_a_product_for_view() throws Throwable {
        driver.findElement(By.linkText("Build your own computer")).click();

    }

    @When("^press on Recently Viewed Products$")
    public void press_on_Recently_Viewed_Products() throws Throwable {
        driver.findElement(By.linkText("Recently viewed products")).click();

    }

    @Then("^Customer should be able to see viewed product on Recently Viewed Product Page$")
    public void customer_should_be_able_to_see_viewed_product_on_Recently_Viewed_Product_Page() throws Throwable {
        driver.findElement(By.className("page-title"));
        //this below line is checking condition,First string msg is display when second condition
        //after ,comma is become fail.
        Assert.assertTrue("Recently viewed page not found",  "Recently viewed products".equals(driver.findElement(By.tagName("h1")).getText()));
        Assert.assertEquals("Recently viewed page not found", "Recently viewed products",driver.findElement(By.tagName("h1")).getText());
    }
}
