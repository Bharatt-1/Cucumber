package TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\bharath\\IdeaProjects\\Cucumber\\src\\main\\java\\FeatureFile\\LoginpageForPOM.feature",glue={"StepDefinationFor_POM"},monochrome = true)

public class TestRunnerForPOM {
}
