package com.seyo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

  @RunWith(Cucumber.class)
  @CucumberOptions(
          plugin = {"json:target/cucumber1.json", "html:target/default-cucumber-reports", "rerun:target/rerun.txt"},
          features = {"src/test/resources/features"},
          glue = {"com/seyo/stepDefs"},
          tags = "",
          dryRun = true

  )


  public class cukesRunner {

}
