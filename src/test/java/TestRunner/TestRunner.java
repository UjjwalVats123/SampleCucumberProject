package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Feature", 
glue="StepDefination", 
dryRun=false,
tags="@PameterizedTest,@SignupTest", 
plugin={"pretty","html:target/cucumber"}, 
monochrome=true)
public class TestRunner {

}
