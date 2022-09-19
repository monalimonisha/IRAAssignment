package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			plugin = { "pretty", "html:target/cucumber" },
            features={ "src/test/resources/features/IRA.feature" },
            glue = {"src/test/java/stepdefinitions"},
            dryRun=false
			)
	 
	public class TestRunner {
	 
	}