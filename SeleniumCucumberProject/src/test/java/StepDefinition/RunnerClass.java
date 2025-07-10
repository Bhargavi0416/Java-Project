package StepDefinition;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"StepDefinition"},
monochrome = true,
//plugin = {"pretty","json:target/JsonReport/report.json"} //html:target/HtmlReorts pretty","html:target/cucumber-reports.html
//plugin = {"prettty","html:target/HtmlReport/reports.html"}

plugin = {"pretty","junit:tagret/JunitReports/report.xml"}
		)
public class RunnerClass {
	
	

}
