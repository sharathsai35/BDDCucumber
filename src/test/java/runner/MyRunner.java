package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./feature/userprofile.feature",
//@CucumberOptions(features="./feature/personalsettings.feature",
//@CucumberOptions(features="./feature/homepage.feature",
//@CucumberOptions(features="./feature/searchuserinadduser.feature",
//@CucumberOptions(features="./feature/adduser.feature",
//@CucumberOptions(features="./feature/addgroupinrecentchatpage.feature",
//@CucumberOptions(features="./feature/addgroupindashboard.feature",
//@CucumberOptions(features = "./feature/voicemessage.feature",
//@CucumberOptions(features = "./feature/codesnippet.feature",
//@CucumberOptions(features = "./feature/readreceipt.feature",
//@CucumberOptions(features = "./feature/forkout.feature",
//@CucumberOptions(features = "./feature/chatmessages.feature" ,
//@CucumberOptions(features = "./feature/login3.feature",
glue = { "stepdefinition", "hooks" },
publish = true,
plugin= {"pretty","html:target/loginpage/userprofile.html"}
)
public class MyRunner {

}
