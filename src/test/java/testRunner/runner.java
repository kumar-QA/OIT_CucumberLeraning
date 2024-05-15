package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features ="C:\\Users\\mpras\\eclipse-workspace\\OIT_CucumberLearing\\src\\test\\resource\\Featuers\\\\Login.feature",
		glue = {"stepdefination","hooks"},
		plugin = {"pretty", "html:target/cucumber-reports.html"},
		monochrome = false,
		strict = true
		)
	

public class runner {
	

	
}
