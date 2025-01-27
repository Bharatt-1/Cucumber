package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\bharath\\IdeaProjects\\Cucumber\\src\\main\\java\\FeatureFile\\searchforCSTech.feature",glue={"StepDefinationForSearchForCSTech"},monochrome = true)

public class TestRunnerForCSTech {
}
