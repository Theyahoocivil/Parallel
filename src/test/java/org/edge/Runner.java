package org.edge;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Edge.feature",
glue="org.login",
dryRun = false,
plugin={"json:C:\\Users\\thiyagarajan\\Desktop\\workspace\\ParallelExecution\\target\\Parallel.json"})
public class Runner {

}
