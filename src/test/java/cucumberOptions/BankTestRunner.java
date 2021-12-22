package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//Đường dẫn tới file features
@CucumberOptions(features = "src\\test\\java\\bankguru\\features",

// Tìm đến package step Definitions
glue = "bank.stepDefinitions",
monochrome = true, 
plugin = { "pretty", "html:target/site/cucumber-report-default",
		"json:target/site/cucumber.json" }, 
//dryRun = true, 
snippets = SnippetType.CAMELCASE,
tags = { "@register_login" })

public class BankTestRunner {

}

