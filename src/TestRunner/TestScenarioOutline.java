package TestRunner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\bharath\\IdeaProjects\\Cucumber\\src\\main\\java\\FeatureFile\\ScenarioOutlineParameterization.feature",glue={"StepDefinationForScenarioOutline"},monochrome = true)

public class TestScenarioOutline {
}
