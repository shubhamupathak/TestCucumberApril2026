import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//monochrome = true, //removes junk characters from logs.
		//dryRun = true, //check the syntax line by line in stepdef file.
		features = {"src/test/resources/HRMFeature.feature"},
	    glue = "stepdefinitions",
		plugin = {"pretty",
				"html:target/cucumber-reports/FirstFeature.html",
				"json:target/FirstFeature.json",	
		}
		)
public class HRMTestRunner
{

}