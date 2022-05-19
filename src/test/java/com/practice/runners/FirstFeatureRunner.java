package com.practice.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/java/com/practice/features",
		glue = "com.practice.stepdefinitions",
		monochrome = true, //monochrome display the console output in the readable format
		dryRun = false, //dryRun if true, means cucumber will check all the steps mentioned 
		//in the feature file has corresponding code in the step definition file or not
		plugin = {"pretty","html:Reports/HtmlReport.html",
				  "json:Reports/jsonReport.json",
				  "junit:Reports/junitReport.xml"}
		//plugin is used to mention different formatting options for output reports
		//pretty -> prints the gherkin source with additional colors and stack traces for errors
		
		
		
		)
public class FirstFeatureRunner {

}
