package tek.bdd.base.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/SetupTest.feature",
        glue = "tek.bdd.steps"
)
public class TestRunner {
    // This class will be used to run Cucumber tests
}
