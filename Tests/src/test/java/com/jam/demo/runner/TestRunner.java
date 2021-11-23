package com.jam.demo.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.jam.demo.steps"},
        plugin = {"pretty",
                "html:results/cucumber-reports/html_report.html",
                "json:results/cucumber-reports/cucumber.json",
                "junit:results/cucumber-reports/junit_report.xml"}
)
public class TestRunner {

}


