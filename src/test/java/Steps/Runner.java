package Steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = "Steps",
        plugin = {"pretty", "html:target/reports/report.html"}
)

public class Runner  {
}
