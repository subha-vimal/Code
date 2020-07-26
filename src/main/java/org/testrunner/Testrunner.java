package org.testrunner;

import org.junit.runner.RunWith;
import org.junit.runner.Runner;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.step")
public class Testrunner
{

}
