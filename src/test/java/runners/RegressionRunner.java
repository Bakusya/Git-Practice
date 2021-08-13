package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = {"classpath:features"},
            glue = {"steps"},
            tags = {"@Regression"},
            plugin = {"json:target/cucumber.json"},
            format = {"pretty","html:target/reports"}

    )
    public class RegressionRunner {
}
