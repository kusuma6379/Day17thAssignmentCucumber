package TestRunnerDay17Assignment;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features= {"C:\\Users\\Administrator\\Documents\\workspace-spring-tool-suite-4-4.28.0.RELEASE\\Cucumberdemo\\LoginDemo\\Day17thAssignment.feature"},
		glue= {"Stepdefinition_Day17Assignment"}		
		)

public class TestRunnerSubmitForm extends AbstractTestNGCucumberTests {
}
