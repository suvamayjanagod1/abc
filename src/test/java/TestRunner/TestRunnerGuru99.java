package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "AllFeatures" }, glue = { "StepDefination" },

		dryRun = false

)

public class TestRunnerGuru99 extends AbstractTestNGCucumberTests {

}
