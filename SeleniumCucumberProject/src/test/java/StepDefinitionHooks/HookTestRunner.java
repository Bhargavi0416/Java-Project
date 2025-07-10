package StepDefinitionHooks;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class HookTestRunner {
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src/test/resources/FeatureWithHooks",
			glue= {"stepDefinition","Hooks"},
			tags = "@smokeHook",
			plugin = {"pretty","json:target/JsonReport/report.json"} 
	
)
	public class TestRunner{
		
	}
}



//html:target/HtmlReorts pretty","html:target/cucumber-reports.html