package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\Feature_file\\Vmmaps_login.feature"},
		glue = "step_definition", dryRun = true
		)

public class Vmmaps {
	

}
