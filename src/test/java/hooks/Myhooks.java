package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import browser.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Myhooks {

	WebDriver driver;
	@Before
	public void setup() throws InterruptedException{
		driver= Browser.Launching_Browser("Chrome");
		driver= Browser.getDriver();
	}

	@After
	public void teardown(Scenario scenario) {
		String scenarioName=scenario.getName().replaceAll("", "");
		if(scenario.isFailed()) {
			byte[] srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcScreenshot, "image/png", scenarioName);
		}
		driver.quit();		
	}
}
