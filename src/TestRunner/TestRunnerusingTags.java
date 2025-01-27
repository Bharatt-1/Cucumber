package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\bharath\\IdeaProjects\\Cucumber\\src\\main\\java\\FeatureFile\\LoginPageUsingTags.feature",glue={"StepDefinitions"},monochrome = true,tags = "@smokeTest")

public class TestRunnerusingTags {
}
