package StepDefinition;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureWithTages",
glue= {"StepDefinition"},

//tags = "@smoke" ,  // single tag  -  scenarios tagged with @smoke 
//tags = "@smoke or @regression "     // scenarios tagged with @smoke or regression
//tags = "@smoke and @regression " //  scenarios tagged with both @smoke and @regression 
//tags = "tags = "@smoke and @regression" // mutiple tags with AND OR conditions

//tags = "@smoke and not @regression"  // skip or  ignore tags,  tags = "@smoke or @regression and not @important

tags = "@mustRun"
		)


//monochrome = true,
//plugin = {"pretty","json:target/JsonReport/report.json"} //html:target/HtmlReorts pretty","html:target/cucumber-reports.html
//plugin = {"prettty","html:target/HtmlReport/reports.html"}

//plugin = {"pretty","junit:tagret/JunitReports/report.xml"}
		
public class TestRunner_Tags {
	
	

}
