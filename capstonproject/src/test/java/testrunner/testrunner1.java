package testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
	 features="src/test/resources/feature/sell.feature",glue= {"stepdefinations"},monochrome=true,
	 plugin= {"pretty","html:target/HtmlReports.html","json:target/JSONReports.xml"}
	 )
		

public class testrunner1 extends AbstractTestNGCucumberTests { 

}






