package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./feature/login3.feature",
glue = { "stepdefinition", "hooks" },
publish = true,
plugin= {"pretty","html:target/loginpage/login1.html"}
)
public class MyRunner {

}
