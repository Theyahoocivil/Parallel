package org.parallel;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import io.cucumber.core.runner.Runner;

@RunWith(Suite.class)
@SuiteClasses({org.edge.Runner.class,org.login.RunnerClass.class})
public class ParallelExecution {

}
