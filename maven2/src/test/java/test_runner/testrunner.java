package test_runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
	 features="src/test/resources/feature/times.feature",glue= {"stepdefinations"},monochrome=true,
	 plugin= {"pretty","html:target/HtmlReports.html","json:target/JSONReports.xml"}
	 )
		

public class testrunner extends AbstractTestNGCucumberTests { 

}




