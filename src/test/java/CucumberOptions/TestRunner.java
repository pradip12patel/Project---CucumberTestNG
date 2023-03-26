package CucumberOptions;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
  features="C:\\Users\\LENOVO\\eclipse-workspace\\Project8_Cucumber\\src\\test\\java\\FeatureFiles\\login.feature",
  glue="StepDefination",
  plugin={"pretty","html:target/HtmlReports.html",
					"json:target/JSONReports/report.json",
					"junit:target/junitReports/Reports.xml"},
  tags="@regression"
  
       )

public class TestRunner extends AbstractTestNGCucumberTests{
	
	
	
  }
