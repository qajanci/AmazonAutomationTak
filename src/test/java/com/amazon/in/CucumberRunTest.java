package com.amazon.in;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = ".", dryRun = false, format={"json:target/cucumber.json", "html:target/cucumber"})

public class CucumberRunTest {
}
