package com.qa.auto_prac;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources1",
        plugin = {"html:target/cucumber-html-report",
                   "pretty:target/cucumber-pretty.txt",
                    "json:target/cucumber.json",
                    "usage:target/cucumber-usage.json",
                    "junit:target/cucumber-results.xml"
        }

)
public class RunCukesTest {
}
