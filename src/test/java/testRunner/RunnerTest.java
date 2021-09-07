package testRunner;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.vimalselvam.cucumber.listener.Reporter;

import io.cucumber.java.After;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(features = { "src/test/resources/features" }, 
		glue = {"stepDefns" },
		monochrome = true, 
		strict = true, 
		tags = { "@login" }, 
		plugin = { "pretty","html:target/site/cucumber-pretty", "json:target/cucumber/cucumber.json" })

public class RunnerTest extends AbstractTestNGCucumberTests {

	}

