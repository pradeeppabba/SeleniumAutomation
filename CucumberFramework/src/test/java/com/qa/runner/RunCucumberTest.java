package com.qa.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/FrameWorkFeature/",
glue = {"","com.qa.base"},
tags = "@loginFunc",
plugin = {"pretty","junit:target/JunitReports/report.xml",
		   "json:target/JSONReports/report.json",
		   "html:target/HtmlReports"}
)


public class RunCucumberTest {

}
