package nopcommerce;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by avantrik1 on 11/02/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/AutoStars", "json:target/AutoStars.json"})
public class Run extends BaseClass {
}
