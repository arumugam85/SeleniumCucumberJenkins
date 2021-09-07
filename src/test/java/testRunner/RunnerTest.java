package testRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(        
        features =  {"src/test/resources/features"},
        glue=       {"stepDefns"},
        monochrome = true,
        strict = true,
        tags   = {"@login"},
        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}
        ) 

public class RunnerTest extends AbstractTestNGCucumberTests {
	
//	@AfterClass
//	public static void setup()
//	{
//	Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
//	//Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
//	Reporter.setSystemInfo("User Name", "AJ");
//	Reporter.setSystemInfo("Application Name", "Test App ");
//	Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
//	Reporter.setSystemInfo("Environment", "Production");
//	Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
//	}

}