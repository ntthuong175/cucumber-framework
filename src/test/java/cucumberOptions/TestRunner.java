package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//Đường dẫn tới file features
@CucumberOptions(features = "src/test/java/pioneer/features",

// Tìm đến package step Definitions
glue = "pioneer.stepDefinitions",
monochrome = true, 
plugin = { "pretty", "html:target/site/cucumber-report-default",
		"json:target/site/cucumber.json" }, 
//dryRun = false, 
snippets = SnippetType.UNDERSCORE,
tags = { "@login" })

public class TestRunner {

}

