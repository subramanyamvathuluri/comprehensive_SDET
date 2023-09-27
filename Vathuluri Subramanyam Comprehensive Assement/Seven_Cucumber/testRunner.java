package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\SVATHULURI\\IdeaProjects\\untitled\\Features\\MMT.feature",
glue = "stepDefinitions")

public class testRunner {
}
