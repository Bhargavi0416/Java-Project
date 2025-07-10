
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features", // path to your .feature files
    glue = {"StepDefinition"},                // package with step definitions
    plugin = {
        "pretty", 
        "html:target/HtmlReports/report.html",
        "json:target/JSONReports/report.json",
        "junit:target/JUnitReports/report.xml"
    },
    monochrome = true
)
public class PraticeLoginRunnerClass {
	
	

}
