package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//Featurefile",glue="com.stepdefinition",monochrome=true,dryRun=false)
public class TestRunner {

}
