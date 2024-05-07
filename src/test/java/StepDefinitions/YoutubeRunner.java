package StepDefinitions;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\Sameer\\eclipse-workspace\\Youtube\\src\\test\\resources\\Features\\Youtube_search.feature",
    glue = "StepDefinitions",
    plugin = {
        "pretty",
        "html:target/cucumber-html-report",
        "json:target/cucumber-json-report/cucumber.json",
        "junit:target/cucumber-junit-report/cucumber.xml"
    }
)
public class YoutubeRunner {
}
